package Classes_utilit.pkg;

import java.io.File;

public abstract class demitirContratar {
    public static boolean demitir(String empresa, String funcionario){
        String [] auxLeitura;
        try{
            //Mudar arquivo emprego
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + funcionario + "\\Emprego.txt", "D");
            //Mudar arquivos na pasta da empresa
            //Mudar arquivo com a conta dos empregados
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + empresa + "\\Funcionarios.txt");
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + empresa + "\\Funcionarios.txt", "");
            if(auxLeitura.length > 1) for (int i = 0; i < auxLeitura.length; i++) {
                if (!auxLeitura[i].equals(funcionario)) {
                    if (i == 0) {
                        leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + empresa + "\\Funcionarios.txt", auxLeitura[i]);
                    } else {
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\" + empresa + "\\Funcionarios.txt", auxLeitura[i]);
                    }
                }
            }
            //Deleta arquivo com informações do funcionário
            File file = new File("Arquivos\\DadosContas\\" + empresa + "\\FuncionariosDados\\" + funcionario);
            File[] listaFile = file.listFiles();
            for(int i = 0;i < listaFile.length; i++){
                listaFile[i].delete();
            }
            file.delete();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public static boolean fazerProposta(String empresa, String funcionario, String cargo, String salario){
        String[] auxLeitura;
        try{
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+funcionario+"\\Propostas.txt");
            if(auxLeitura == null){
                leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+funcionario+"\\Propostas.txt",empresa);
            }else{
                if(auxLeitura[0].equals("")){
                    leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+funcionario+"\\Propostas.txt",empresa);
                }else{
                    leituraEscrita.Escrita("Arquivos\\DadosContas\\"+funcionario+"\\Propostas.txt","\n"+empresa);
                }
            }
            leituraEscrita.Escrita("Arquivos\\DadosContas\\"+funcionario+"\\Propostas.txt","\n"+cargo);
            leituraEscrita.Escrita("Arquivos\\DadosContas\\"+funcionario+"\\Propostas.txt","\n"+salario);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public static boolean aceitarContrato(String empresa, String funcionario, String cargo, String salario){
        try{
            //Modificar o arquivo Emprego
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+funcionario+"\\Emprego.txt",empresa);
            //Adicionar a lista de funcionários
            String[] auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+empresa+"\\Funcionarios.txt");
            if(auxLeitura == null){
                leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+empresa+"\\Funcionarios.txt",funcionario);
            }else{
                if(auxLeitura[0].equals("")){
                    leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+empresa+"\\Funcionarios.txt",funcionario);
                }else{
                    leituraEscrita.Escrita("Arquivos\\DadosContas\\"+empresa+"\\Funcionarios.txt","\n"+funcionario);
                }
            }
            //Criar o diretório do funcionário
            File file = new File("Arquivos\\DadosContas\\"+empresa+"\\FuncionariosDados\\"+funcionario);
            file.mkdir();
            //Criar arquivos txt
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+empresa+"\\FuncionariosDados\\"+funcionario+"\\Salario.txt",salario);
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+empresa+"\\FuncionariosDados\\"+funcionario+"\\Profissao.txt",cargo);
            int[] data = temporizadorDataTempo.getDataAtualInt();
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+empresa+"\\FuncionariosDados\\"+funcionario+"\\DiaPagamento.txt",Integer.toString(data[0]));
            int dia = data[0];
            int mes = data[1];
            int ano = data[2];
            if(dia > 25) dia = 25;
            if (mes == 11) {
                mes = 0;
                ano++;
            } else {
                mes++;
            }
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + empresa + "\\FuncionariosDados\\"
                    + funcionario + "\\DataProxPagamento.txt", Integer.toString(dia));
            leituraEscrita.Escrita("Arquivos\\DadosContas\\" + empresa + "\\FuncionariosDados\\"
                    + funcionario + "\\DataProxPagamento.txt", "\n" + Integer.toString(mes));
            leituraEscrita.Escrita("Arquivos\\DadosContas\\" + empresa + "\\FuncionariosDados\\"
                    + funcionario + "\\DataProxPagamento.txt", "\n" + Integer.toString(ano));
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
