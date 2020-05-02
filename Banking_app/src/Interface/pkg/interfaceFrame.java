package Interface.pkg;

import Classes_utilit.pkg.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author Gabri
 */
public class interfaceFrame extends javax.swing.JFrame {
    //Atributos
    static String Conta = "";
    static char[] Senha;
    static boolean validade = false;
    static public String[] ContasC;
    static public String[] ContasE;
    static public String[] ContasA;
    static interfaceComum IC = null;
    static interfaceEmpresa IE = null;
    static interfaceAdm IA = null;
    public interfaceFrame() {
        modificarPoupanca.sistemaDeRendimentoAuto();
        sistemaDePagamentoAutomatico();
        emprestimos.SistemaDePagamentoAutomatico();
        initComponents();
        Login L = new Login();
        Desk.add(L);
        L.setLocation(284, 200);
        L.setVisible(true);
        Desk.repaint();
        Desk.revalidate();
        LogoutMenuItem.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JInternalFrame();
        LoginP = new javax.swing.JPanel();
        ContaL = new javax.swing.JLabel();
        SenhaL = new javax.swing.JLabel();
        SenhaText = new javax.swing.JPasswordField();
        LoginB = new javax.swing.JButton();
        Aviso = new javax.swing.JLabel();
        Aviso.setVisible(false);
        ContaText = new javax.swing.JFormattedTextField();
        Desk = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        LoginMenuItem = new javax.swing.JMenuItem();
        LogoutMenuItem = new javax.swing.JMenuItem();
        NovaConta = new javax.swing.JMenu();
        NCC = new javax.swing.JMenuItem();
        NCE = new javax.swing.JMenuItem();

        Login.setTitle("Login");
        Login.setVisible(true);

        LoginP.setForeground(new java.awt.Color(204, 204, 255));

        ContaL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ContaL.setText("Conta");

        SenhaL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SenhaL.setText("Senha");

        SenhaText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        LoginB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LoginB.setText("Login");

        Aviso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Aviso.setForeground(new java.awt.Color(255, 100, 100));
        Aviso.setText("Número da conta e/ou senha incorreta!");

        try {
            ContaText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ContaText.setText("");
        ContaText.setToolTipText("");
        ContaText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        javax.swing.GroupLayout LoginPLayout = new javax.swing.GroupLayout(LoginP);
        LoginP.setLayout(LoginPLayout);
        LoginPLayout.setHorizontalGroup(
            LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LoginPLayout.createSequentialGroup()
                        .addComponent(Aviso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPLayout.createSequentialGroup()
                        .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SenhaL)
                            .addComponent(ContaL))
                        .addGap(18, 18, 18)
                        .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SenhaText, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(ContaText))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        LoginPLayout.setVerticalGroup(
            LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContaL)
                    .addComponent(ContaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaL)
                    .addComponent(SenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aviso))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicação bancária");
        setResizable(false);

