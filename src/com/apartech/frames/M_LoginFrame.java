
package com.apartech.frames;

import com.apartech.main.M_DashBoard;
import com.apartech.main.MainFrame;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class M_LoginFrame extends javax.swing.JFrame {
 
    public M_LoginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        main_PanelCover1 = new com.apartech.component.Main_PanelCover();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        m_login = new com.apartech.component.Button_Gradient();
        backto_mainframe = new com.apartech.component.Button_Gradient();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/apartech/icon/pass.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");

        m_login.setText("LOGIN");
        m_login.setColor2(new java.awt.Color(0, 0, 0));
        m_login.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        m_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_loginMouseClicked(evt);
            }
        });
        m_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_loginActionPerformed(evt);
            }
        });

        backto_mainframe.setText("Back");
        backto_mainframe.setColor1(new java.awt.Color(64, 64, 191));
        backto_mainframe.setColor2(new java.awt.Color(26, 26, 26));
        backto_mainframe.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/apartech/icon/user.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/apartech/icon/pass.png"))); // NOI18N

        javax.swing.GroupLayout main_PanelCover1Layout = new javax.swing.GroupLayout(main_PanelCover1);
        main_PanelCover1.setLayout(main_PanelCover1Layout);
        main_PanelCover1Layout.setHorizontalGroup(
            main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_PanelCover1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backto_mainframe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_PanelCover1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(m_login, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(0, 117, Short.MAX_VALUE))
        );
        main_PanelCover1Layout.setVerticalGroup(
            main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backto_mainframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(m_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void m_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_loginActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            String sql = "select * from login where username=? and password=? and username!='admin'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username.getText());
            pst.setString(2, password.getText());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                setVisible(false);
                M_DashBoard obj = new M_DashBoard();
                obj.setVisible(true);
                
            }
            
            else{
                String sql2 = "select * from login where username=? and password=? and username='admin'";
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
    }//GEN-LAST:event_m_loginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void backto_mainframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backto_mainframeMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        MainFrame obj = new MainFrame();
        obj.setVisible(true);
        
    }//GEN-LAST:event_backto_mainframeMouseClicked

    private void backto_mainframeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backto_mainframeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            setVisible(false);
        }
    }//GEN-LAST:event_backto_mainframeKeyPressed

    private void m_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_loginMouseClicked
        // TODO add your handling code here:
        //M_DashBoard obj = new M_DashBoard();
        //obj.setVisible(true);
    }//GEN-LAST:event_m_loginMouseClicked

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
            java.util.logging.Logger.getLogger(M_LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient backto_mainframe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.apartech.component.Button_Gradient m_login;
    private com.apartech.component.Main_PanelCover main_PanelCover1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
