package Contas.pkg;

import Classes_utilit.pkg.leituraEscrita;
import Classes_utilit.pkg.modificarPoupanca;
import java.math.BigDecimal;
import javax.swing.JFormattedTextField;

public class poupancaNovaPoupanca extends javax.swing.JInternalFrame {
    //Atributos
    int opcao;
    String conta;
    String senha;
    //Construtor
    public poupancaNovaPoupanca(String conta, String senha) {
        this.conta = conta;
        this.senha = senha;
        initComponents();
        Valor.setEnabled(false);
        Senha.setEnabled(false);
        Confirmar.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Tres = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Seis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Doze = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        Valor = new javax.swing.JFormattedTextField();
        Senha = new javax.swing.JPasswordField();
        L2 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 230));
        setClosable(true);
        setTitle("Nova Poupança");

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 100), 8));

        jPanel2.setBackground(new java.awt.Color(214, 214, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 0, 0), 2));

        Tres.setBackground(new java.awt.Color(200, 0, 0));
        Tres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Tres.setForeground(new java.awt.Color(230, 230, 230));
        Tres.setText("Escolher");
        BG.add(Tres);
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("3 Meses");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rendimento");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0,5% a.m");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Tres)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(214, 214, 214));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 200, 0), 2));

        Seis.setBackground(new java.awt.Color(0, 200, 0));
        Seis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Seis.setForeground(new java.awt.Color(0, 0, 0));
        Seis.setText("Escolher");
        BG.add(Seis);
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 200, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("6 Meses");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rendimento");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0,75% a.m");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(Seis)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(214, 214, 214));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 200), 2));

        Doze.setBackground(new java.awt.Color(0, 0, 200));
        Doze.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Doze.setForeground(new java.awt.Color(230, 230, 230));
        Doze.setText("Escolher");
        BG.add(Doze);
        Doze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DozeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 200));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("12 Meses");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rendimento");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("1,1% a.m");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Doze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(Doze)
                .addContainerGap())
        );

        L1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        L1.setForeground(new java.awt.Color(30, 0, 0));
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setText("Escolha o valor que deseja aplicar");

        Valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###.00"))));
        Valor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Valor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorFocusLost(evt);
            }
        });
        Valor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorMouseClicked(evt);
            }
        });

        Senha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        L2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        L2.setForeground(new java.awt.Color(200, 0, 0));
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2.setText("Confirme sua senha");

        Confirmar.setBackground(new java.awt.Color(0, 240, 0));
        Confirmar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(0, 0, 0));
        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Senha)
                    .addComponent(Confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorFocusGained
        Valor.setText("");
    }//GEN-LAST:event_ValorFocusGained

    private void ValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorFocusLost
        Valor.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_ValorFocusLost

    private void ValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorMouseClicked
        Valor.setText("");
        Valor.setCaretPosition(0);
    }//GEN-LAST:event_ValorMouseClicked

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        String[] auxLeitura;
        //Verifica se a senha é a mesma
        String senha = "";
        char[] senhaC = Senha.getPassword();
        for(int i = 0; i < senhaC.length; i++){
            senha += senhaC[i];
        }
        if(senha.equals(this.senha)){
            try{
                //Obter o tipo de poupança
                int tipoPoupanca = this.opcao;
                //Obter o valor
                BigDecimal valor = new BigDecimal(Valor.getText().replace(',', '.'));
                //Obter o saldo
                auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+this.conta+"\\Saldo.txt");
                BigDecimal saldo = new BigDecimal(auxLeitura[0]);
                //Verificar o valor e o saldo
                boolean operacaoValida = false;
                if(valor.compareTo(saldo) < 0) operacaoValida = true;
                //Chamar a função
                if(operacaoValida){
                    //Modificar saldo
                    saldo = saldo.subtract(valor);
                    leituraEscrita.Reescrita("Arquivos\\DadosContas\\"+conta+"\\Saldo.txt", saldo.toPlainString());
                    boolean foiPossivel = modificarPoupanca.criaNovaPoupanca(this.conta, tipoPoupanca, valor);
                    if(!foiPossivel) throw new Exception();
                }else throw new Exception();
            }catch(Exception e){
                System.out.println("Não foi possível criar uma nova poupança");
            }
        }else{
            System.out.println("Não é a mesma senha");
        }
        this.dispose();
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        this.opcao = 0;
        //Mudar a cor e a borda dos botões
        Tres.setForeground(new java.awt.Color(0, 0, 0));
        Doze.setForeground(new java.awt.Color(230, 230, 230));
        Tres.setBackground(new java.awt.Color(200, 200, 0));
        Seis.setBackground(new java.awt.Color(0, 200, 0));
        Doze.setBackground(new java.awt.Color(0, 0, 200));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 0), 2));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 200, 0), 2));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 200), 2));
        //Torna os botões visíveis
        Valor.setEnabled(true);
        Senha.setEnabled(true);
        Confirmar.setEnabled(true);
    }//GEN-LAST:event_TresActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        this.opcao = 1;
        //Mudar a cor e a borda dos botões
        Tres.setForeground(new java.awt.Color(230, 230, 230));
        Doze.setForeground(new java.awt.Color(230, 230, 230));
        Tres.setBackground(new java.awt.Color(200, 0, 0));
        Seis.setBackground(new java.awt.Color(200, 200, 0));
        Doze.setBackground(new java.awt.Color(0, 0, 200));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 0, 0), 2));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 0), 2));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 200), 2));
        //Torna os botões visíveis
        Valor.setEnabled(true);
        Senha.setEnabled(true);
        Confirmar.setEnabled(true);
    }//GEN-LAST:event_SeisActionPerformed

    private void DozeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DozeActionPerformed
        this.opcao = 2;
        //Mudar a cor e a borda dos botões
        Tres.setForeground(new java.awt.Color(230, 230, 230));
        Doze.setForeground(new java.awt.Color(0, 0, 0));
        Tres.setBackground(new java.awt.Color(200, 0, 0));
        Seis.setBackground(new java.awt.Color(0, 200, 0));
        Doze.setBackground(new java.awt.Color(200, 200, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 0, 0), 2));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 200, 0), 2));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 0), 2));
        //Torna os botões visíveis
        Valor.setEnabled(true);
        Senha.setEnabled(true);
        Confirmar.setEnabled(true);
    }//GEN-LAST:event_DozeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG;
    private javax.swing.JButton Confirmar;
    private javax.swing.JButton Doze;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JButton Seis;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JButton Tres;
    private javax.swing.JFormattedTextField Valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JFormattedTextField valorTransferido;
    private javax.swing.JFormattedTextField valorTransferido1;
    // End of variables declaration//GEN-END:variables
}
