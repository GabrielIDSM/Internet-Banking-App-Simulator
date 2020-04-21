package Classes_utilit.pkg;

import java.math.BigDecimal;
       

public class pagamentos {
    public static boolean efetuaPagamento(String contaAt, String contaPa, String Valor){
        boolean validade = true;
        String[] aux;
        try {
            //Define o valor Valor
            BigDecimal valor = new BigDecimal(Valor);
            //Diminui saldo da conta Ativa
            aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +contaAt+"\\Saldo.txt");
            BigDecimal auxNovoSaldo = new BigDecimal(aux[0]);
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
            //Conta Ativa
            leituraEscrita.Escrita("Arquivos\\DadosContas\\"
        +contaAt+"\\Extrato.txt","\n"+"Pagamento efetuado! ("+data+")");
            leituraEscrita.Escrita("Arquivos\\DadosContas\\"
        +contaAt+"\\Extrato.txt","\n"+stringSaldo.retornaStringSaldo(valor.toPlainString())+ " para "+contaPa);
            //Conta Passiva
            leituraEscrita.Escrita("Arquivos\\DadosContas\\"
        +contaPa+"\\Extrato.txt","\n"+"Pagamento recebido! ("+data+")");
            leituraEscrita.Escrita("Arquivos\\DadosContas\\"
        +contaPa+"\\Extrato.txt","\n"+"R$" +stringSaldo.retornaStringSaldo(valor.toPlainString())+ " de "+contaAt);
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
}
