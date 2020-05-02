package Contas.pkg;

import Classes_utilit.pkg.emprestimos;
import Classes_utilit.pkg.leituraEscrita;
import Classes_utilit.pkg.stringSaldo;
import Classes_utilit.pkg.temporizadorDataTempo;
import java.math.BigDecimal;

/**
 *
 * @author Gabri
 */
public class emprestimo extends javax.swing.JInternalFrame {
    //Atributos
    String conta;
    String senha;
    String limite;
    BigDecimal[] valoresEmp;
    //Construtor
    public emprestimo(String conta, String senha) {
        this.conta = conta;
        this.senha = senha;
        String[] auxLeitura;
        auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Emprestimo.txt");
        boolean temEmp = false;
        if(auxLeitura != null) if(!auxLeitura[0].equals("")) temEmp = true;
        auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\LimiteEmprestimo.txt");
        this.limite = auxLeitura[0];
        String data = temporizadorDataTempo.retornaStringDataAtual();
        initComponents();
        Password.setEnabled(false);
        Confirmar.setEnabled(false);
        if(temEmp){
            TP.removeAll();
            TP.repaint();
            TP.revalidate();
            //Alterar informações
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Emprestimo.txt");
            VE.setText(stringSaldo.retornaStringSaldo(auxLeitura[0]));
            VdP.setText(stringSaldo.retornaStringSaldo(auxLeitura[1]));
            TaP.setText(stringSaldo.retornaStringSaldo(auxLeitura[2]));
            PR.setText(auxLeitura[3]);
            int[] dataArray = new int[3];
            dataArray[0] = Integer.parseInt(auxLeitura[4]);
            dataArray[1] = Integer.parseInt(auxLeitura[5]);
            dataArray[2] = Integer.parseInt(auxLeitura[6]);
            ProxPagamento.setText(emprestimos.transformaEmData(dataArray));
            TP.add(EmpAtivo);
            TP.repaint();
            TP.revalidate();
        }else{
            TP.removeAll();
            TP.repaint();
            TP.revalidate();
            //Alterar informações
            Limite.setText(stringSaldo.retornaStringSaldo(limite));
            dataPrimeiroPagamento.setText(emprestimos.retornaPrimeiraDataString());
            TP.add(NovoEmp);
            TP.repaint();
            TP.revalidate();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TP = new javax.swing.JPanel();
        EmpAtivo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VE = new javax.swing.JLabel();
        TaP = new javax.swing.JLabel();
        VdP = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PR = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ProxPagamento = new javax.swing.JLabel();
        NovoEmp = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ValorEmp = new javax.swing.JFormattedTextField();
        AlterarValorEmp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Limite = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dataPrimeiroPagamento = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Confirmar = new javax.swing.JButton();
        totalAPagar = new javax.swing.JLabel();
        valorParcelas = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Empréstimo");

        TP.setBackground(new java.awt.Color(230, 230, 230));
        TP.setLayout(new java.awt.CardLayout());

        EmpAtivo.setBackground(new java.awt.Color(0, 70, 0));

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 50, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Valor do Empréstimo");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 50, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total a Pagar");

        VE.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        VE.setForeground(new java.awt.Color(70, 0, 0));
        VE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VE.setText("Valor do Empréstimo");

        TaP.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TaP.setForeground(new java.awt.Color(70, 0, 0));
        TaP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TaP.setText("Total a Pagar");

        VdP.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        VdP.setForeground(new java.awt.Color(70, 0, 0));
        VdP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VdP.setText("Valor das Parcelas");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 50, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Parcelas Restantes");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 50, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Valor das Parcelas");

        PR.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PR.setForeground(new java.awt.Color(70, 0, 0));
        PR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PR.setText("Parcelas Restantes");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 50, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Próximo Pagamento:");

