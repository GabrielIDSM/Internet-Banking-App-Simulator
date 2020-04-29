package Classes_utilit.pkg;

import java.math.BigDecimal;
import java.util.Calendar;

public abstract class modificarPoupanca {

    public static boolean criaNovaPoupanca(String conta, int tipo, BigDecimal valor) {
        String[] auxLeitura;
        try {
            int meses = 0;
            switch (tipo) {
                case 0:
                    meses = 3;
                    break;
                case 1:
                    meses = 6;
                    break;
                case 2:
                    meses = 12;
                    break;
                default:
                    break;
            }
            meses *= 30;
            int[] dataHoje = temporizadorDataTempo.getDataAtualInt();
            //Verifica se existe algo no arquivo e grava a primeira linha
            boolean temPoupanca = false;
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt");
            if (auxLeitura != null) {
                if (!auxLeitura[0].equals("")) {
                    temPoupanca = true;
                }
            }
            if (temPoupanca) {
                leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Integer.toString(meses));
            } else {
                leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", Integer.toString(meses));
            }
            //Gravar o valor
            leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + valor.toPlainString());
            //Grava o tipo
            leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Integer.toString(tipo));
            //Gravar data inicial
            for (int i = 0; i < 3; i++) {
                leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Integer.toString(dataHoje[i]));
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean acrescentaRendimento(String conta) {
        //Essa função não pode receber uma conta sem poupança
        String[] auxLeitura;
        try {
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt");
            //Verificando número total de poupancas
            int nDePoupancas = auxLeitura.length / 6;
            //Criando Arrays
            int[] diasAPagar = new int[nDePoupancas];
            BigDecimal[] valores = new BigDecimal[nDePoupancas];
            int[] tiposDePoupanca = new int[nDePoupancas];
            int[] dataDia = new int[nDePoupancas];
            int[] dataMes = new int[nDePoupancas];
            int[] dataAno = new int[nDePoupancas];
            //Instanciando Arrays
            for (int i = 0, j = 0; i < nDePoupancas; i++, j += 6) {
                diasAPagar[i] = Integer.parseInt(auxLeitura[j]);
                valores[i] = new BigDecimal(auxLeitura[j + 1]);
                tiposDePoupanca[i] = Integer.parseInt(auxLeitura[j + 2]);
                dataDia[i] = Integer.parseInt(auxLeitura[j + 3]);
                dataMes[i] = Integer.parseInt(auxLeitura[j + 4]);
                dataAno[i] = Integer.parseInt(auxLeitura[j + 5]);
            }
            //Iniciando um for para calcular cada uma das poupancas
            Calendar Hoje = Calendar.getInstance();
            for (int i = 0; i < nDePoupancas; i++) {
                //Criar uma Classe Calendar com a data presente na poupanca
                Calendar dataPou = Calendar.getInstance();
                dataPou.set(dataAno[i], dataMes[i], dataDia[i]);
                int diferenca = DiferencaEntreDias(dataPou, Hoje);
                //Verificar se existe diferença entre as datas
                if (diferenca > 0) {
                    //Determina a taxa de rendimento
                    BigDecimal taxa;
                    if (tiposDePoupanca[i] == 0) {
                        taxa = new BigDecimal("0.0166296");
                    } else if (tiposDePoupanca[i] == 1) {
                        taxa = new BigDecimal("0.0249147");
                    } else {
                        taxa = new BigDecimal("0.0364780");
                    }
                    //Verificar se a diferença já superou o número de pagamentos que restam
                    if (diferenca >= diasAPagar[i]) {
                        diferenca = diasAPagar[i];
                    }
                    //Efetuar o calculo sobre o valor
                    valores[i] = calcularAumento(diferenca, taxa, valores[i]);
                    if (modificaArquivosPoupanca(conta, valores[i], diasAPagar[i] - diferenca, Hoje, i)) {
                        System.out.println("Poupança alterada com sucesso!");
                    } else {
                        throw new Exception();
                    }
                }
            }
            //Atualizar Arrays
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt");
            for (int i = 0, j = 0; i < nDePoupancas; i++, j += 6) {
                diasAPagar[i] = Integer.parseInt(auxLeitura[j]);
                valores[i] = new BigDecimal(auxLeitura[j + 1]);
                tiposDePoupanca[i] = Integer.parseInt(auxLeitura[j + 2]);
                dataDia[i] = Integer.parseInt(auxLeitura[j + 3]);
                dataMes[i] = Integer.parseInt(auxLeitura[j + 4]);
                dataAno[i] = Integer.parseInt(auxLeitura[j + 5]);
            }
            //Verificar se uma poupança acabou e finalizar
            for (int j = 0; j < auxLeitura.length; j += 6) {
                if(auxLeitura[j].equals("0")){
                    finalizaPoupanca(conta, j);
                }
            }
            return true;
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    private static int DiferencaEntreDias(Calendar DataInicial, Calendar DataFinal) {
        int diferenca = 0;
        try {
            //Verificar se os dias são iguais
            if (DataInicial.get(Calendar.DAY_OF_MONTH) == DataFinal.get(Calendar.DAY_OF_MONTH)
                    && DataInicial.get(Calendar.MONTH) == DataFinal.get(Calendar.MONTH)
                    && DataInicial.get(Calendar.YEAR) == DataFinal.get(Calendar.YEAR)) {
                return 0;
            } else {
                //Verifica se estamos no mesmo ano
                if (DataInicial.get(Calendar.YEAR) == DataFinal.get(Calendar.YEAR)) {
                    diferenca = DataFinal.get(Calendar.DAY_OF_YEAR) - DataInicial.get(Calendar.DAY_OF_YEAR);
                } else {
                    //Verificar se são anos subsequentes
                    if (DataInicial.get(Calendar.YEAR) == DataFinal.get(Calendar.YEAR) - 1) {
                        //Verificar contagem até 31 de Dezembro
                        Calendar dataAuxDez = Calendar.getInstance();
                        dataAuxDez.set(DataInicial.get(Calendar.YEAR), 11, 31);
                        diferenca += dataAuxDez.get(Calendar.DAY_OF_YEAR) - DataInicial.get(Calendar.DAY_OF_YEAR);
                        //Verifica contagem a partir de 1 de Janeiro
                        diferenca += DataFinal.get(Calendar.DAY_OF_YEAR);
                    } else {
                        //Como o limite de poupanca sâo 12 meses, basta retornar 
                        //O Valor de um ano completo
                        return 365;
                    }
                }
            }
            return diferenca;
        } catch (Exception e) {
            return -1;
        }
    }

    private static BigDecimal calcularAumento(int nDeDia, BigDecimal taxa, BigDecimal valor) {
        for (int i = 0; i < nDeDia; i++) {
            valor = valor.multiply(taxa);
        }
        return valor;
    }

    private static boolean finalizaPoupanca(String conta, int index) {
        String[] auxLeitura;
        try {
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt");
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "");
            for (int i = 0; i < auxLeitura.length; i += 6) {
                if (i == 0) {
                    if (i != index){
                        leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", auxLeitura[i]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 1]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 2]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 3]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 4]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 5]);
                    }
                } else {
                    if (i != index) {
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 1]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 2]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 3]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 4]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 5]);
                    }
                }
            }
            //Acrescentar valor ao saldo
            BigDecimal valor = new BigDecimal(auxLeitura[index + 1]);
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Saldo.txt");
            BigDecimal saldo = new BigDecimal(auxLeitura[0]);
            saldo = saldo.add(valor);
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+conta+"\\Saldo.txt", saldo.toPlainString());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean modificaArquivosPoupanca(String conta, BigDecimal valor, int dias, Calendar Hoje, int QualPoupanca) {
        int index = 6 * QualPoupanca;
        String[] auxLeitura;
        try {
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt");
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "");
            for (int i = 0; i < auxLeitura.length; i += 6) {
                if (i == 0) {
                    if (i == index) {
                        leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", Integer.toString(dias));
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + valor.toPlainString());
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 2]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Hoje.get(Calendar.DAY_OF_MONTH));
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Hoje.get(Calendar.MONTH));
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Hoje.get(Calendar.YEAR));
                    } else {
                        leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", auxLeitura[i]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 1]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 2]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 3]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 4]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 5]);
                    }
                } else {
                    if (i == index) {
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Integer.toString(dias));
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + valor.toPlainString());
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 2]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Hoje.get(Calendar.DAY_OF_MONTH));
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Hoje.get(Calendar.MONTH));
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + Hoje.get(Calendar.YEAR));
                    } else {
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 1]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 2]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 3]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 4]);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + conta + "\\Poupanca.txt", "\n" + auxLeitura[i + 5]);
                    }
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
