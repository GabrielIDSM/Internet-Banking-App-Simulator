package Interface.pkg;

import Classes_utilit.pkg.*;
import java.math.BigDecimal;

public class interfaceAdm extends javax.swing.JPanel {
    //Atributos
    String conta;
    String senha;
    String[] contasComuns = null;
    String[] contasEmpresas = null;
    //Construtor
    public interfaceAdm(String conta, String senha) {
        this.conta = conta;
        this.senha = senha;
        String[] auxLeitura;
        //Instancia do array de contas comuns
        auxLeitura = leituraEscrita.Leitura("Arquivos\\ContasComuns.txt");
        if(auxLeitura != null) if(!auxLeitura[0].equals("")){
            contasComuns = new String[auxLeitura.length/2];
            for (int i = 0, j = 0; j < auxLeitura.length; j += 2, i++) {
                contasComuns[i] = auxLeitura[j];
            }
        }           
        //Instancia do array de contas Empresas
        auxLeitura = leituraEscrita.Leitura("Arquivos\\ContasEmpresas.txt");
        if(auxLeitura != null) if(!auxLeitura[0].equals("")){
            contasEmpresas = new String[auxLeitura.length/2];
            for (int i = 0, j = 0; j < auxLeitura.length; j += 2, i++) {
                contasEmpresas[i] = auxLeitura[j];
            }
        } 
        initComponents();
        //Adicionar contas a combobox
        CB.addItem("Selecione");
        if(contasComuns != null) for(int i = 0; i < contasComuns.length; i++){
            CB.addItem(contasComuns[i]);
        }
        if(contasEmpresas != null) for(int i = 0; i < contasEmpresas.length; i++){
            CB.addItem(contasEmpresas[i]);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lImagem = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PouAtivos = new javax.swing.JLabel();
        Rendimentos = new javax.swing.JLabel();
        CB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TP = new javax.swing.JPanel();
        Default = new javax.swing.JPanel();
        interfaceComumPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        EmpregoAtual = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        empresaNome = new javax.swing.JLabel();
        salario = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        NovoLimiteEmprestimoCC = new javax.swing.JFormattedTextField();
        AlterarEmprestimoCC = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        limiteEmpCC = new javax.swing.JLabel();
        interfaceEmpresaPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Funcionarios = new javax.swing.JLabel();
        numeroFunc = new javax.swing.JLabel();
        lFS = new javax.swing.JLabel();
        FolhaSalarial = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        NovoLimiteEmprestimoCE = new javax.swing.JFormattedTextField();
        AlterarEmprestimoCE = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        limiteEmpCE = new javax.swing.JLabel();
        lData = new javax.swing.JLabel();
        lData.setText(temporizadorDataTempo.retornaStringDataAtual());

        setBackground(new java.awt.Color(0, 70, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GERENCIADOR DE CONTAS");

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        jPanel2.setBackground(new java.awt.Color(0, 70, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 70, 0)));

        jPanel3.setBackground(new java.awt.Color(214, 214, 214));

        lImagem.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lImagem.setForeground(new java.awt.Color(0, 0, 0));
        lImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Nome.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        Nome.setForeground(new java.awt.Color(0, 70, 0));
        Nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nome.setText("---");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 70, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Saldo:");

        Saldo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Saldo.setForeground(new java.awt.Color(70, 0, 0));
        Saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Saldo.setText("---");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 70, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Poupança:");

        PouAtivos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PouAtivos.setForeground(new java.awt.Color(0, 70, 0));
        PouAtivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PouAtivos.setText("---");

        Rendimentos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Rendimentos.setForeground(new java.awt.Color(70, 0, 0));
        Rendimentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rendimentos.setText("---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(PouAtivos, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(Rendimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PouAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rendimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        CB.setBackground(new java.awt.Color(170, 255, 170));
        CB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CB.setMaximumRowCount(16);
        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TP.setBackground(new java.awt.Color(214, 214, 214));
        TP.setLayout(new java.awt.CardLayout());

        Default.setBackground(new java.awt.Color(230, 230, 230));

        javax.swing.GroupLayout DefaultLayout = new javax.swing.GroupLayout(Default);
        Default.setLayout(DefaultLayout);
        DefaultLayout.setHorizontalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        DefaultLayout.setVerticalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        TP.add(Default, "card2");

        interfaceComumPanel.setBackground(new java.awt.Color(230, 230, 230));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 70));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTA COMUM");

        jPanel4.setBackground(new java.awt.Color(214, 214, 214));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 70)));

        EmpregoAtual.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        EmpregoAtual.setForeground(new java.awt.Color(0, 0, 70));
        EmpregoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmpregoAtual.setText("Emprego Atual");

        cargo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cargo.setForeground(new java.awt.Color(0, 0, 70));
        cargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargo.setText("Cargo");

        empresaNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        empresaNome.setForeground(new java.awt.Color(0, 0, 70));
        empresaNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empresaNome.setText("Empresa");

        salario.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        salario.setForeground(new java.awt.Color(70, 0, 0));
        salario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salario.setText("Salário");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpregoAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(empresaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(salario, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(EmpregoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empresaNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(214, 214, 214));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 70)));

        NovoLimiteEmprestimoCC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        NovoLimiteEmprestimoCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NovoLimiteEmprestimoCC.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        AlterarEmprestimoCC.setBackground(new java.awt.Color(0, 0, 70));
        AlterarEmprestimoCC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AlterarEmprestimoCC.setForeground(new java.awt.Color(255, 255, 255));
        AlterarEmprestimoCC.setText("Alterar");
        AlterarEmprestimoCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarEmprestimoCCActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(200, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Insira o novo limite de empréstimo");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 70));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Limite de Empréstimo");

        limiteEmpCC.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        limiteEmpCC.setForeground(new java.awt.Color(70, 0, 0));
        limiteEmpCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limiteEmpCC.setText("Limite");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(NovoLimiteEmprestimoCC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlterarEmprestimoCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limiteEmpCC, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limiteEmpCC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NovoLimiteEmprestimoCC)
                    .addComponent(AlterarEmprestimoCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout interfaceComumPanelLayout = new javax.swing.GroupLayout(interfaceComumPanel);
        interfaceComumPanel.setLayout(interfaceComumPanelLayout);
        interfaceComumPanelLayout.setHorizontalGroup(
            interfaceComumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, interfaceComumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(interfaceComumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, interfaceComumPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        interfaceComumPanelLayout.setVerticalGroup(
            interfaceComumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfaceComumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(interfaceComumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(325, Short.MAX_VALUE))
        );

        TP.add(interfaceComumPanel, "card3");

        interfaceEmpresaPanel.setBackground(new java.awt.Color(230, 230, 230));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTA EMPRESA");

        jPanel6.setBackground(new java.awt.Color(214, 214, 214));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));

        Funcionarios.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Funcionarios.setForeground(new java.awt.Color(70, 0, 0));
        Funcionarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Funcionarios.setText("Funcionários");

        numeroFunc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numeroFunc.setForeground(new java.awt.Color(70, 0, 0));
        numeroFunc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroFunc.setText("Numero de Func");

        lFS.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lFS.setForeground(new java.awt.Color(70, 0, 0));
        lFS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lFS.setText("Folha Salarial:");

        FolhaSalarial.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        FolhaSalarial.setForeground(new java.awt.Color(140, 0, 0));
        FolhaSalarial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FolhaSalarial.setText("FS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Funcionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(FolhaSalarial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numeroFunc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lFS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numeroFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lFS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FolhaSalarial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(214, 214, 214));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));

        NovoLimiteEmprestimoCE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        NovoLimiteEmprestimoCE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NovoLimiteEmprestimoCE.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        AlterarEmprestimoCE.setBackground(new java.awt.Color(70, 0, 0));
        AlterarEmprestimoCE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AlterarEmprestimoCE.setForeground(new java.awt.Color(255, 255, 255));
        AlterarEmprestimoCE.setText("Alterar");
        AlterarEmprestimoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarEmprestimoCEActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(200, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Insira o novo limite de empréstimo");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(70, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Limite de Empréstimo");

        limiteEmpCE.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        limiteEmpCE.setForeground(new java.awt.Color(140, 0, 0));
        limiteEmpCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limiteEmpCE.setText("Limite");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(NovoLimiteEmprestimoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlterarEmprestimoCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limiteEmpCE, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limiteEmpCE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NovoLimiteEmprestimoCE)
                    .addComponent(AlterarEmprestimoCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout interfaceEmpresaPanelLayout = new javax.swing.GroupLayout(interfaceEmpresaPanel);
        interfaceEmpresaPanel.setLayout(interfaceEmpresaPanelLayout);
        interfaceEmpresaPanelLayout.setHorizontalGroup(
            interfaceEmpresaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfaceEmpresaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(interfaceEmpresaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(interfaceEmpresaPanelLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        interfaceEmpresaPanelLayout.setVerticalGroup(
            interfaceEmpresaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfaceEmpresaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(interfaceEmpresaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(325, Short.MAX_VALUE))
        );

        TP.add(interfaceEmpresaPanel, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lData.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        lData.setForeground(new java.awt.Color(255, 255, 255));
        lData.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lData.setText("data");
        lData.setText(temporizadorDataTempo.retornaStringDataAtual());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lData, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        int index = CB.getSelectedIndex();
        String conta = CB.getItemAt(index);
        String[] auxLeitura;
        NovoLimiteEmprestimoCE.setText("");
        NovoLimiteEmprestimoCC.setText("");
        //Definindo os dados do painel comum
        if(index > 0){
            lImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pkg/" + conta + ".png")));
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Nome.txt");
            Nome.setText(auxLeitura[0]);
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Saldo.txt");
            Saldo.setText(stringSaldo.retornaStringSaldo(auxLeitura[0]));
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Poupanca.txt");
            if(auxLeitura != null){
                if(!auxLeitura[0].equals("")){
                    int Ativos = auxLeitura.length / 6;
                    BigDecimal resultado = new BigDecimal("0.0");
                    for (int i = 0, j = 0; i < auxLeitura.length; i += 6, j++) {
                        resultado = resultado.add(new BigDecimal(auxLeitura[i + 1]));
                    }
                    PouAtivos.setText(Integer.toString(Ativos)+" Poupanças");
                    Rendimentos.setText(stringSaldo.retornaStringSaldo(resultado.toPlainString()));
                }else{
                    PouAtivos.setText("0 Poupanças");
                    Rendimentos.setText(stringSaldo.retornaStringSaldo("0.0"));
                }
            }else{
                PouAtivos.setText("0 Poupanças");
                Rendimentos.setText(stringSaldo.retornaStringSaldo("0.0"));
            }
            //Verificando se a conta é empresa ou comum
            boolean ehComum = true;
            if(contasComuns == null){
                ehComum = false;
            }else if(contasEmpresas != null){
                for(int i = 0; i < contasEmpresas.length; i++){
                    if(contasEmpresas[i].equals(conta)){
                        ehComum = false;
                        break;
                    }
                }
            }
            //Modifica o painel dependendo do tipo
            if(ehComum){
                TP.removeAll();
                TP.repaint();
                TP.revalidate();
                //Modificar conteúdo do Painel
                //Modifica painel em função do emprego
                auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Emprego.txt");
                if(auxLeitura[0].equals("D")){
                    EmpregoAtual.setText("Desempregado");
                    cargo.setForeground(new java.awt.Color(200, 200, 200));
                    empresaNome.setForeground(new java.awt.Color(200, 200, 200));
                    salario.setForeground(new java.awt.Color(200, 200, 200));
                }else{
                    EmpregoAtual.setText("Emprego Atual");
                    cargo.setForeground(new java.awt.Color(0, 0, 70));
                    empresaNome.setForeground(new java.awt.Color(0, 0, 70));
                    salario.setForeground(new java.awt.Color(70, 0, 0));
                    String empresa = auxLeitura[0];
                    //Definir nome da empresa
                    auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+empresa+"\\Nome.txt");
                    empresaNome.setText("Empresa: "+auxLeitura[0]);
                    //Definir cargo
                    auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+empresa+"\\FuncionariosDados\\"+conta+"\\Profissao.txt");
                    cargo.setText("Cargo: "+auxLeitura[0]);
                    //Definir salário
                    auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+empresa+"\\FuncionariosDados\\"+conta+"\\Salario.txt");
                    salario.setText("Salário: "+stringSaldo.retornaStringSaldo(auxLeitura[0]));
                }
                auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + conta + "\\LimiteEmprestimo.txt");
                limiteEmpCC.setText(stringSaldo.retornaStringSaldo(auxLeitura[0]));
                TP.add(interfaceComumPanel);
                TP.repaint();
                TP.revalidate();
            }else{
                TP.removeAll();
                TP.repaint();
                TP.revalidate();
                //Modificar conteúdo do Painel
                //Modifica painel em função dos Funcionários
                auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Funcionarios.txt");
                if(auxLeitura != null){
                    if(!auxLeitura.equals("")){
                        Funcionarios.setText("Funcionários");
                        numeroFunc.setForeground(new java.awt.Color(70, 0, 0));
                        lFS.setForeground(new java.awt.Color(70, 0, 0));
                        FolhaSalarial.setForeground(new java.awt.Color(140, 0, 0));
                        int nDeFunc = auxLeitura.length;
                        if(nDeFunc == 1) numeroFunc.setText(Integer.toString(nDeFunc)+" Funcionário");
                        else numeroFunc.setText(Integer.toString(nDeFunc)+" Funcionários");
                        //Calcular a folha salarial
                        String[] funcionarios = auxLeitura;
                        BigDecimal folhaSalarial = new BigDecimal("0.0");
                        for (int i = 0; i < nDeFunc; i++) {
                            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\FuncionariosDados\\"+funcionarios[i]+"\\Salario.txt");
                            folhaSalarial = folhaSalarial.add(new BigDecimal(auxLeitura[0]));
                        }
                        FolhaSalarial.setText(stringSaldo.retornaStringSaldo(folhaSalarial.toPlainString()));
                    }else{
                        Funcionarios.setText("Sem Funcionários");
                        numeroFunc.setForeground(new java.awt.Color(200, 200, 200));
                        lFS.setForeground(new java.awt.Color(200, 200, 200));
                        FolhaSalarial.setForeground(new java.awt.Color(200, 200, 200));
                    }
                }else{
                    Funcionarios.setText("Sem Funcionários");
                    numeroFunc.setForeground(new java.awt.Color(200, 200, 200));
                    lFS.setForeground(new java.awt.Color(200, 200, 200));
                    FolhaSalarial.setForeground(new java.awt.Color(200, 200, 200));
                }
                //Modifica o limite da Emprestimo
                auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + conta + "\\LimiteEmprestimo.txt");
                limiteEmpCE.setText(stringSaldo.retornaStringSaldo(auxLeitura[0]));
                TP.add(interfaceEmpresaPanel);
                TP.repaint();
                TP.revalidate();
            }
        }else{
            lImagem.setIcon(null);
            Nome.setText("---");
            Saldo.setText("---");
            PouAtivos.setText("---");
            Rendimentos.setText("---");
            TP.removeAll();
            TP.repaint();
            TP.revalidate();
            TP.add(Default);
            TP.repaint();
            TP.revalidate();
        }
    }//GEN-LAST:event_CBActionPerformed

    private void AlterarEmprestimoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarEmprestimoCEActionPerformed
        String limiteEmp = NovoLimiteEmprestimoCE.getText();
        NovoLimiteEmprestimoCE.setText("");
        int index = CB.getSelectedIndex();
        String contaU = CB.getItemAt(index);    
        if(alteraLimiteEmprestimo(contaU ,limiteEmp)){
            System.out.println("Alteração efetuada!");
            String[] auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + contaU + "\\LimiteEmprestimo.txt");
            limiteEmpCE.setText(stringSaldo.retornaStringSaldo(auxLeitura[0]));
        }else{
            System.out.println("Houve um erro");
        }
    }//GEN-LAST:event_AlterarEmprestimoCEActionPerformed

    private void AlterarEmprestimoCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarEmprestimoCCActionPerformed
        String limiteEmp = NovoLimiteEmprestimoCC.getText();
        NovoLimiteEmprestimoCC.setText("");
        int index = CB.getSelectedIndex();
        String contaU = CB.getItemAt(index);
        if(alteraLimiteEmprestimo(contaU ,limiteEmp)){
            System.out.println("Alteração efetuada!");
            String[] auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + contaU + "\\LimiteEmprestimo.txt");
            limiteEmpCC.setText(stringSaldo.retornaStringSaldo(auxLeitura[0]));
        }else{
            System.out.println("Houve um erro");
        }
    }//GEN-LAST:event_AlterarEmprestimoCCActionPerformed

    private boolean alteraLimiteEmprestimo(String conta, String valor){
        try{
            valor = valor.replace(',', '.');
            BigDecimal valorBD = new BigDecimal(valor);
            if(valorBD.compareTo(new BigDecimal(0.0)) >= 0){
                emprestimos.modificaLimiteEmprestimo(conta, valorBD);
            }
            else return false;
            return true;
        }catch(Exception e){
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarEmprestimoCC;
    private javax.swing.JButton AlterarEmprestimoCE;
    private javax.swing.JComboBox<String> CB;
    private javax.swing.JPanel Default;
    private javax.swing.JLabel EmpregoAtual;
    private javax.swing.JLabel FolhaSalarial;
    private javax.swing.JLabel Funcionarios;
    private javax.swing.JLabel Nome;
    private javax.swing.JFormattedTextField NovoLimiteEmprestimoCC;
    private javax.swing.JFormattedTextField NovoLimiteEmprestimoCE;
    private javax.swing.JLabel PouAtivos;
    private javax.swing.JLabel Rendimentos;
    private javax.swing.JLabel Saldo;
    private javax.swing.JPanel TP;
    private javax.swing.JLabel cargo;
    private javax.swing.JLabel empresaNome;
    private javax.swing.JPanel interfaceComumPanel;
    private javax.swing.JPanel interfaceEmpresaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lData;
    private javax.swing.JLabel lFS;
    private javax.swing.JLabel lImagem;
    private javax.swing.JLabel limiteEmpCC;
    private javax.swing.JLabel limiteEmpCE;
    private javax.swing.JLabel numeroFunc;
    private javax.swing.JLabel salario;
    // End of variables declaration//GEN-END:variables
}
