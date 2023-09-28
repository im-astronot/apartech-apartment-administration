
package com.apartech.frames;

import com.apartech.main.AR_DashBoard;
import com.apartech.main.MainFrame;
import java.sql.*;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class AR_LoginFrame extends javax.swing.JFrame {

    public AR_LoginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_PanelCover1 = new com.apartech.component.Main_PanelCover();
        jLabel2 = new javax.swing.JLabel();
        adduser = new com.apartech.component.Button_Gradient();
        ar_login = new com.apartech.component.Button_Gradient();
        backto_mainframe = new com.apartech.component.Button_Gradient();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");

        adduser.setText("ADD USER");
        adduser.setColor2(new java.awt.Color(0, 0, 0));
        adduser.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        adduser.setSizeSpeed(5.0F);
        adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserActionPerformed(evt);
            }
        });

        ar_login.setText("LOGIN");
        ar_login.setColor2(new java.awt.Color(0, 0, 0));
        ar_login.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        ar_login.setSizeSpeed(5.0F);
        ar_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ar_loginMouseClicked(evt);
            }
        });
        ar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ar_loginActionPerformed(evt);
            }
        });

        backto_mainframe.setText("Back");
        backto_mainframe.setColor1(new java.awt.Color(64, 64, 191));
        backto_mainframe.setColor2(new java.awt.Color(26, 26, 26));
        backto_mainframe.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        backto_mainframe.setSizeSpeed(5.0F);
        backto_mainframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backto_mainframeMouseClicked(evt);
            }
        });
        backto_mainframe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backto_mainframeKeyPressed(evt);
            }
        });

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/apartech/icon/user.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/apartech/icon/pass.png"))); // NOI18N

        javax.swing.GroupLayout main_PanelCover1Layout = new javax.swing.GroupLayout(main_PanelCover1);
        main_PanelCover1.setLayout(main_PanelCover1Layout);
        main_PanelCover1Layout.setHorizontalGroup(
            main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_PanelCover1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(main_PanelCover1Layout.createSequentialGroup()
                        .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_PanelCover1Layout.createSequentialGroup()
                                .addComponent(adduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(ar_login, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(password)
                            .addComponent(username))
                        .addGap(0, 117, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_PanelCover1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backto_mainframe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        main_PanelCover1Layout.setVerticalGroup(
            main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backto_mainframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ar_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_PanelCover1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_PanelCover1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void ar_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ar_loginActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            String sql = "select * from login where username=? and password=? and username='admin'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username.getText());
            pst.setString(2, password.getText());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                setVisible(false);
                AR_DashBoard obj = new AR_DashBoard();
                obj.setVisible(true);
            }
            else{
                String sql2 = "select * from login where username=? and password=? and username!='admin'";
                PreparedStatement pst2 = con.prepareStatement(sql2);
                pst2.setString(1, username.getText());
                pst2.setString(2, password.getText());
                ResultSet rs2 = pst2.executeQuery();
                
                if(rs2.next()){
                    Warning_User user = new Warning_User();
                    user.setVisible(true);
                    username.setText("");
                    password.setText("");
                }
                else{
                    Warning_Password pwd = new Warning_Password();
                    pwd.setVisible(true);
                    password.setText("");
                } 
            }
            statement.close();  
            con.close();
        } 
        catch (SQLException | ClassNotFoundException se) {  
            JOptionPane.showMessageDialog(null, se);  
        } 
    }//GEN-LAST:event_ar_loginActionPerformed

    private void adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserActionPerformed
        // TODO add your handling code here:
        AR_Admin_AddUser ar = new AR_Admin_AddUser();
        ar.setVisible(true);
    }//GEN-LAST:event_adduserActionPerformed

    private void backto_mainframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backto_mainframeMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        
    }//GEN-LAST:event_backto_mainframeMouseClicked

    private void backto_mainframeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backto_mainframeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            setVisible(false);
        }
    }//GEN-LAST:event_backto_mainframeKeyPressed

    private void ar_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ar_loginMouseClicked
        // TODO add your handling code here:
        //AR_DashBoard obj = new AR_DashBoard();
        //obj.setVisible(true);
    }//GEN-LAST:event_ar_loginMouseClicked

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
            java.util.logging.Logger.getLogger(AR_LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AR_LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AR_LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AR_LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AR_LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient adduser;
    private com.apartech.component.Button_Gradient ar_login;
    private com.apartech.component.Button_Gradient backto_mainframe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.apartech.component.Main_PanelCover main_PanelCover1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
