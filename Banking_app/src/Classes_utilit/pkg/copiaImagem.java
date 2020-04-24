package Classes_utilit.pkg;

import java.io.*;
import java.nio.channels.FileChannel;

public class copiaImagem {
    public static boolean FazCopiadefault(String enderecoOrigem, String enderecoDestino){
        try{
            File fileO = new File(enderecoOrigem);
            File fileD = new File(enderecoDestino);
            fileO = fileO.getCanonicalFile();
            fileD = fileD.getCanonicalFile();
            System.out.println("Path Origem: "+fileO.toString());
            System.out.println("Path Destino: "+fileD.toString());
            FileInputStream origem;
            FileOutputStream destino;
            origem = new FileInputStream(fileO);
            destino = new FileOutputStream(fileD);
            FileChannel fcOrigem = origem.getChannel();
            FileChannel fcDestino = destino.getChannel();
            fcOrigem.transferTo(0, fcOrigem.size(), fcDestino);
            origem.close();
            destino.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public static boolean FazCopia(String enderecoOrigem, String enderecoDestino){
        try{
            File fileO = new File(enderecoOrigem);
            File fileD = new File(enderecoDestino);
            fileD = fileD.getCanonicalFile();
            System.out.println("Path Origem: "+fileO.toString());
            System.out.println("Path Destino: "+fileD.toString());
            FileInputStream origem;
            FileOutputStream destino;
            origem = new FileInputStream(fileO);
            destino = new FileOutputStream(fileD);
            FileChannel fcOrigem = origem.getChannel();
            FileChannel fcDestino = destino.getChannel();
            fcOrigem.transferTo(0, fcOrigem.size(), fcDestino);
            origem.close();
            destino.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
