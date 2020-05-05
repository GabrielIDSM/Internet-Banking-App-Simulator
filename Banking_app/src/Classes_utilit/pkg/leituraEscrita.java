
package Classes_utilit.pkg;

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
            File file = new File(p);
            BufferedReader BR = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF-8"));
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
        }  catch (UnsupportedEncodingException e){
            System.out.println("Erro no BufferedReader");
            return null;
        } 
        //Instanciar Array com as linhas
        if(cont == 0) return null;
        resultado = new String[cont];
        //Adicionar linhas ao Array
        int i = 0;
        try {
            FileReader arq = new FileReader(p);
            File file = new File(p);
            BufferedReader BR = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF-8"));
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
        } catch (UnsupportedEncodingException e){
            System.out.println("Erro no BufferedReader");
            return null;
        }    
        return resultado;
    }
    //FIM
    //Escreve no arquivo IN
    public static void Escrita(String p, String conteudo){
        try{
            FileOutputStream ostream = new FileOutputStream(p, true);                         
            BufferedWriter PW = new BufferedWriter(new OutputStreamWriter(ostream, "UTF-8"));
            PW.append(conteudo);
            PW.close();
        }catch(IOException e){
            System.out.println("Não foi possível : Escrita");
        }
    }
    //FIM
    public static void Reescrita(String p, String conteudo){
        try{
            FileOutputStream ostream = new FileOutputStream(p);                         
            BufferedWriter PW = new BufferedWriter(new OutputStreamWriter(ostream, "UTF-8"));
            PW.write(conteudo);
            PW.close();
        }catch(IOException e){
            System.out.println("Não foi possível : Reescrita");
        }
    }
}
