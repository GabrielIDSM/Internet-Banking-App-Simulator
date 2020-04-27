package Contas.pkg;

import Classes_utilit.pkg.*;
import Interface.pkg.interfaceComum;

public class emprego extends javax.swing.JInternalFrame {
    //Atributos
    String conta;
    String senha;
    boolean empregado = true;
    String empregadorConta = "";
    static empregoCargoAtual E;
    static empregoDem D;
    static empregoOfertas O;
    //Método construtor
    public emprego(String conta, String senha) {
        String [] auxLeitura;
        auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Emprego.txt");
        if(auxLeitura[0].equals("D")){
            empregado = false;
        }else{
            empregadorConta = auxLeitura[0];
        }
        this.conta = conta;
        this.senha = senha;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CA = new javax.swing.JButton();
        Ofertas = new javax.swing.JButton();
        Dem = new javax.swing.JButton();

        setClosable(true);
        setTitle("Emprego");

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        CA.setBackground(new java.awt.Color(0, 0, 70));
        CA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CA.setForeground(new java.awt.Color(255, 255, 255));
        CA.setText("Cargo Atual");
        if(!empregado) CA.setEnabled(false);
        CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAActionPerformed(evt);
            }
        });

        Ofertas.setBackground(new java.awt.Color(0, 0, 70));
        Ofertas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Ofertas.setForeground(new java.awt.Color(255, 255, 255));
        Ofertas.setText("Ofertas");
        if(empregado) Ofertas.setEnabled(false);
        Ofertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfertasActionPerformed(evt);
            }
        });

        Dem.setBackground(new java.awt.Color(0, 0, 70));
        Dem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Dem.setForeground(new java.awt.Color(255, 255, 255));
        Dem.setText("Demissão");
        if(!empregado) Dem.setEnabled(false);
        Dem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CA, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ofertas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Ofertas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Dem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAActionPerformed
        E = new empregoCargoAtual(this.conta, this.empregadorConta);
        interfaceComum.retornaECA(E);
        this.dispose();
    }//GEN-LAST:event_CAActionPerformed

    private void OfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfertasActionPerformed
        O = new empregoOfertas(this.conta, this.senha);
        interfaceComum.retornaOfertas(O);
        this.dispose();
    }//GEN-LAST:event_OfertasActionPerformed

    private void DemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemActionPerformed
        D = new empregoDem(this.conta, this.empregadorConta);
        interfaceComum.retornaDem(D);
        this.dispose();
    }//GEN-LAST:event_DemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CA;
    private javax.swing.JButton Dem;
    private javax.swing.JButton Ofertas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
