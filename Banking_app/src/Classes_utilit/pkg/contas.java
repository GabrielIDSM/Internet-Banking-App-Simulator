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
}
