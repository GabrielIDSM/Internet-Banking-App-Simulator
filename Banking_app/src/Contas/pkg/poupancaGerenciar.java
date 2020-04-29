package Contas.pkg;

import Classes_utilit.pkg.*;
import java.math.BigDecimal;


public class poupancaGerenciar extends javax.swing.JInternalFrame {
    //Atributos
    String conta;
    String senha;
    int[] diasRestantes;
    BigDecimal[] valores;
    int[] tipo;
    //Construtor
    public poupancaGerenciar(String conta, String senha) {
        this.conta = conta;
        this.senha = senha;
        String[] auxLeitura;
        auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\Poupanca.txt");
        //Criação de arrays
        int tam = auxLeitura.length / 6;
        this.diasRestantes = new int[tam];
        this.valores = new BigDecimal[tam];
        this.tipo = new int[tam];
        for (int i = 0, j = 0; j < auxLeitura.length; i++, j += 6) {
            diasRestantes[i] = Integer.parseInt(auxLeitura[j]);
            valores[i] = new BigDecimal(auxLeitura[j + 1]);
            tipo[i] = Integer.parseInt(auxLeitura[j + 2]);
        }
        initComponents();
        //Configurar ComboBox
        for(int i = 0; i < tam; i++){
            CB.addItem("Poupança "+Integer.toString(i+1));
        }
        CB.setSelectedIndex(0);
        //Configurar painel
        int index = 0;
        //Configurar borda e mensagem
        switch (tipo[index]) {
            case 0:
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 0, 0), 4));
                TipoPoupanca.setText("Plano de 3 Meses");
                TipoPoupanca.setForeground(new java.awt.Color(200, 0, 0));
                break;
            case 1:
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 200, 0), 4));
                TipoPoupanca.setText("Plano de 6 Meses");
                TipoPoupanca.setForeground(new java.awt.Color(0, 200, 0));
                break;
            default:
                TipoPoupanca.setText("Plano de 12 Meses");
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 200), 4));
                TipoPoupanca.setForeground(new java.awt.Color(0, 0, 200));
                break;
        }
        //Configurar textos
        Rendimento.setText(stringSaldo.retornaStringSaldo(valores[index].toPlainString()));
        DiasRes.setText(Integer.toString(diasRestantes[index]));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TipoPoupanca = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DiasRes = new javax.swing.JLabel();
        Rendimento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SenhaText = new javax.swing.JPasswordField();
        Cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CB = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(230, 230, 230));
        setClosable(true);
        setTitle("Gerenciar");

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 8));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        TipoPoupanca.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        TipoPoupanca.setForeground(new java.awt.Color(0, 0, 0));
        TipoPoupanca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TipoPoupanca.setText("Tipo de Poupança");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dias Restantes");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Rendimento Total");

        DiasRes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        DiasRes.setForeground(new java.awt.Color(0, 0, 0));
        DiasRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiasRes.setText("Dias Restantes");

        Rendimento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Rendimento.setForeground(new java.awt.Color(0, 0, 0));
        Rendimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rendimento.setText("Rendimento Total");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cancelar uma poupança retorna 85% dos rendimentos para a conta");
        jLabel1.setAutoscrolls(true);

        SenhaText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Cancelar.setBackground(new java.awt.Color(230, 0, 0));
        Cancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(0, 0, 0));
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Confirme sua senha");
        jLabel4.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TipoPoupanca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SenhaText)
                        .addGap(18, 18, 18)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(DiasRes, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TipoPoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiasRes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CB.setBackground(new java.awt.Color(255, 255, 255));
        CB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CB.setForeground(new java.awt.Color(0, 0, 0));
        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        int qualPoupanca = CB.getSelectedIndex() * 6;
        //Verifica se a senha é a mesma
        char[] senhaChar = SenhaText.getPassword();
        String senhaLocal = "";
        for(int i = 0; i < senhaChar.length; i++) senhaLocal += senhaChar[i];
        if(this.senha.equals(senhaLocal)){
            modificarPoupanca.finalizaPoupanca(this.conta, qualPoupanca, true);
        }else{
            System.out.println("Não é a mesma senha");
        }
    }//GEN-LAST:event_CancelarActionPerformed

    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        int index = CB.getSelectedIndex();
        //Configurar borda e mensagem
        switch (tipo[index]) {
            case 0:
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 0, 0), 4));
                TipoPoupanca.setText("Plano de 3 Meses");
                TipoPoupanca.setForeground(new java.awt.Color(200, 0, 0));
                break;
            case 1:
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 200, 0), 4));
                TipoPoupanca.setText("Plano de 6 Meses");
                TipoPoupanca.setForeground(new java.awt.Color(0, 200, 0));
                break;
            default:
                TipoPoupanca.setText("Plano de 12 Meses");
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 200), 4));
                TipoPoupanca.setForeground(new java.awt.Color(0, 0, 200));
                break;
        }
        //Configurar textos
        Rendimento.setText(stringSaldo.retornaStringSaldo(valores[index].toPlainString()));
        DiasRes.setText(Integer.toString(diasRestantes[index]));
    }//GEN-LAST:event_CBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel DiasRes;
    private javax.swing.JLabel Rendimento;
    private javax.swing.JPasswordField SenhaText;
    private javax.swing.JLabel TipoPoupanca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
