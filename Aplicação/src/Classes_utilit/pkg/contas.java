package Classes_utilit.pkg;


public abstract class contas {
    public static String[] obtemContas(int opcao){
        String[] auxLeitura;
        String[] contas;
        switch (opcao) {
            case 0: //Contas comuns
                auxLeitura = leituraEscrita.Leitura("Arquivos\\ContasComuns.txt");
                contas = new String[auxLeitura.length / 2];
                for (int i = 0, j = 0; j < auxLeitura.length; i++, j += 2) {
                    contas[i] = auxLeitura[j];
                }
                return contas;
            case 1: //Contas empresas
                auxLeitura = leituraEscrita.Leitura("Arquivos\\ContasEmpresas.txt");
                contas = new String[auxLeitura.length / 2];
                for (int i = 0, j = 0; j < auxLeitura.length; i++, j += 2) {
                    contas[i] = auxLeitura[j];
                }
                return contas;
            default:
                return null;
        }
    }
    public static String preencheComZero(int conta){
        String contaFinal = "";
        String auxConta = Integer.toString(conta);
        char[] auxContaC = auxConta.toCharArray();
        int nDeChar = auxContaC.length;
        for(int i = 0; i < 6 - nDeChar; i++){
            contaFinal += "0";
        }
        contaFinal += auxConta;
        return contaFinal;
    }
    public static String[] obtemTodasAsContas(){
        String[] contasComuns = contas.obtemContas(0);
        String[] contasEmpresas = contas.obtemContas(0);
        String[] contas = new String[contasComuns.length + contasEmpresas.length];
        for (int i = 0; i < contasComuns.length; i++ ){
            contas[i] = contasComuns[i];
        }
        for (int i = 0, j = contasComuns.length; i < contasEmpresas.length; i++, j++) {
            contas[j] = contasEmpresas[i];
        }
        return contas;
    }
}
