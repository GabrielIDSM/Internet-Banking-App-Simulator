package Classes_utilit.pkg;

import java.math.BigDecimal;
       

public class pagamentos {
    public static boolean efetuaPagamento(String contaAt, String contaPa, String Valor, boolean qualData){
        boolean validade = true;
        String[] aux;
        try {
            //Define o valor Valor
            BigDecimal valor = new BigDecimal(Valor);
            //Diminui saldo da conta Ativa
            aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +contaAt+"\\Saldo.txt");
            BigDecimal auxNovoSaldo = new BigDecimal(aux[0]);
            if(auxNovoSaldo.doubleValue() < valor.doubleValue()) throw new Exception();
            auxNovoSaldo = auxNovoSaldo.subtract(valor);
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\"
        +contaAt+"\\Saldo.txt", auxNovoSaldo.toPlainString());
            //Aumenta saldo da conta Passiva
            aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +contaPa+"\\Saldo.txt");
            auxNovoSaldo = new BigDecimal(aux[0]);
            auxNovoSaldo = auxNovoSaldo.add(valor);
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\"
        +contaPa+"\\Saldo.txt", auxNovoSaldo.toPlainString());
            //Adiciona operação no Extrato:
            String data = temporizadorDataTempo.retornaStringDataAtual();
            String dataPagamento = temporizadorDataTempo.proximoPagamento(contaAt, contaPa);
            //Conta Ativa
            if (qualData) {
                leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                        + contaAt + "\\Extrato.txt", "\n" + "Pagamento efetuado! (" + dataPagamento + ")");
            } else {
                leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                        + contaAt + "\\Extrato.txt", "\n" + "Pagamento efetuado! (" + data + ")");
            }
            leituraEscrita.Escrita("Arquivos\\DadosContas\\"
        +contaAt+"\\Extrato.txt","\n"+stringSaldo.retornaStringSaldo(valor.toPlainString())+ " para "+contaPa);
            //Conta Passiva
            if (qualData) {
                leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                        + contaPa + "\\Extrato.txt", "\n" + "Pagamento recebido! (" + dataPagamento + ")");
            } else {
                leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                        + contaPa + "\\Extrato.txt", "\n" + "Pagamento recebido! (" + data + ")");
            }
            leituraEscrita.Escrita("Arquivos\\DadosContas\\"
        +contaPa+"\\Extrato.txt","\n"+stringSaldo.retornaStringSaldo(valor.toPlainString())+ " de "+contaAt);
            //Modifica data de pagamento
            System.out.println("modificaDataPagamento IN");
            modificaDataPagamento(contaAt, contaPa);
            System.out.println("modificaDataPagamento FIM");
        } catch (Exception e) {
            return false;
        }
        return validade;
    }
    private static void modificaDataPagamento(String contaAt, String contaPa){
        String[] aux;
        aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+contaAt+"\\FuncionariosDados\\"
            +contaPa+"\\DataProxPagamento.txt");
        int dia = Integer.parseInt(aux[0]);
        int mes = Integer.parseInt(aux[1]);
        int ano = Integer.parseInt(aux[2]);
        if(mes == 11){
            mes = 0;
            ano++;
        }else{
            mes++;
        }
        leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+contaAt+"\\FuncionariosDados\\"
            +contaPa+"\\DataProxPagamento.txt", Integer.toString(dia));
        leituraEscrita.Escrita("Arquivos\\DadosContas\\"+contaAt+"\\FuncionariosDados\\"
            +contaPa+"\\DataProxPagamento.txt", "\n"+Integer.toString(mes));
        leituraEscrita.Escrita("Arquivos\\DadosContas\\"+contaAt+"\\FuncionariosDados\\"
            +contaPa+"\\DataProxPagamento.txt", "\n"+Integer.toString(ano));
    }
    public static void PagamentoAutomatico(String contaEmpresa) {
        String[] leituraAux;
        //Criar uma lista com os funcionários
        leituraAux = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + contaEmpresa
                + "\\Funcionarios.txt");
        if (leituraAux != null) { // Verifica se há funcionários 
            String[] funcionarios = leituraAux;
            //Criar uma lista com os salários
            String[] salarios = new String[funcionarios.length];
            for (int i = 0; i < funcionarios.length; i++) {
                leituraAux = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + contaEmpresa + "\\FuncionariosDados\\"
                        + funcionarios[i] + "\\Salario.txt");
                salarios[i] = leituraAux[0];
            }
            //Chama a função para fazer os pagamentos
            boolean verifica = true;
            for (int i = 0; i < funcionarios.length; i++) {
                while (verifica) {
                    leituraAux = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + contaEmpresa + "\\FuncionariosDados\\"
                            + funcionarios[i] + "\\DataProxPagamento.txt");
                    verifica = temporizadorDataTempo.dataJaPassou_EstamosNaData(leituraAux);
                    System.out.println("Verifica: "+verifica);
                    if (verifica) {
                        pagamentos.efetuaPagamento(contaEmpresa, funcionarios[i], salarios[i], true);
                        System.out.println("Pagamento efetuado : Sistema Auto");
                        System.out.println("Para :"+funcionarios[i]);
                    }
                }
                verifica = true;
            }
        }
    }
}
