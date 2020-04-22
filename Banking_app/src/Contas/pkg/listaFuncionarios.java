package Contas.pkg;

import Classes_utilit.pkg.*;
import java.math.BigDecimal;

public class listaFuncionarios extends javax.swing.JInternalFrame {
    //Atributos
    String[] funcionarios = null;
    String[] nomes = null;
    String[] profissoes = null;
    String[] salarios = null;
    String[] diaDePagamento = null;
    String conta;
    String saldo;
    String nome;
    String senha;
    //Métodos construtor
    public listaFuncionarios(String conta, String saldo, String nome, String senha) {
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
        this.senha = senha;
        this.funcionarios = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
                + conta + "\\Funcionarios.txt");
        //Coletando dados dos funcionários;
        String[] Aux;
        int cont = funcionarios.length;
        nomes = new String[cont];
        profissoes = new String[cont];
        salarios = new String[cont];
        diaDePagamento = new String[cont];
        if(funcionarios != null) for(int i = 0; i < funcionarios.length; i++){
            Aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\FuncionariosDados\\"
            +funcionarios[i]+"\\Salario.txt");
            salarios[i] = Aux[0];
            Aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\FuncionariosDados\\"
            +funcionarios[i]+"\\Profissao.txt");
            profissoes[i] = Aux[0];
            Aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\FuncionariosDados\\"
            +funcionarios[i]+"\\DiaPagamento.txt");
            diaDePagamento[i] = Aux[0];
            Aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+funcionarios[i]+"\\Nome.txt");
            nomes[i] = Aux[0];
        }     
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox1.addItem("Selecionar");
        for(int i = 0;i<this.funcionarios.length;i++){
            jComboBox1.addItem(funcionarios[i]);
        }
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lImagem = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lNome1 = new javax.swing.JLabel();
        lProf = new javax.swing.JLabel();
        lNome3 = new javax.swing.JLabel();
        lSal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lNome2 = new javax.swing.JLabel();
        lDia = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lNome4 = new javax.swing.JLabel();
        lDataProximoPagamento = new javax.swing.JLabel();
        bEfetuarPagamento = new javax.swing.JButton();
        bEfetuarPagamento.setVisible(false);
        bReajuste = new javax.swing.JButton();
        bReajuste.setVisible(false);
        bMudarDiaPagamento = new javax.swing.JButton();
        bMudarDiaPagamento.setVisible(false);
        TP = new javax.swing.JPanel();
        Default = new javax.swing.JPanel();
        PagamentoPanel = new javax.swing.JPanel();
        lConfirmaSenha = new javax.swing.JLabel();
        jConfirmaSenha = new javax.swing.JPasswordField();
        jConfirmaPagamento = new javax.swing.JButton();
        MudaDiaPagamentoPanel = new javax.swing.JPanel();
        lConfirmaSenha1 = new javax.swing.JLabel();
        jConfirmaSenha1 = new javax.swing.JPasswordField();
        jConfirmaDiaDePagamento = new javax.swing.JButton();
        cNovoDia = new javax.swing.JComboBox<>();
        ReajustePanel = new javax.swing.JPanel();
        lConfirmaSenha2 = new javax.swing.JLabel();
        jConfirmaSenha2 = new javax.swing.JPasswordField();
        jConfirmaReajuste = new javax.swing.JButton();
        NovoSalario = new javax.swing.JFormattedTextField();
        lConfirmaSenha3 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("Funcionários");

        jPanel1.setBackground(new java.awt.Color(70, 0, 0));

        jComboBox1.setBackground(new java.awt.Color(70, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(230, 230, 230));
        jComboBox1.setMaximumRowCount(4);
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        jPanel3.setBackground(new java.awt.Color(214, 214, 214));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));

        lImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome.setForeground(new java.awt.Color(70, 0, 0));
        lNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome.setText("---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(214, 214, 214));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));

        lNome1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome1.setForeground(new java.awt.Color(0, 0, 0));
        lNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome1.setText("Profissão:");

        lProf.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lProf.setForeground(new java.awt.Color(70, 0, 0));
        lProf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lProf.setText("---");

        lNome3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome3.setForeground(new java.awt.Color(0, 0, 0));
        lNome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome3.setText("Salário:");

        lSal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lSal.setForeground(new java.awt.Color(70, 0, 0));
        lSal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSal.setText("---");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(lProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lSal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lProf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(214, 214, 214));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));
        jPanel5.setMinimumSize(new java.awt.Dimension(370, 0));
        jPanel5.setName(""); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(370, 80));

        lNome2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome2.setForeground(new java.awt.Color(0, 0, 0));
        lNome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome2.setText("Dia de Pagamento:");

        lDia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lDia.setForeground(new java.awt.Color(70, 0, 0));
        lDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia.setText("---");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lDia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(214, 214, 214));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));

        lNome4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome4.setForeground(new java.awt.Color(0, 0, 0));
        lNome4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome4.setText("Data do próximo pagamento:");

        lDataProximoPagamento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lDataProximoPagamento.setForeground(new java.awt.Color(70, 0, 0));
        lDataProximoPagamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDataProximoPagamento.setText("---");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lDataProximoPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lDataProximoPagamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bEfetuarPagamento.setBackground(new java.awt.Color(70, 0, 0));
        bEfetuarPagamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bEfetuarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        bEfetuarPagamento.setText("Efetuar Pagamento");
        bEfetuarPagamento.setBorder(null);
        bEfetuarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEfetuarPagamentoActionPerformed(evt);
            }
        });

        bReajuste.setBackground(new java.awt.Color(70, 0, 0));
        bReajuste.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bReajuste.setForeground(new java.awt.Color(255, 255, 255));
        bReajuste.setText("Reajuste Salarial");
        bReajuste.setBorder(null);
        bReajuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReajusteActionPerformed(evt);
            }
        });

        bMudarDiaPagamento.setBackground(new java.awt.Color(70, 0, 0));
        bMudarDiaPagamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bMudarDiaPagamento.setForeground(new java.awt.Color(255, 255, 255));
        bMudarDiaPagamento.setText("Dia de pagamento");
        bMudarDiaPagamento.setBorder(null);
        bMudarDiaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMudarDiaPagamentoActionPerformed(evt);
            }
        });

        TP.setLayout(new java.awt.CardLayout());

        Default.setBackground(new java.awt.Color(230, 230, 230));

        javax.swing.GroupLayout DefaultLayout = new javax.swing.GroupLayout(Default);
        Default.setLayout(DefaultLayout);
        DefaultLayout.setHorizontalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        DefaultLayout.setVerticalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        TP.add(Default, "card4");

        PagamentoPanel.setBackground(new java.awt.Color(230, 230, 230));

        lConfirmaSenha.setBackground(new java.awt.Color(200, 0, 0));
        lConfirmaSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lConfirmaSenha.setForeground(new java.awt.Color(200, 0, 0));
        lConfirmaSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lConfirmaSenha.setText("Confirme sua senha:");

        jConfirmaSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jConfirmaPagamento.setBackground(new java.awt.Color(70, 0, 0));
        jConfirmaPagamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jConfirmaPagamento.setForeground(new java.awt.Color(255, 255, 255));
        jConfirmaPagamento.setText("Confirmar");
        jConfirmaPagamento.setBorder(null);
        jConfirmaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmaPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PagamentoPanelLayout = new javax.swing.GroupLayout(PagamentoPanel);
        PagamentoPanel.setLayout(PagamentoPanelLayout);
        PagamentoPanelLayout.setHorizontalGroup(
            PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PagamentoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lConfirmaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PagamentoPanelLayout.createSequentialGroup()
                        .addComponent(jConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jConfirmaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PagamentoPanelLayout.setVerticalGroup(
            PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagamentoPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lConfirmaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jConfirmaSenha)
                    .addComponent(jConfirmaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TP.add(PagamentoPanel, "card2");

        MudaDiaPagamentoPanel.setBackground(new java.awt.Color(230, 230, 230));

        lConfirmaSenha1.setBackground(new java.awt.Color(200, 0, 0));
        lConfirmaSenha1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lConfirmaSenha1.setForeground(new java.awt.Color(200, 0, 0));
        lConfirmaSenha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lConfirmaSenha1.setText("Confirme sua senha:");

        jConfirmaSenha1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jConfirmaDiaDePagamento.setBackground(new java.awt.Color(70, 0, 0));
        jConfirmaDiaDePagamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jConfirmaDiaDePagamento.setForeground(new java.awt.Color(255, 255, 255));
        jConfirmaDiaDePagamento.setText("Alterar");
        jConfirmaDiaDePagamento.setBorder(null);
        jConfirmaDiaDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmaDiaDePagamentoActionPerformed(evt);
            }
        });

        cNovoDia.setBackground(new java.awt.Color(70, 0, 0));
        cNovoDia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cNovoDia.setForeground(new java.awt.Color(230, 230, 230));
        cNovoDia.setMaximumRowCount(5);
        cNovoDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        javax.swing.GroupLayout MudaDiaPagamentoPanelLayout = new javax.swing.GroupLayout(MudaDiaPagamentoPanel);
        MudaDiaPagamentoPanel.setLayout(MudaDiaPagamentoPanelLayout);
        MudaDiaPagamentoPanelLayout.setHorizontalGroup(
            MudaDiaPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MudaDiaPagamentoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MudaDiaPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lConfirmaSenha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MudaDiaPagamentoPanelLayout.createSequentialGroup()
                        .addComponent(jConfirmaSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jConfirmaDiaDePagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(MudaDiaPagamentoPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cNovoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MudaDiaPagamentoPanelLayout.setVerticalGroup(
            MudaDiaPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MudaDiaPagamentoPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cNovoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lConfirmaSenha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MudaDiaPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jConfirmaSenha1)
                    .addComponent(jConfirmaDiaDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TP.add(MudaDiaPagamentoPanel, "card3");

        ReajustePanel.setBackground(new java.awt.Color(230, 230, 230));

        lConfirmaSenha2.setBackground(new java.awt.Color(200, 0, 0));
        lConfirmaSenha2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lConfirmaSenha2.setForeground(new java.awt.Color(200, 0, 0));
        lConfirmaSenha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lConfirmaSenha2.setText("Confirme sua senha:");

        jConfirmaSenha2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jConfirmaReajuste.setBackground(new java.awt.Color(70, 0, 0));
        jConfirmaReajuste.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jConfirmaReajuste.setForeground(new java.awt.Color(255, 255, 255));
        jConfirmaReajuste.setText("Reajustar");
        jConfirmaReajuste.setBorder(null);
        jConfirmaReajuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmaReajusteActionPerformed(evt);
            }
        });

        NovoSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###.00"))));
        NovoSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NovoSalario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        lConfirmaSenha3.setBackground(new java.awt.Color(200, 0, 0));
        lConfirmaSenha3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lConfirmaSenha3.setForeground(new java.awt.Color(70, 0, 0));
        lConfirmaSenha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lConfirmaSenha3.setText("Insira o novo salário:");

        javax.swing.GroupLayout ReajustePanelLayout = new javax.swing.GroupLayout(ReajustePanel);
        ReajustePanel.setLayout(ReajustePanelLayout);
        ReajustePanelLayout.setHorizontalGroup(
            ReajustePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReajustePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(ReajustePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lConfirmaSenha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReajustePanelLayout.createSequentialGroup()
                        .addComponent(jConfirmaSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jConfirmaReajuste, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addGroup(ReajustePanelLayout.createSequentialGroup()
                        .addComponent(lConfirmaSenha3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NovoSalario)))
                .addGap(6, 6, 6))
        );
        ReajustePanelLayout.setVerticalGroup(
            ReajustePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReajustePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ReajustePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lConfirmaSenha3)
                    .addComponent(NovoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(lConfirmaSenha2)
                .addGap(6, 6, 6)
                .addGroup(ReajustePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jConfirmaSenha2)
                    .addComponent(jConfirmaReajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        TP.add(ReajustePanel, "card4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bEfetuarPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bReajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMudarDiaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bReajuste, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(bMudarDiaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEfetuarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(270, Short.MAX_VALUE)
                    .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int index = jComboBox1.getSelectedIndex();
        if(index > 0){
            bEfetuarPagamento.setVisible(true);
            bReajuste.setVisible(true);
            bMudarDiaPagamento.setVisible(true);
            lNome.setText(this.nomes[index-1]);
            lProf.setText(this.profissoes[index-1]);
            lSal.setText(stringSaldo.retornaStringSaldo(this.salarios[index-1]));
            lDia.setText(this.diaDePagamento[index-1]);
            lDataProximoPagamento.setText(temporizadorDataTempo.proximoPagamento(this.conta, this.funcionarios[index-1]));
            lImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pkg/"+this.funcionarios[index-1]+".png")));
        }else{
            lNome.setText("---");
            lProf.setText("---");
            lSal.setText("---");
            lDia.setText("---");
            lDataProximoPagamento.setText("---");
            lImagem.setIcon(null);
            bEfetuarPagamento.setVisible(false);
            bReajuste.setVisible(false);
            bMudarDiaPagamento.setVisible(false);
        }
        jConfirmaSenha.setText("");
        jConfirmaSenha1.setText("");
        jConfirmaSenha2.setText("");
        cNovoDia.setSelectedIndex(0);
        NovoSalario.setText("");
        TP.removeAll();
        TP.repaint();
        TP.revalidate();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void bEfetuarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEfetuarPagamentoActionPerformed
        jConfirmaSenha.setText("");
        jConfirmaSenha1.setText("");
        jConfirmaSenha2.setText("");
        cNovoDia.setSelectedIndex(0);
        NovoSalario.setText("");
        TP.removeAll();
        TP.repaint();
        TP.revalidate();
        TP.add(PagamentoPanel);
        TP.repaint();
        TP.revalidate();
    }//GEN-LAST:event_bEfetuarPagamentoActionPerformed

    private void bReajusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReajusteActionPerformed
        jConfirmaSenha.setText("");
        jConfirmaSenha1.setText("");
        jConfirmaSenha2.setText("");
        cNovoDia.setSelectedIndex(0);
        NovoSalario.setText("");
        TP.removeAll();
        TP.repaint();
        TP.revalidate();
        TP.add(ReajustePanel);
        TP.repaint();
        TP.revalidate();
    }//GEN-LAST:event_bReajusteActionPerformed

    private void bMudarDiaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMudarDiaPagamentoActionPerformed
        jConfirmaSenha.setText("");
        jConfirmaSenha1.setText("");
        jConfirmaSenha2.setText("");
        cNovoDia.setSelectedIndex(0);
        NovoSalario.setText("");
        TP.removeAll();
        TP.repaint();
        TP.revalidate();
        TP.add(MudaDiaPagamentoPanel);
        TP.repaint();
        TP.revalidate();
    }//GEN-LAST:event_bMudarDiaPagamentoActionPerformed

    private void jConfirmaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmaPagamentoActionPerformed
        char[] password = jConfirmaSenha.getPassword();
        int index = jComboBox1.getSelectedIndex()-1;
        if (password != null) {
            String senha = "";
            for (int i = 0; i < password.length; i++) {
                senha += password[i];
            }
            System.out.println("THIS.SENHA: "+this.senha+"=="+"SENHA: "+senha);
            boolean validade = FazPagamento(senha, index);
            if(validade){
                System.out.println("Pagamento realizado!");
                lDataProximoPagamento.setText(temporizadorDataTempo.proximoPagamento(this.conta, this.funcionarios[index]));
                jConfirmaSenha.setText("");
                jConfirmaSenha1.setText("");
                jConfirmaSenha2.setText("");
                cNovoDia.setSelectedIndex(0);
                NovoSalario.setText("");
                TP.removeAll();
                TP.repaint();
                TP.revalidate();
                TP.add(Default);
                TP.repaint();
                TP.revalidate();
            }else{
                System.out.println("Pagamento não realizado!");
                jConfirmaSenha.setText("");
                jConfirmaSenha1.setText("");
                jConfirmaSenha2.setText("");
                cNovoDia.setSelectedIndex(0);
                NovoSalario.setText("");
                TP.removeAll();
                TP.repaint();
                TP.revalidate();
                TP.add(Default);
                TP.repaint();
                TP.revalidate();
            }
        }else{
            System.out.println("Pagamento não realizado!");
            jConfirmaSenha.setText("");
            jConfirmaSenha1.setText("");
            jConfirmaSenha2.setText("");
            cNovoDia.setSelectedIndex(0);
            NovoSalario.setText("");
            TP.removeAll();
            TP.repaint();
            TP.revalidate();
            TP.add(Default);
            TP.repaint();
            TP.revalidate();
        }
    }//GEN-LAST:event_jConfirmaPagamentoActionPerformed

    private void jConfirmaDiaDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmaDiaDePagamentoActionPerformed
        int index = jComboBox1.getSelectedIndex();
        int diaIndex = cNovoDia.getSelectedIndex();
        int diaAtual = Integer.parseInt(diaDePagamento[index - 1]);
        char [] passwordCharArray = jConfirmaSenha1.getPassword();
        String senha = "";
        for (int i = 0; i < passwordCharArray.length; i++){
            senha += passwordCharArray[i];
        }
        if(diaIndex == 0 || !senha.equals(this.senha)){
            TP.removeAll();
            TP.repaint();
            TP.revalidate();
            TP.add(Default);
            TP.repaint();
            TP.revalidate();
        }else{
            //Verifica se o dia dado é o mesmo já usado
            if(diaAtual == diaIndex){
                TP.removeAll();
                TP.repaint();
                TP.revalidate();
                TP.add(Default);
                TP.repaint();
                TP.revalidate();
            }else{
                //Mudar valor nos arquivos
                String novoDia = Integer.toString(diaIndex);
                String[] auxLeitura;
                leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+this.conta+"\\FuncionariosDados\\"
            +funcionarios[index-1]+"\\DiaPagamento.txt", novoDia);
                auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+this.conta+"\\FuncionariosDados\\"
            +funcionarios[index-1]+"\\DataProxPagamento.txt");
                leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+this.conta+"\\FuncionariosDados\\"
            +funcionarios[index-1]+"\\DataProxPagamento.txt", novoDia);
                leituraEscrita.Escrita("Arquivos\\DadosContas\\"+this.conta+"\\FuncionariosDados\\"
            +funcionarios[index-1]+"\\DataProxPagamento.txt", "\n"+auxLeitura[1]);
                leituraEscrita.Escrita("Arquivos\\DadosContas\\"+this.conta+"\\FuncionariosDados\\"
            +funcionarios[index-1]+"\\DataProxPagamento.txt", "\n"+auxLeitura[2]);
                //Mudar variáveis
                diaDePagamento[index-1] = novoDia;
                //Mudando o valor dos componentes
                lDia.setText(this.diaDePagamento[index-1]);
                lDataProximoPagamento.setText(temporizadorDataTempo.proximoPagamento(this.conta, this.funcionarios[index-1]));
            }
        }
    }//GEN-LAST:event_jConfirmaDiaDePagamentoActionPerformed

    private void jConfirmaReajusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmaReajusteActionPerformed
        int index = jComboBox1.getSelectedIndex() - 1;
        BigDecimal salarioNovo = new BigDecimal(NovoSalario.getText().replace(',', '.'));
        if(salarioNovo.doubleValue() <= 0){
            TP.removeAll();
            TP.repaint();
            TP.revalidate();
            TP.add(Default);
            TP.repaint();
            TP.revalidate();
        }else{
            //Modifica valor do salario
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+this.conta+"\\FuncionariosDados\\"
            +funcionarios[index]+"\\Salario.txt", salarioNovo.toPlainString());
            //Modifica variáveis
            salarios[index] = salarioNovo.toPlainString();
            //Atualiza componentes
            lSal.setText(stringSaldo.retornaStringSaldo(this.salarios[index]));
            //Fecha aba
            TP.removeAll();
            TP.repaint();
            TP.revalidate();
            TP.add(Default);
            TP.repaint();
            TP.revalidate();
        }
    }//GEN-LAST:event_jConfirmaReajusteActionPerformed

    public boolean FazPagamento(String senha, int index) {
        String auxSalarioStr = this.salarios[index];
        if (senha.equals(this.senha)) {
            String[] aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
                    + this.conta + "\\Saldo.txt");
            this.saldo = aux[0];
            //Verifica qual funcionário deve ser pago
            try {
                BigDecimal auxSaldo = new BigDecimal(this.saldo);
                BigDecimal auxSalario = new BigDecimal(auxSalarioStr);
                if (auxSaldo.doubleValue() < auxSalario.doubleValue()) {
                    throw new Exception();
                }
                boolean verifica = false;
                verifica = pagamentos.efetuaPagamento(this.conta, this.funcionarios[index], auxSalario.toPlainString());
                if (!verifica) {
                    throw new Exception();
                } else {
                    System.out.println("Pagamento realizado!");
                    return true;
                }
            } catch (NumberFormatException e) {
                System.out.println("NUMBERFORMATEXCEPTION");
                return false;
            } catch (Exception e) {
                System.out.println("EXCEPTION");
                return false;
            }
        } else {
            System.out.println("Senha incorreta!");
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Default;
    private javax.swing.JPanel MudaDiaPagamentoPanel;
    private javax.swing.JFormattedTextField NovoSalario;
    private javax.swing.JPanel PagamentoPanel;
    private javax.swing.JPanel ReajustePanel;
    private javax.swing.JPanel TP;
    private javax.swing.JButton bEfetuarPagamento;
    private javax.swing.JButton bMudarDiaPagamento;
    private javax.swing.JButton bReajuste;
    private javax.swing.JComboBox<String> cNovoDia;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jConfirmaDiaDePagamento;
    private javax.swing.JButton jConfirmaPagamento;
    private javax.swing.JButton jConfirmaReajuste;
    private javax.swing.JPasswordField jConfirmaSenha;
    private javax.swing.JPasswordField jConfirmaSenha1;
    private javax.swing.JPasswordField jConfirmaSenha2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lConfirmaSenha;
    private javax.swing.JLabel lConfirmaSenha1;
    private javax.swing.JLabel lConfirmaSenha2;
    private javax.swing.JLabel lConfirmaSenha3;
    private javax.swing.JLabel lDataProximoPagamento;
    private javax.swing.JLabel lDia;
    private javax.swing.JLabel lImagem;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNome1;
    private javax.swing.JLabel lNome2;
    private javax.swing.JLabel lNome3;
    private javax.swing.JLabel lNome4;
    private javax.swing.JLabel lProf;
    private javax.swing.JLabel lSal;
    private javax.swing.JFormattedTextField valorTransferido;
    // End of variables declaration//GEN-END:variables
}