        Desk.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                DeskComponentRemoved(evt);
            }
        });

        javax.swing.GroupLayout DeskLayout = new javax.swing.GroupLayout(Desk);
        Desk.setLayout(DeskLayout);
        DeskLayout.setHorizontalGroup(
            DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        DeskLayout.setVerticalGroup(
            DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );

        jMenu2.setText("Entrada");

        LoginMenuItem.setText("Login");
        LoginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(LoginMenuItem);

        LogoutMenuItem.setText("Logout");
        LogoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(LogoutMenuItem);

        Menu.add(jMenu2);

        NovaConta.setText("Nova conta");

        NCC.setText("Conta Comum");
        NCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NCCActionPerformed(evt);
            }
        });
        NovaConta.add(NCC);

        NCE.setText("Conta Empresa");
        NCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NCEActionPerformed(evt);
            }
        });
        NovaConta.add(NCE);

        Menu.add(NovaConta);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginMenuItemActionPerformed
        if (IE == null && IC == null && IA == null) {
            Desk.removeAll();
            Desk.repaint();
            Desk.revalidate();
            Login L = new Login();
            Desk.add(L);
            L.setLocation(284, 200);
            L.setVisible(true);
            Desk.repaint();
            Desk.revalidate();
        }
    }//GEN-LAST:event_LoginMenuItemActionPerformed

    private void LogoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutMenuItemActionPerformed
        if(IA == null && IC == null && IE != null){
            ContaText.removeAll();
            SenhaText.removeAll();
            this.Conta = "";
            this.Senha = null;
            IE.setEnabled(false);
            IE = null;
            NovaConta.setVisible(true);
            Desk.setVisible(true);
            LoginMenuItem.setVisible(true);
            LogoutMenuItem.setVisible(false);
            this.setContentPane(Desk);
            SwingUtilities.updateComponentTreeUI(this);
            LoginMenuItemActionPerformed(evt);
        }
        if(IA == null && IE == null && IC != null){
            ContaText.removeAll();
            SenhaText.removeAll();
            this.Conta = "";
            this.Senha = null;
            IC.setEnabled(false);
            IC = null;
            NovaConta.setVisible(true);
            Desk.setVisible(true);
            LoginMenuItem.setVisible(true);
            LogoutMenuItem.setVisible(false);
            this.setContentPane(Desk);
            SwingUtilities.updateComponentTreeUI(this);
            LoginMenuItemActionPerformed(evt);
        }
        if(IC  == null && IE == null && IA != null){
            ContaText.removeAll();
            SenhaText.removeAll();
            this.Conta = "";
            this.Senha = null;
            IA.setEnabled(false);
            IA = null;
            NovaConta.setVisible(true);
            Desk.setVisible(true);
            LoginMenuItem.setVisible(true);
            LogoutMenuItem.setVisible(false);
            this.setContentPane(Desk);
            SwingUtilities.updateComponentTreeUI(this);
            LoginMenuItemActionPerformed(evt);
        }
    }//GEN-LAST:event_LogoutMenuItemActionPerformed

    private void DeskComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_DeskComponentRemoved
        boolean empresa = VerificaEmpresa(interfaceFrame.Conta, interfaceFrame.Senha);
        boolean comum = VerificaComum(interfaceFrame.Conta, interfaceFrame.Senha);
        boolean adm = VerificaAdm(interfaceFrame.Conta, interfaceFrame.Senha);
        if(empresa){
            String Saux = "";
            for(int i=0;i<interfaceFrame.Senha.length;i++){
                Saux += interfaceFrame.Senha[i];
            }
            Desk.setVisible(false);
            NovaConta.setVisible(false);
            LoginMenuItem.setVisible(false);
            LogoutMenuItem.setVisible(true);
            IE = new interfaceEmpresa(interfaceFrame.Conta, Saux);
            this.setContentPane(IE);
            SwingUtilities.updateComponentTreeUI(this);
            IE.setVisible(true);
            IE.setLocation(0, 0);
        }else if(comum){
            String Saux = "";
            for(int i=0;i<interfaceFrame.Senha.length;i++){
                Saux += interfaceFrame.Senha[i];
            }
            Desk.setVisible(false);
            NovaConta.setVisible(false);
            LoginMenuItem.setVisible(false);
            LogoutMenuItem.setVisible(true);
            IC = new interfaceComum(interfaceFrame.Conta, Saux);
            this.setContentPane(IC);
            SwingUtilities.updateComponentTreeUI(this);
            IC.setVisible(true);
            IC.setLocation(0, 0);
        }else if(adm){
            String Saux = "";
            for(int i=0;i<interfaceFrame.Senha.length;i++){
                Saux += interfaceFrame.Senha[i];
            }
            Desk.setVisible(false);
            NovaConta.setVisible(false);
            LoginMenuItem.setVisible(false);
            LogoutMenuItem.setVisible(true);
            IA = new interfaceAdm(interfaceFrame.Conta, Saux);
            this.setContentPane(IA);
            SwingUtilities.updateComponentTreeUI(this);
            IA.setVisible(true);
            IA.setLocation(0, 0);
        }
    }//GEN-LAST:event_DeskComponentRemoved

    private void NCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NCCActionPerformed
        CadastroComum CC = new CadastroComum();
        Desk.removeAll();
        Desk.repaint();
        Desk.revalidate();
        Desk.add(CC);
        CC.setLocation(112,50);
        CC.setVisible(true);
        Desk.repaint();
        Desk.revalidate();
    }//GEN-LAST:event_NCCActionPerformed

    private void NCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NCEActionPerformed
        CadastroEmpresa CE = new CadastroEmpresa();
        Desk.removeAll();
        Desk.repaint();
        Desk.revalidate();
        Desk.add(CE);
        CE.setLocation(112,50);
        CE.setVisible(true);
        Desk.repaint();
        Desk.revalidate();
    }//GEN-LAST:event_NCEActionPerformed

    private void sistemaDePagamentoAutomatico(){
        String[] leituraAux;
        //Cria uma lista com todas as contas de empresas
        leituraAux = leituraEscrita.Leitura("Arquivos\\ContasEmpresas.txt");
        String[] listaEmpresas = new String[(leituraAux.length / 2)];
        for (int i = 0, j = 0; i < leituraAux.length; i += 2, j++) {
            listaEmpresas[j] = leituraAux[i];
        }
        //Verifica e fazer o pagamento para todos os funcionário
        for (int i = 0; i < listaEmpresas.length; i++) {
            //Verifica se o pagamento automático está ativo
            leituraAux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+listaEmpresas[i]+
                    "\\PagamentoAuto.txt");
            if(leituraAux[0].equals("Ativado")){
                pagamentos.PagamentoAutomatico(listaEmpresas[i]);
            }
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceFrame().setVisible(true);
            }
        });
                      
    }
    
    public static boolean VerificaEmpresa(String C, char[] S){
        String[] Contas_E = leituraEscrita.Leitura("Arquivos\\ContasEmpresas.txt");
        interfaceFrame.ContasE = Contas_E;
        boolean r = false;
        try{
            String Saux = "";
            for(int i=0;i<S.length;i++){
                Saux += S[i];
            }
            for(int i = 0; i<Contas_E.length; i+=2){
                if(C.equals(Contas_E[i]) && Saux.equals(Contas_E[i+1])){
                    r = true;
                    break;
                }
            }
        }catch(Exception e){
            return false;
        }
        return r;
    }

    public static boolean VerificaComum(String C, char[] S){
        String[] Contas_C = leituraEscrita.Leitura("Arquivos\\ContasComuns.txt");        
        interfaceFrame.ContasC = Contas_C;
        boolean r = false;
        try{
            String Saux = "";
            for(int i=0;i<S.length;i++){
                Saux += S[i];
            }
            for(int i = 0; i<Contas_C.length; i+=2){
                if(C.equals(Contas_C[i]) && Saux.equals(Contas_C[i+1])){
                    r = true;
                    break;
                }
            }
        }catch(Exception e){
            return false;
        }
        return r;
    }
    
    public static boolean VerificaAdm(String C, char[] S){
        String[] Contas_A = leituraEscrita.Leitura("Arquivos\\ContasAdm.txt");        
        interfaceFrame.ContasA = Contas_A;
        boolean r = false;
        try{
            String Saux = "";
            for(int i=0;i<S.length;i++){
                Saux += S[i];
            }
            for(int i = 0; i<Contas_A.length; i+=2){
                if(C.equals(Contas_A[i]) && Saux.equals(Contas_A[i+1])){
                    r = true;
                    break;
                }
            }
        }catch(Exception e){
            return false;
        }
        return r;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aviso;
    private javax.swing.JLabel ContaL;
    private javax.swing.JFormattedTextField ContaText;
    private javax.swing.JDesktopPane Desk;
    private javax.swing.JInternalFrame Login;
    private javax.swing.JButton LoginB;
    private javax.swing.JMenuItem LoginMenuItem;
    private javax.swing.JPanel LoginP;
    private javax.swing.JMenuItem LogoutMenuItem;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem NCC;
    private javax.swing.JMenuItem NCE;
    private javax.swing.JMenu NovaConta;
    private javax.swing.JLabel SenhaL;
    private javax.swing.JPasswordField SenhaText;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
