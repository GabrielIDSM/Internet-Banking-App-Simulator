package Contas.pkg;

import Classes_utilit.pkg.*;

public class empregoOfertas extends javax.swing.JInternalFrame {
    //Atributos
    String senha;
    String conta;
    String[] empresas = null;
    String[] cargos = null;
    String[] salarios = null;
    //Construtor
    public empregoOfertas(String conta, String senha) {
        this.senha = senha;
        this.conta = conta;
        boolean temProposta = true;
        String[] auxLeitura;
        auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + conta + "\\Propostas.txt");
        if (auxLeitura == null) {
            temProposta = false;
        } else {
            if (auxLeitura[0].equals("")) {
                temProposta = false;
            }
        }
        initComponents();
        CSS.setVisible(false);
        Password.setVisible(false);
        Ac.setVisible(false);
        Re.setVisible(false);
        CbBox.addItem("Selecionar");
        if (temProposta) {
            int lim = auxLeitura.length/3;
            int tam = auxLeitura.length;
            String[] empresas = new String[lim];
            String[] cargos = new String[lim];
            String[] salarios = new String[lim];
            for(int i = 0, j = 0; i < tam; i+=3, j++){
                empresas[j] = auxLeitura[i];
                salarios[j] = auxLeitura[i+1];
                cargos[j] = auxLeitura[i+2];
            }
            for(int i = 0; i < empresas.length; i++){
                CbBox.addItem(empresas[i]);
            }
            this.empresas = empresas;
            this.cargos = cargos;
            this.salarios = salarios;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Imagem = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Nome1 = new javax.swing.JLabel();
        Cargo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Cargo1 = new javax.swing.JLabel();
        Salario = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Ac = new javax.swing.JButton();
        Re = new javax.swing.JButton();
        CSS = new javax.swing.JLabel();
        CbBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(230, 230, 230));
        setClosable(true);
        setTitle("Ofertas");

        jPanel1.setBackground(new java.awt.Color(0, 0, 70));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        jPanel3.setBackground(new java.awt.Color(214, 214, 214));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 70)));

        Imagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Nome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Nome.setForeground(new java.awt.Color(0, 0, 70));
        Nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nome.setText("---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Nome)
                .addGap(70, 70, 70))
        );

        jPanel4.setBackground(new java.awt.Color(214, 214, 214));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 70)));

        Nome1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Nome1.setForeground(new java.awt.Color(0, 0, 70));
        Nome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nome1.setText("Cargo:");

        Cargo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Cargo.setForeground(new java.awt.Color(0, 0, 70));
        Cargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargo.setText("---");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome1)
                .addGap(24, 24, 24)
                .addComponent(Cargo)
                .addGap(6, 6, 6))
        );

        jPanel5.setBackground(new java.awt.Color(214, 214, 214));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 70)));

        Cargo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Cargo1.setForeground(new java.awt.Color(0, 0, 70));
        Cargo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargo1.setText("Salário:");

        Salario.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        Salario.setForeground(new java.awt.Color(70, 0, 0));
        Salario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salario.setText("---");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cargo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Salario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Cargo1)
                .addGap(18, 18, 18)
                .addComponent(Salario)
                .addGap(6, 6, 6))
        );

        Password.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        Ac.setBackground(new java.awt.Color(0, 200, 0));
        Ac.setForeground(new java.awt.Color(255, 255, 255));
        Ac.setText("Aceitar");
        Ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcActionPerformed(evt);
            }
        });

        Re.setBackground(new java.awt.Color(220, 0, 0));
        Re.setForeground(new java.awt.Color(255, 255, 255));
        Re.setText("Recusar");
        Re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReActionPerformed(evt);
            }
        });

        CSS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CSS.setForeground(new java.awt.Color(0, 0, 70));
        CSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CSS.setText("Confirme sua senha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CSS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Ac, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(Re, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CSS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ac, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(Re, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        CbBox.setBackground(new java.awt.Color(0, 0, 70));
        CbBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CbBox.setForeground(new java.awt.Color(230, 230, 230));
        CbBox.setMaximumRowCount(4);
        CbBox.setBorder(null);
        CbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(CbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbBoxActionPerformed
        int index = CbBox.getSelectedIndex() - 1;
        Password.setText("");
        String[] auxLeitura;
        if (index >= 0) {
            Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pkg/" + empresas[index] + ".png")));
            auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\" + empresas[index] + "\\Nome.txt");
            Nome.setText(auxLeitura[0]);
            Salario.setText(stringSaldo.retornaStringSaldo(salarios[index]));
            Cargo.setText(cargos[index]);
            CSS.setVisible(true);
            Password.setVisible(true);
            Ac.setVisible(true);
            Re.setVisible(true);
        } else {
            Imagem.setIcon(null);
            Nome.setText("---");
            Salario.setText("---");
            Cargo.setText("---");
            CSS.setVisible(false);
            Password.setVisible(false);
            Ac.setVisible(false);
            Re.setVisible(false);
        }
    }//GEN-LAST:event_CbBoxActionPerformed

    private void AcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcActionPerformed
        int index = CbBox.getSelectedIndex() - 1;
        char[] senhaChar = Password.getPassword();
        String senha = "";
        for(int i = 0; i < senhaChar.length; i++){
            senha += senhaChar[i];
        }
        if(senha.equals(this.senha)){
            boolean foiPossivel = demitirContratar.aceitarContrato(empresas[index], this.conta, cargos[index], salarios[index]);
            if(foiPossivel) System.out.println("Foi possível aceitar a proposta!");
            else System.out.println("Não foi possível aceitar a proposta");
        }else{
            System.out.println("Senha incorreta");
            System.out.println("Senha digitada: "+senha);
            System.out.println("Senha correta: "+this.senha);
        }
        this.dispose();
    }//GEN-LAST:event_AcActionPerformed

    private void ReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReActionPerformed
        int index = CbBox.getSelectedIndex() - 1;
        char[] senhaChar = Password.getPassword();
        String senha = "";
        for(int i = 0; i < senhaChar.length; i++){
            senha += senhaChar[i];
        }
        if(senha.equals(this.senha)){
            demitirContratar.excluirProposta(empresas[index], this.conta);
        }
        this.dispose();
    }//GEN-LAST:event_ReActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ac;
    private javax.swing.JLabel CSS;
    private javax.swing.JLabel Cargo;
    private javax.swing.JLabel Cargo1;
    private javax.swing.JComboBox<String> CbBox;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Nome1;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Re;
    private javax.swing.JLabel Salario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
