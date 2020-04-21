
package Classes_utilit.pkg;

import java.nio.file.*;
import java.io.*;

/**
 *
 * @author Gabri
 */
public abstract class leituraEscrita {
    //Método para leitura de arquivos IN
    public static String[] Leitura(String p){
        String[] resultado;
        //Contar quantas linhas existem
        int cont = 0;
        try {
            FileReader arq = new FileReader(p);
            BufferedReader BR = new BufferedReader(arq);
            String linha = "";
            try {
                linha = BR.readLine();
                while (linha != null) {
                    cont++;
                    linha = BR.readLine();
                }
                arq.close();
            } catch (IOException ex) {
                System.out.println("Não foi possível : Leitura IOException");
                return null;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível : Leitura FileNotFoundException");
            return null;
        }
        //Instanciar Array com as linhas
        if(cont == 0) return null;
        resultado = new String[cont];
        //Adicionar linhas ao Array
        int i = 0;
        try {
            FileReader arq = new FileReader(p);
            BufferedReader BR = new BufferedReader(arq);
            try {
                while (i < cont) {
                    resultado[i] = BR.readLine();
                    i++;
                }
                arq.close();
            } catch (IOException ex) {
                System.out.println("Não foi possível : Leitura IOException");
                return null;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível : Leitura FileNotFoundException");
            return null;
        }        
        return resultado;
    }
    //FIM
    //Escreve no arquivo IN
    public static void Escrita(String p, String conteudo){
        try{
            FileWriter arq = new FileWriter(p, true);
            BufferedWriter PW = new BufferedWriter(arq);
            PW.append(conteudo);
            PW.close();
        }catch(IOException e){
            System.out.println("Não foi possível : Escrita");
        }
    }
    //FIM
    public static void Reescrita(String p, String conteudo){
        try{
            FileWriter arq = new FileWriter(p);
            arq.flush();
            arq.close();
            arq = null;
            arq = new FileWriter(p);
            PrintWriter PW = new PrintWriter(arq);
            PW.write(conteudo);
            PW.close();
        }catch(IOException e){
            System.out.println("Não foi possível : Escrita");
        }
    }
}
