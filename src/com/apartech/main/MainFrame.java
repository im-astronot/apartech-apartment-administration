
package com.apartech.main;

import com.apartech.frames.AR_LoginFrame;
import com.apartech.frames.M_LoginFrame;
import javax.swing.JFrame;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        main_PanelCover1 = new com.apartech.component.Main_PanelCover();
        logo = new javax.swing.JLabel();
        apart_residential = new com.apartech.component.Button_Gradient();
        maintenance = new com.apartech.component.Button_Gradient();
        closemain = new com.apartech.component.Button_Gradient();
        minimizemain = new com.apartech.component.Button_Gradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/apartech/icon/Apartech_Logo.png"))); // NOI18N

        javax.swing.GroupLayout main_PanelCover1Layout = new javax.swing.GroupLayout(main_PanelCover1);
        main_PanelCover1.setLayout(main_PanelCover1Layout);
        main_PanelCover1Layout.setHorizontalGroup(
            main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        main_PanelCover1Layout.setVerticalGroup(
            main_PanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelCover1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(logo)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        apart_residential.setText("APARTMENT RESIDENTIAL");
        apart_residential.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        apart_residential.setSizeSpeed(15.0F);
        apart_residential.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apart_residentialMouseClicked(evt);
            }
        });
        apart_residential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apart_residentialActionPerformed(evt);
            }
        });

        maintenance.setText("MAINTENANCE");
        maintenance.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        maintenance.setSizeSpeed(15.0F);
        maintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintenanceMouseClicked(evt);
            }
        });
        maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceActionPerformed(evt);
            }
        });

        closemain.setText("X");
        closemain.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        closemain.setSizeSpeed(5.0F);
        closemain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closemainActionPerformed(evt);
            }
        });

        minimizemain.setText("_");
        minimizemain.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        minimizemain.setSizeSpeed(5.0F);
        minimizemain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizemainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(main_PanelCover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimizemain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(closemain, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apart_residential, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 75, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_PanelCover1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closemain, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizemain, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159)
                .addComponent(apart_residential, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void apart_residentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apart_residentialActionPerformed

    }//GEN-LAST:event_apart_residentialActionPerformed

    private void maintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maintenanceActionPerformed

    private void apart_residentialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apart_residentialMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        AR_LoginFrame ar_login = new AR_LoginFrame();
        ar_login.setVisible(true); // directs to AR login frame
    }//GEN-LAST:event_apart_residentialMouseClicked

    private void maintenanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintenanceMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        M_LoginFrame m_login = new M_LoginFrame();
        m_login.setVisible(true); // directs to AR login frame
    }//GEN-LAST:event_maintenanceMouseClicked

    private void closemainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closemainActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closemainActionPerformed

    private void minimizemainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizemainActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED); // to minimize
    }//GEN-LAST:event_minimizemainActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient apart_residential;
    private com.apartech.component.Button_Gradient closemain;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel logo;
    private com.apartech.component.Main_PanelCover main_PanelCover1;
    private com.apartech.component.Button_Gradient maintenance;
    private com.apartech.component.Button_Gradient minimizemain;
    // End of variables declaration//GEN-END:variables
}
