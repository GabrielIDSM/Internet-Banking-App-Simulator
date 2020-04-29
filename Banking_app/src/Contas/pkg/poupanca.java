package Contas.pkg;

import Classes_utilit.pkg.*;
import Interface.pkg.interfaceComum;
import java.math.BigDecimal;

public class poupanca extends javax.swing.JInternalFrame {
    //Atributos
    String conta;
    String senha;
    //Método construtor
    public poupanca(String conta, String senha) {
        String[] auxLeitura;
        auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Poupanca.txt");
        boolean temPoupanca = false;
        if(auxLeitura != null){
            if(!auxLeitura[0].equals("")) temPoupanca = true;
        }
        this.conta = conta;
        this.senha = senha;
        initComponents();
        if(temPoupanca){
            PlanosAtivos.setText(numeroPlanos(auxLeitura));
            Rendimentos.setText(totalRendimentos(auxLeitura));
        }else{
            Gerenciar.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PlanosAtivos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Rendimentos = new javax.swing.JLabel();
        Gerenciar = new javax.swing.JButton();
        AddP = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 230));
        setClosable(true);
        setTitle("Poupança");

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 100), 8));

        jPanel2.setBackground(new java.awt.Color(214, 214, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 0)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 10, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Planos Ativos");

        PlanosAtivos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PlanosAtivos.setForeground(new java.awt.Color(10, 10, 0));
        PlanosAtivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlanosAtivos.setText("0");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 10, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Rendimentos");

        Rendimentos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Rendimentos.setForeground(new java.awt.Color(70, 0, 0));
        Rendimentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rendimentos.setText("R$0,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(PlanosAtivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rendimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlanosAtivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rendimentos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Gerenciar.setBackground(new java.awt.Color(230, 230, 0));
        Gerenciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Gerenciar.setForeground(new java.awt.Color(20, 20, 20));
        Gerenciar.setText("Gerenciar");

        AddP.setBackground(new java.awt.Color(230, 230, 0));
        AddP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AddP.setForeground(new java.awt.Color(20, 20, 20));
        AddP.setText("Nova Poupança");
        AddP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Gerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddP, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPActionPerformed
        poupancaNovaPoupanca NvPo = new poupancaNovaPoupanca(this.conta, this.senha);
        interfaceComum.retornaNovaPoupanca(NvPo);
        this.dispose();
    }//GEN-LAST:event_AddPActionPerformed
    
    private String numeroPlanos(String[] poupanca){
        String resultado = "";
        try{
            int nAtivos = poupanca.length / 6;
            resultado = Integer.toString(nAtivos);
            return resultado;
        }catch (Exception e){
            return "";
        }
    }
    private String totalRendimentos(String[] poupanca){
        String resultado = "";
        try{
            BigDecimal[] rendimentosLista = new BigDecimal[poupanca.length/6];
            for (int i = 1, j = 0; i < poupanca.length; i += 6, j++) {
                rendimentosLista[j] = new BigDecimal(poupanca[i]);
            }
            BigDecimal resultadoBig = new BigDecimal("0");
            for(int i = 0; i < rendimentosLista.length; i++){
                resultadoBig = resultadoBig.add(rendimentosLista[i]);
            }
            resultado = resultadoBig.toPlainString();
            resultado = stringSaldo.retornaStringSaldo(resultado);
            return resultado;
        }catch (Exception e){
            return "";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddP;
    private javax.swing.JButton Gerenciar;
    private javax.swing.JLabel PlanosAtivos;
    private javax.swing.JLabel Rendimentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
