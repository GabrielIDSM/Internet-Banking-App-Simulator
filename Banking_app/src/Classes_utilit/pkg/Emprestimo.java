package Classes_utilit.pkg;

import java.math.BigDecimal;

/**
 *
 * @author Gabri
 */
public class Emprestimo {
    public static boolean modificaLimiteEmprestimo(String conta, BigDecimal valor){
        try{
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+conta+"\\LimiteEmprestimo.txt", valor.toPlainString());
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
