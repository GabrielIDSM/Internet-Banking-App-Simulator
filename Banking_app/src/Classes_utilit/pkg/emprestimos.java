package Classes_utilit.pkg;

import java.math.BigDecimal;
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
            System.out.println("Dividendo: "+Double.toString(termo1));
            System.out.println("Divisor: "+Double.toString(termo2));
            //Determinar o valor da parcela
            double valorParAux = termo1 * valorInicial.doubleValue() / termo2;
            //Determinar valor final
            double valorFinalAux = 0.0;
            for(int i = 0; i < nDeParcelas; i++){
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
    public static String retornaPrimeiraDataString(){
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
        if(data[1] == 11){
            data[1] = 0;
            data[2]++;
        }
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
    
    public static Calendar retornaPrimeiraDataCalendar(){
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
        if(data[1] == 11){
            data[1] = 0;
            data[2]++;
        }
        auxCalendar.set(data[2], data[1], data[0]);
        return auxCalendar;
    }
    public static boolean criaNovoEmprestimo(String conta, BigDecimal[] valores, String valorEmp, int nDeParcelas){
        try{
            String path = "Arquivos\\DadosContas\\"+conta+"\\Emprestimo.txt";
            leituraEscrita.Reescrita(path, valorEmp); //Valor do Empréstimo
            leituraEscrita.Escrita(path, "\n" + valores[0].toPlainString()); //Valor das parcelas
            leituraEscrita.Escrita(path, "\n" + valores[1].toPlainString()); //Valor total
            leituraEscrita.Escrita(path, "\n" + Integer.toString(nDeParcelas)); //Número de parcelas
            //Acrestar a data do proximo pagamento
            Calendar dataProx = retornaPrimeiraDataCalendar();
            leituraEscrita.Escrita(path, "\n" + Integer.toString(dataProx.get(Calendar.DAY_OF_MONTH)));
            leituraEscrita.Escrita(path, "\n" + Integer.toString(dataProx.get(Calendar.MONTH)));
            leituraEscrita.Escrita(path, "\n" + Integer.toString(dataProx.get(Calendar.YEAR)));
            return true;
        }catch(Exception e){
            return false;                
        }
    }
    public static String transformaEmData(int[] data){
        String resultado = "";
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
}
