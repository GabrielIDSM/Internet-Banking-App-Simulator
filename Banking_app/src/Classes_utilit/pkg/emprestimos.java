package Classes_utilit.pkg;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Calendar;

/**
 *
 * @author Gabri
 */
public class emprestimos {

    public static boolean modificaLimiteEmprestimo(String conta, BigDecimal valor) {
        try {
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + conta + "\\LimiteEmprestimo.txt", valor.toPlainString());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static BigDecimal[] calculaValorTotalEParcelas(BigDecimal valorInicial, int nDeParcelas) {
        BigDecimal[] valores = new BigDecimal[2];
        try {
            //Calcular valor das parcelas
            BigDecimal taxa = new BigDecimal("0.06770897"); // taxa fixa de 6,77%
            //Determinar os dois termos
            double termo1 = 1.0 + taxa.doubleValue();
            double termo2 = -1.0;
            double termo1inical = termo1;
            for (int i = 1; i < nDeParcelas; i++) {
                termo1 *= termo1inical;
            }
            termo2 += termo1;
            termo1 *= taxa.doubleValue();
            System.out.println("Dividendo: " + Double.toString(termo1));
            System.out.println("Divisor: " + Double.toString(termo2));
            //Determinar o valor da parcela
            double valorParAux = termo1 * valorInicial.doubleValue() / termo2;
            //Determinar valor final
            double valorFinalAux = 0.0;
            for (int i = 0; i < nDeParcelas; i++) {
                valorFinalAux += valorParAux;
            }
            //Atribuir ao array
            valores[0] = new BigDecimal(Double.toString(valorParAux));
            valores[1] = new BigDecimal(Double.toString(valorFinalAux));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return valores;
    }

    public static String retornaPrimeiraDataString() {
        int[] data = new int[3];
        String resultado = "";
        Calendar auxCalendar = Calendar.getInstance();
        data[0] = auxCalendar.get(Calendar.DAY_OF_MONTH);
        data[1] = auxCalendar.get(Calendar.MONTH);
        data[2] = auxCalendar.get(Calendar.YEAR);
        if (data[0] > 28) {
            data[0] = 1;
            data[1]++;
            if (data[1] == 11) {
                data[1] = 0;
                data[2]++;
            }
        }
        data[1]++;
        if (data[1] == 11) {
            data[1] = 0;
            data[2]++;
        }
        if (data[0] < 10) {
            resultado += "0" + data[0] + "/";
        } else {
            resultado += data[0] + "/";
        }
        if (data[1] < 9) {
            resultado += "0" + (data[1] + 1) + "/";
        } else {
            resultado += (data[1] + 1) + "/";
        }
        resultado += data[2];
        return resultado;
    }

    public static Calendar retornaPrimeiraDataCalendar() {
        int[] data = new int[3];
        String resultado = "";
        Calendar auxCalendar = Calendar.getInstance();
        data[0] = auxCalendar.get(Calendar.DAY_OF_MONTH);
        data[1] = auxCalendar.get(Calendar.MONTH);
        data[2] = auxCalendar.get(Calendar.YEAR);
        if (data[0] > 28) {
            data[0] = 1;
            data[1]++;
            if (data[1] == 11) {
                data[1] = 0;
                data[2]++;
            }
        }
        data[1]++;
        if (data[1] == 11) {
            data[1] = 0;
            data[2]++;
        }
        auxCalendar.set(data[2], data[1], data[0]);
        return auxCalendar;
    }

    public static boolean criaNovoEmprestimo(String conta, BigDecimal[] valores, String valorEmp, int nDeParcelas) {
        try {
            String path = "Arquivos\\DadosContas\\" + conta + "\\Emprestimo.txt";
            leituraEscrita.Reescrita(path, valorEmp); //Valor do Empréstimo
            leituraEscrita.Escrita(path, "\n" + valores[0].toPlainString()); //Valor das parcelas
            leituraEscrita.Escrita(path, "\n" + valores[1].toPlainString()); //Valor total
            leituraEscrita.Escrita(path, "\n" + Integer.toString(nDeParcelas)); //Número de parcelas
            //Add a data do proximo pagamento
            Calendar dataProx = retornaPrimeiraDataCalendar();
            leituraEscrita.Escrita(path, "\n" + Integer.toString(dataProx.get(Calendar.DAY_OF_MONTH)));
            leituraEscrita.Escrita(path, "\n" + Integer.toString(dataProx.get(Calendar.MONTH)));
            leituraEscrita.Escrita(path, "\n" + Integer.toString(dataProx.get(Calendar.YEAR)));
            //Modifica saldo
            String[] auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + conta + "\\Saldo.txt");
            BigDecimal novoSaldo = new BigDecimal(auxLeitura[0]);
            novoSaldo = novoSaldo.add(new BigDecimal(valorEmp));
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + conta + "\\Saldo.txt", novoSaldo.toPlainString());
            //Adiciona ao Extrato
            leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Extrato.txt", "\n\nEmpréstimo concedido (" + temporizadorDataTempo.retornaStringDataAtual() + ")");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String transformaEmData(int[] data) {
        String resultado = "";
        if (data[0] < 10) {
            resultado += "0" + data[0] + "/";
        } else {
            resultado += data[0] + "/";
        }
        if (data[1] < 9) {
            resultado += "0" + (data[1] + 1) + "/";
        } else {
            resultado += (data[1] + 1) + "/";
        }
        resultado += data[2];
        return resultado;
    }

    public static boolean pagarEmprestimo(String conta, int qualDia) {
        String[] auxLeitura;
        //qualDia == 0 : Data do dia que deve ser pago
        //qualDia == 1 : Data de hoje
        try {
            //Obtém valores
            String path = "Arquivos\\DadosContas\\" + conta;
            auxLeitura = leituraEscrita.Leitura(path + "\\Saldo.txt");
            BigDecimal saldoBD = new BigDecimal(auxLeitura[0]); // Obtem o saldo da conta
            auxLeitura = leituraEscrita.Leitura(path + "\\Emprestimo.txt");
            BigDecimal parcela = new BigDecimal(auxLeitura[1]); // Valor da Parcela
            int nDeParcelas = Integer.parseInt(auxLeitura[3]); //Número de parcelas restantes
            //Subtrai o valor da conta
            saldoBD = saldoBD.subtract(parcela);
            saldoBD = saldoBD.setScale(15, RoundingMode.FLOOR);
            //Diminui o número de parcelas
            nDeParcelas--;
            //Substitui os arquivos
            //Substitui o saldo
            leituraEscrita.Reescrita(path + "\\Saldo.txt", saldoBD.toPlainString());
            //Modifica o txt Empréstimo
            path = "Arquivos\\DadosContas\\" + conta + "\\Emprestimo.txt";
            //Obtem data do pagamento
            int[] auxData = new int[3];
            auxData[0] = Integer.parseInt(auxLeitura[4]);
            auxData[1] = Integer.parseInt(auxLeitura[5]);
            auxData[2] = Integer.parseInt(auxLeitura[6]);
            String dataPagamento = transformaEmData(auxData);
            //Obtem valor das parcelas
            String valorParcelas = stringSaldo.retornaStringSaldo(auxLeitura[1]);
            if (nDeParcelas == 0) {
                leituraEscrita.Reescrita(path, "");
            } else {
                leituraEscrita.Reescrita(path, auxLeitura[0]); //Valor do Empréstimo
                leituraEscrita.Escrita(path, "\n" + auxLeitura[1]); //Valor das parcelas
                leituraEscrita.Escrita(path, "\n" + auxLeitura[2]); //Valor total
                leituraEscrita.Escrita(path, "\n" + Integer.toString(nDeParcelas)); //Número de parcelas
                String[] data = proximoPagamentoData(auxLeitura[4], auxLeitura[5], auxLeitura[6]);
                leituraEscrita.Escrita(path, "\n" + data[0]);
                leituraEscrita.Escrita(path, "\n" + data[1]);
                leituraEscrita.Escrita(path, "\n" + data[2]);
            }
            //Modifica o extrato
            path = "Arquivos\\DadosContas\\" + conta + "\\Extrato.txt";
            if(qualDia == 0){
                leituraEscrita.Escrita(path, "\n\nParcela do empréstimo paga\nautomaticamente");
                leituraEscrita.Escrita(path, "\nData: " + dataPagamento);
            }
            else{
                leituraEscrita.Escrita(path, "\n\nParcela do empréstimo paga");
                leituraEscrita.Escrita(path, "\nData: " + temporizadorDataTempo.retornaStringDataAtual());
            }
            leituraEscrita.Escrita(path, "\nValor: " + valorParcelas);
            return true;
        } catch (NumberFormatException e) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static String[] proximoPagamentoData(String dia, String mes, String ano) {
        int[] data = new int[3];
        String[] dataString = new String[3];
        data[0] = Integer.parseInt(dia);
        data[1] = Integer.parseInt(mes);
        data[2] = Integer.parseInt(ano);
        data[1]++;
        if (data[1] == 11) {
            data[1] = 0;
            data[2]++;
        }
        dataString[0] = Integer.toString(data[0]);
        dataString[1] = Integer.toString(data[1]);
        dataString[2] = Integer.toString(data[2]);
        return dataString;
    }

    public static boolean SistemaDePagamentoAutomatico() {
        try {
            String[] auxLeitura;
            String[] todasContas = contas.obtemTodasAsContas();
            for (String conta : todasContas) {
                String path = "Arquivos\\DadosContas\\" + conta + "\\Emprestimo.txt";
                //Verifica se tem empréstimo ativo
                auxLeitura = leituraEscrita.Leitura(path);
                boolean temEmp = false;
                String[] data = new String[3];
                if (auxLeitura != null) {
                    if (!auxLeitura[0].equals("")) {
                        temEmp = true;
                    }
                }
                if (temEmp) {
                    boolean dataPassou = false;
                    do {
                        auxLeitura = leituraEscrita.Leitura(path);
                        if (auxLeitura == null) {
                            break;
                        }
                        if (auxLeitura != null) {
                            if (auxLeitura[0].equals("")) {
                                break;
                            }
                        }
                        data[0] = auxLeitura[4];
                        data[1] = auxLeitura[5];
                        data[2] = auxLeitura[6];
                        dataPassou = temporizadorDataTempo.dataJaPassou_EstamosNaData(data);
                        if (dataPassou) {
                            emprestimos.pagarEmprestimo(conta, 0);
                        }
                    } while (dataPassou);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
