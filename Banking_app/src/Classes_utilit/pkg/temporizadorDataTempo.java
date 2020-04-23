package Classes_utilit.pkg;
import java.util.*;
import java.text.*;
public abstract class temporizadorDataTempo {
    //Atributos
    //Não possui construtor
    //Métodos 
    private int[] getDataAtualInt(){
        int[] data = new int[3];
        Calendar auxCalendar = Calendar.getInstance();
        data[0] = auxCalendar.get(Calendar.DAY_OF_MONTH);
        data[1] = auxCalendar.get(Calendar.MONTH);
        data[2] = auxCalendar.get(Calendar.YEAR);
        return data;
    }
    private Calendar getDataAtualCalendar(){
        return Calendar.getInstance();
    }
    private boolean verificaDuasDatas(int[] data1, int[] data2){
        if(data1[0] == data2[0] && data1[1] == data2[1] && data1[2] == data2[2]){
            return true;
        }else{
            return false;
        }
    }
    private boolean verificaDuasDatas(Calendar data1, Calendar data2){
        if(data1.get(Calendar.DAY_OF_MONTH) == data2.get(Calendar.DAY_OF_MONTH)
                && data1.get(Calendar.MONTH) == data2.get(Calendar.MONTH)
                && data1.get(Calendar.YEAR) == data2.get(Calendar.YEAR)){
            return true;
        }else{
            return false;
        }
    }
    private boolean verificaDuasDatas(Calendar data1, int[] data2){
        if(data1.get(Calendar.DAY_OF_MONTH) == data2[0]
                && data1.get(Calendar.MONTH) == data2[1]
                && data1.get(Calendar.YEAR) == data2[2]){
            return true;
        }else{
            return false;
        }
    }
    public static void exibeDataAtual(){
        int[] data = new int[3];
        Calendar auxCalendar = Calendar.getInstance();
        data[0] = auxCalendar.get(Calendar.DAY_OF_MONTH);
        data[1] = auxCalendar.get(Calendar.MONTH);
        data[2] = auxCalendar.get(Calendar.YEAR);
        System.out.println("DATA ATUAL : "+data[0]+"/"+(data[1]+1)+"/"+data[2]);
    }
    public static String retornaStringDataAtual(){
        int[] data = new int[3];
        String resultado = "";
        Calendar auxCalendar = Calendar.getInstance();
        data[0] = auxCalendar.get(Calendar.DAY_OF_MONTH);
        data[1] = auxCalendar.get(Calendar.MONTH);
        data[2] = auxCalendar.get(Calendar.YEAR);
        if(data[0] < 10){
            resultado += "0" + data[0] + "/";
        }else{
            resultado += data[0] + "/";
        }
        if(data[1] < 9){
            resultado += "0" + (data[1]+1) + "/";
        }else{
            resultado += (data[1]+1) + "/";
        }
        resultado += data[2];
        return resultado;
    }
    public static void setDataParaHoje(){
        Calendar C = Calendar.getInstance();
        leituraEscrita.Reescrita("Arquivos\\Data.txt", Integer.toString(C.get(Calendar.DAY_OF_MONTH))+"\n");
        leituraEscrita.Escrita("Arquivos\\Data.txt", Integer.toString(C.get(Calendar.MONTH))+"\n");
        leituraEscrita.Escrita("Arquivos\\Data.txt", Integer.toString(C.get(Calendar.YEAR)));
    }
    public static int[] getDataSistema(){
        int[] dataSistema = new int[3];
        String[] auxDataSistema = leituraEscrita.Leitura("Arquivos\\Data.txt");
        for(int i = 0; i < 3; i++){
            dataSistema[i] = Integer.parseInt(auxDataSistema[i]);
        }
        return dataSistema;
    }
    public static String proximoPagamento(String contaE, String contaF){
        String dataProximoPagamento = "";
        int[] auxInt = new int[3];
        String[] auxData = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+contaE+"\\FuncionariosDados\\"
            +contaF+"\\DataProxPagamento.txt");
        auxInt[0] = Integer.parseInt(auxData[0]);
        auxInt[1] = Integer.parseInt(auxData[1]);
        auxInt[2] = Integer.parseInt(auxData[2]);
        if(auxInt[0] < 10){
            dataProximoPagamento += "0" + auxInt[0] + "/";
        }else{
            dataProximoPagamento += auxInt[0] + "/";
        }
        if(auxInt[1] < 9){
            dataProximoPagamento += "0" + (auxInt[1]+1) + "/";
        }else{
            dataProximoPagamento += (auxInt[1]+1) + "/";
        }
        dataProximoPagamento += auxInt[2];
        return dataProximoPagamento;
    }
    public static boolean dataJaPassou_EstamosNaData(String[] data){
        Calendar dataHoje = Calendar.getInstance();
        //Cria um array int com a data de hoje
        int[] dataHojeArr = new int[3];
        dataHojeArr[0] = dataHoje.get(Calendar.DAY_OF_MONTH);
        dataHojeArr[1] = dataHoje.get(Calendar.MONTH);
        dataHojeArr[2] = dataHoje.get(Calendar.YEAR);
        //Cria um array int com a data do pagamento
        int[] dataPagamentoArr = new int[3];
        dataPagamentoArr[0] = Integer.parseInt(data[0]);
        dataPagamentoArr[1] = Integer.parseInt(data[1]);
        dataPagamentoArr[2] = Integer.parseInt(data[2]);
        //Efetua comparações
        if(dataHojeArr[2] > dataPagamentoArr[2]){
            return true;
        }else if(dataHojeArr[2] == dataPagamentoArr[2]){
            if (dataHojeArr[1] > dataPagamentoArr[1]) {
                return true;
            } else if (dataHojeArr[1] == dataPagamentoArr[1]) {
                if (dataHojeArr[0] >= dataPagamentoArr[0]) {
                    return true;
                }else{
                    return false;
                }
            } else {
                return false;
            }
        }else{
            return false;
        }      
    }
}
