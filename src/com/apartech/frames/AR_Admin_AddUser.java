
package com.apartech.frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AR_Admin_AddUser extends javax.swing.JFrame {

    public AR_Admin_AddUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        main_PanelCover1 = new com.apartech.component.Main_PanelCover();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        update = new com.apartech.component.Button_Gradient();
        delete = new com.apartech.component.Button_Gradient();
        insert = new com.apartech.component.Button_Gradient();
        backtologin = new com.apartech.component.Button_Gradient();
        label = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");

        jLabel4.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");

        jLabel6.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSWORD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ENTER USERNAME");

        jLabel7.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENTER PASSWORD");

        jLabel8.setFont(new java.awt.Font("Calisto MT", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ADD USER");

        update.setText("UPDATE");
        update.setColor2(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        update.setSizeSpeed(5.0F);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("DELETE");
        delete.setColor2(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        delete.setSizeSpeed(5.0F);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        insert.setText("INSERT");
        insert.setColor2(new java.awt.Color(0, 0, 0));
        insert.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        insert.setSizeSpeed(5.0F);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        backtologin.setText("Back");
        backtologin.setColor2(new java.awt.Color(0, 0, 0));
        backtologin.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        backtologin.setSizeSpeed(5.0F);
        backtologin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtologinMouseClicked(evt);
            }
        });
        backtologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtologinActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout main_PanelCover1Layout = new javax.swing.GroupLayout(main_PanelCover1);
        main_PanelCover1.setLayout(main_PanelCover1Layout);
        main_PanelCover1Layout.setHorizontalGroup(
            main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_PanelCover1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backtologin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_PanelCover1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel8))
                    .addGroup(main_PanelCover1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(password)
                            .addComponent(username)
                            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        main_PanelCover1Layout.setVerticalGroup(
            main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backtologin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            
            // update login table
            statement.execute("UPDATE login SET password='" + password.getText() + "' WHERE username='" + username.getText() + "'");
        
            label.setText("Record Updated"); 
            statement.close();  
            con.close();  
        } 
        catch (SQLException | ClassNotFoundException se) {  
            JOptionPane.showMessageDialog(null, se);  
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
           
            // delete record from login table
            statement.executeUpdate("Delete from login where username='" + username.getText() + "'");
            
            label.setText("Record Deleted");
            statement.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            
            // insert into login table
            statement.executeUpdate("INSERT INTO login VALUES('" + username.getText() + "','" + password.getText() + "')");
            
            label.setText("Record Inserted");
            statement.close();
            con.close();
        }
        
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_insertActionPerformed

    private void backtologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtologinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backtologinActionPerformed

    private void backtologinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtologinMouseClicked
        // TODO add your handling code here:
        setVisible(false);  
    }//GEN-LAST:event_backtologinMouseClicked

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
            java.util.logging.Logger.getLogger(AR_Admin_AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AR_Admin_AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AR_Admin_AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AR_Admin_AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AR_Admin_AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient backtologin;
    private com.apartech.component.Button_Gradient delete;
    private com.apartech.component.Button_Gradient insert;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label;
    private com.apartech.component.Main_PanelCover main_PanelCover1;
    private javax.swing.JTextField password;
    private com.apartech.component.Button_Gradient update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
