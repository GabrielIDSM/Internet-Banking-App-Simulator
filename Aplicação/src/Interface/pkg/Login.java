package Interface.pkg;

import Classes_utilit.pkg.*;
import javax.swing.JFormattedTextField;

/**
 *
 * @author Gabri
 */
public class Login extends javax.swing.JInternalFrame {
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginP = new javax.swing.JPanel();
        ContaL = new javax.swing.JLabel();
        SenhaL = new javax.swing.JLabel();
        SenhaText = new javax.swing.JPasswordField();
        LoginB = new javax.swing.JButton();
        ContaText = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Login");

        LoginP.setBackground(new java.awt.Color(230, 230, 230));
        LoginP.setForeground(new java.awt.Color(204, 204, 255));

        ContaL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ContaL.setForeground(new java.awt.Color(0, 0, 0));
        ContaL.setText("Conta");

        SenhaL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SenhaL.setForeground(new java.awt.Color(0, 0, 0));
        SenhaL.setText("Senha");

        SenhaText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        LoginB.setBackground(new java.awt.Color(153, 153, 255));
        LoginB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LoginB.setForeground(new java.awt.Color(0, 0, 0));
        LoginB.setText("Login");
        LoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBActionPerformed(evt);
            }
        });

        try {
            ContaText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ContaText.setText("");
        ContaText.setToolTipText("");
        ContaText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ContaText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContaTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContaTextFocusLost(evt);
            }
        });
        ContaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContaTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginPLayout = new javax.swing.GroupLayout(LoginP);
        LoginP.setLayout(LoginPLayout);
        LoginPLayout.setHorizontalGroup(
            LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPLayout.createSequentialGroup()
                        .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SenhaL)
                            .addComponent(ContaL))
                        .addGap(18, 18, 18)
                        .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ContaText)
                            .addComponent(SenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        LoginPLayout.setVerticalGroup(
            LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContaL)
                    .addComponent(ContaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaL)
                    .addComponent(SenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBActionPerformed
       interfaceFrame.Conta = ContaText.getText();
       interfaceFrame.Senha = SenhaText.getPassword();
       this.dispose();
    }//GEN-LAST:event_LoginBActionPerformed

    private void ContaTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContaTextFocusGained
        ContaText.setText("");
        ContaText.setCaretPosition(0);
    }//GEN-LAST:event_ContaTextFocusGained

    private void ContaTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContaTextFocusLost
        ContaText.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_ContaTextFocusLost

    private void ContaTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContaTextMouseClicked
        ContaText.setText("");
        ContaText.setCaretPosition(0);
    }//GEN-LAST:event_ContaTextMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContaL;
    private javax.swing.JFormattedTextField ContaText;
    private javax.swing.JButton LoginB;
    private javax.swing.JPanel LoginP;
    private javax.swing.JLabel SenhaL;
    private javax.swing.JPasswordField SenhaText;
    // End of variables declaration//GEN-END:variables
}