        ProxPagamento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ProxPagamento.setForeground(new java.awt.Color(0, 50, 0));
        ProxPagamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProxPagamento.setText("00/00/0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(VE, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TaP, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PR, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VdP, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VdP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout EmpAtivoLayout = new javax.swing.GroupLayout(EmpAtivo);
        EmpAtivo.setLayout(EmpAtivoLayout);
        EmpAtivoLayout.setHorizontalGroup(
            EmpAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpAtivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EmpAtivoLayout.setVerticalGroup(
            EmpAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpAtivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TP.add(EmpAtivo, "card2");

        NovoEmp.setBackground(new java.awt.Color(0, 70, 0));

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 50, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Valor do Empréstimo");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 50, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total a Pagar");

        ValorEmp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        ValorEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ValorEmp.setText("0,00");
        ValorEmp.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        AlterarValorEmp.setBackground(new java.awt.Color(0, 70, 0));
        AlterarValorEmp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AlterarValorEmp.setForeground(new java.awt.Color(255, 255, 255));
        AlterarValorEmp.setText("Alterar");
        AlterarValorEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarValorEmpActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 50, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Número de Parcelas");

        CB.setBackground(new java.awt.Color(100, 255, 100));
        CB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CB.setForeground(new java.awt.Color(0, 0, 0));
        CB.setMaximumRowCount(5);
        CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 50, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Valor das Parcelas");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 50, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Limite:");

        Limite.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Limite.setForeground(new java.awt.Color(140, 0, 0));
        Limite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Limite.setText("R$0,00");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 50, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Primeiro Pagamento:");

        dataPrimeiroPagamento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dataPrimeiroPagamento.setForeground(new java.awt.Color(0, 50, 0));
        dataPrimeiroPagamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataPrimeiroPagamento.setText("00/00/0000");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(200, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Confirme sua senha:");

        Password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        Confirmar.setBackground(new java.awt.Color(200, 0, 0));
        Confirmar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(0, 0, 0));
        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        totalAPagar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        totalAPagar.setForeground(new java.awt.Color(0, 0, 0));
        totalAPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAPagar.setText("R$0,00");

        valorParcelas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        valorParcelas.setForeground(new java.awt.Color(0, 0, 0));
        valorParcelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valorParcelas.setText("R$0,00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ValorEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AlterarValorEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(totalAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dataPrimeiroPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ValorEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(AlterarValorEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalAPagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CB, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(valorParcelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dataPrimeiroPagamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Limite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Password)
                    .addComponent(Confirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout NovoEmpLayout = new javax.swing.GroupLayout(NovoEmp);
        NovoEmp.setLayout(NovoEmpLayout);
        NovoEmpLayout.setHorizontalGroup(
            NovoEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovoEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        NovoEmpLayout.setVerticalGroup(
            NovoEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NovoEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        TP.add(NovoEmp, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlterarValorEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarValorEmpActionPerformed
        dataPrimeiroPagamento.setText(emprestimos.retornaPrimeiraDataString());
        int nDeParcela = CB.getSelectedIndex() + 1;
        String valorDoEmp = ValorEmp.getText().replace(',', '.');
        BigDecimal valorDoEmpBD = new BigDecimal(valorDoEmp);
        BigDecimal limiteBD = new BigDecimal(limite);
        if(valorDoEmpBD.compareTo(new BigDecimal("0.0")) > 0 && valorDoEmpBD.compareTo(limiteBD) <= 0){
            Password.setEnabled(true);
            Confirmar.setEnabled(true);
            BigDecimal[] valores = emprestimos.calculaValorTotalEParcelas(valorDoEmpBD, nDeParcela);
            totalAPagar.setText(stringSaldo.retornaStringSaldo(valores[1].toPlainString()));
            valorParcelas.setText(stringSaldo.retornaStringSaldo(valores[0].toPlainString()));
        }else{
            Password.setEnabled(false);
            Confirmar.setEnabled(false);
            totalAPagar.setText("R$0,00");
            valorParcelas.setText("R$0,00");
            ValorEmp.setText("0,00");
        }        
    }//GEN-LAST:event_AlterarValorEmpActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        int nDeParcela = CB.getSelectedIndex() + 1;
        String valorDoEmp = ValorEmp.getText().replace(',', '.');
        BigDecimal valorDoEmpBD = new BigDecimal(valorDoEmp);
        BigDecimal[] valores = emprestimos.calculaValorTotalEParcelas(valorDoEmpBD, nDeParcela);
        char[] senhaChar = Password.getPassword();
        String senha = "";
        for(int i = 0; i < senhaChar.length; i++){
            senha += senhaChar[i];
        }
        if(senha.equals(this.senha)){
            if(emprestimos.criaNovoEmprestimo(this.conta, valores, valorDoEmp, nDeParcela)){
                System.out.println("Novo empréstimo criado!");
            }else{
                System.out.println("Erro a criar novo Empréstimo");
            }
            this.dispose();
        }else{
            Password.setText("");
            Password.setEnabled(false);
            Confirmar.setEnabled(false);
            totalAPagar.setText("R$0,00");
            valorParcelas.setText("R$0,00");
            CB.setSelectedIndex(0);
            ValorEmp.setText("0,00");
        }
    }//GEN-LAST:event_ConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarValorEmp;
    private javax.swing.JComboBox<String> CB;
    private javax.swing.JButton Confirmar;
    private javax.swing.JPanel EmpAtivo;
    private javax.swing.JLabel Limite;
    private javax.swing.JPanel NovoEmp;
    private javax.swing.JLabel PR;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel ProxPagamento;
    private javax.swing.JPanel TP;
    private javax.swing.JLabel TaP;
    private javax.swing.JLabel VE;
    private javax.swing.JFormattedTextField ValorEmp;
    private javax.swing.JLabel VdP;
    private javax.swing.JLabel dataPrimeiroPagamento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel totalAPagar;
    private javax.swing.JLabel valorParcelas;
    // End of variables declaration//GEN-END:variables
}
