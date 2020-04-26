/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.pkg;

import Contas.pkg.listaFuncionarios;
import Classes_utilit.pkg.leituraEscrita;
import Classes_utilit.pkg.stringSaldo;
import Classes_utilit.pkg.temporizadorDataTempo;
import Contas.pkg.fazerTransferencia;
import Contas.pkg.verificarExtrato;
import Contas.pkg.pagamentoAuto;

/**
 *
 * @author Gabri
 */
public class interfaceEmpresa extends javax.swing.JPanel {
    //Atributos IN
    static fazerTransferencia T = null;
    static verificarExtrato V = null;
    static listaFuncionarios F = null;
    static pagamentoAuto P = null;
    String conta;
    String senha;
    String saldo;
    String nome;
    String[] auxS;
    //Método construtor IN
    public interfaceEmpresa(String conta, String senha) {
        this.conta = conta;
        this.senha = senha;
        this.auxS = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +this.conta+"\\Saldo.txt");
        this.saldo = this.auxS[this.auxS.length - 1];
        String[] auxNome = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +this.conta+"\\Nome.txt");
        this.nome = auxNome[0];
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lSaldo = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        lImagem = new javax.swing.JLabel();
        lImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pkg/"+this.conta+".png")));
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButtonTransf = new javax.swing.JButton();
        jButtonExtrato = new javax.swing.JButton();
        jButtonFunc = new javax.swing.JButton();
        jButtonPagAut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lData = new javax.swing.JLabel();

        setBackground(new java.awt.Color(70, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(214, 214, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0), 2));

        lSaldo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lSaldo.setForeground(new java.awt.Color(70, 0, 0));
        lSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSaldo.setText("Saldo");
        lSaldo.setText("Saldo: "+stringSaldo.retornaStringSaldo(this.saldo));

        lNome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lNome.setForeground(new java.awt.Color(70, 0, 0));
        lNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome.setText("Nome");
        lNome.setText(this.nome);

        lImagem.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lImagem.setForeground(new java.awt.Color(0, 0, 0));
        lImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(lImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lNome)
                .addGap(18, 18, 18)
                .addComponent(lSaldo)
                .addGap(20, 20, 20))
        );

        jDesktopPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jDesktopPane1ComponentRemoved(evt);
            }
        });
        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonTransf.setBackground(new java.awt.Color(70, 0, 0));
        jButtonTransf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonTransf.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTransf.setText("Transferência");
        jButtonTransf.setBorder(null);
        jButtonTransf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransfActionPerformed(evt);
            }
        });

        jButtonExtrato.setBackground(new java.awt.Color(70, 0, 0));
        jButtonExtrato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonExtrato.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExtrato.setText("Extrato");
        jButtonExtrato.setBorder(null);
        jButtonExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExtratoActionPerformed(evt);
            }
        });

        jButtonFunc.setBackground(new java.awt.Color(70, 0, 0));
        jButtonFunc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonFunc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFunc.setText("Funcionários");
        jButtonFunc.setBorder(null);
        jButtonFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncActionPerformed(evt);
            }
        });

        jButtonPagAut.setBackground(new java.awt.Color(70, 0, 0));
        jButtonPagAut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonPagAut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPagAut.setText("Pagamento Automático");
        jButtonPagAut.setBorder(null);
        jButtonPagAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagAutActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonTransf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPagAut, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTransf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPagAut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTA EMPRESA");

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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lData, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lData))
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTransfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransfActionPerformed
        if (T != null) {
            jDesktopPane1.remove(T);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        T = new fazerTransferencia(this.conta, this.senha, this.saldo);
        jDesktopPane1.add(T);
        T.setLocation(40,40);
        T.setVisible(true);
    }//GEN-LAST:event_jButtonTransfActionPerformed

    private void jDesktopPane1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentRemoved
        this.auxS = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +this.conta+"\\Saldo.txt");
        this.saldo = this.auxS[this.auxS.length - 1];
        lSaldo.setText("Saldo: "+stringSaldo.retornaStringSaldo(this.saldo));
    }//GEN-LAST:event_jDesktopPane1ComponentRemoved

    private void jButtonExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExtratoActionPerformed
        if (V != null) {
            jDesktopPane1.remove(V);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        V = new verificarExtrato(this.conta);
        jDesktopPane1.add(V);
        V.setLocation(40,40);
        V.setVisible(true);
    }//GEN-LAST:event_jButtonExtratoActionPerformed

    private void jButtonFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncActionPerformed
        if (F != null) {
            jDesktopPane1.remove(F);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        F = new listaFuncionarios(this.conta, this.saldo, this.nome, this.senha);
        jDesktopPane1.add(F);
        F.setLocation(20,20);
        F.setVisible(true);
    }//GEN-LAST:event_jButtonFuncActionPerformed

    private void update(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update
        this.auxS = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +this.conta+"\\Saldo.txt");
        this.saldo = this.auxS[this.auxS.length - 1];
        lSaldo.setText("Saldo: "+stringSaldo.retornaStringSaldo(this.saldo));
    }//GEN-LAST:event_update

    private void jDesktopPane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseExited
        this.auxS = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +this.conta+"\\Saldo.txt");
        this.saldo = this.auxS[this.auxS.length - 1];
        lSaldo.setText("Saldo: "+stringSaldo.retornaStringSaldo(this.saldo));
    }//GEN-LAST:event_jDesktopPane1MouseExited

    private void jButtonPagAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagAutActionPerformed
        if (P != null) {
            jDesktopPane1.remove(P);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        P = new pagamentoAuto(this.conta);
        jDesktopPane1.add(P);
        P.setLocation(40,40);
        P.setVisible(true);
    }//GEN-LAST:event_jButtonPagAutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExtrato;
    private javax.swing.JButton jButtonFunc;
    private javax.swing.JButton jButtonPagAut;
    private javax.swing.JButton jButtonTransf;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lData;
    private javax.swing.JLabel lImagem;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lSaldo;
    // End of variables declaration//GEN-END:variables
}
