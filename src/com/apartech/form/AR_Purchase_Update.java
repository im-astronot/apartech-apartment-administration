package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AR_Purchase_Update extends javax.swing.JPanel {

    public AR_Purchase_Update() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        update_purchase = new com.apartech.component.Button_Gradient();
        ap_name = new com.apartech.swingcontrol.TextField();
        flat_num = new com.apartech.swingcontrol.TextField();
        ap_contact = new com.apartech.swingcontrol.TextField();
        ap_status = new com.apartech.swingcontrol.TextField();

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        update_purchase.setText("UPDATE");
        update_purchase.setSizeSpeed(10.0F);
        update_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_purchaseActionPerformed(evt);
            }
        });

        ap_name.setBackground(new java.awt.Color(255, 255, 255));
        ap_name.setForeground(new java.awt.Color(0, 0, 0));
        ap_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ap_name.setLabelText("OWNER NAME");
        ap_name.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        ap_name.setSelectionColor(new java.awt.Color(64, 64, 191));

        flat_num.setBackground(new java.awt.Color(255, 255, 255));
        flat_num.setForeground(new java.awt.Color(0, 0, 0));
        flat_num.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        flat_num.setLabelText("FLAT NUMBER");
        flat_num.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        flat_num.setSelectionColor(new java.awt.Color(64, 64, 191));

        ap_contact.setBackground(new java.awt.Color(255, 255, 255));
        ap_contact.setForeground(new java.awt.Color(0, 0, 0));
        ap_contact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ap_contact.setLabelText("OWNER CONTACT");
        ap_contact.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        ap_contact.setSelectionColor(new java.awt.Color(64, 64, 191));

        ap_status.setBackground(new java.awt.Color(255, 255, 255));
        ap_status.setForeground(new java.awt.Color(0, 0, 0));
        ap_status.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ap_status.setLabelText("STATUS");
        ap_status.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        ap_status.setSelectionColor(new java.awt.Color(64, 64, 191));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(flat_num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(ap_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ap_contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ap_status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(550, 550, 550))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(flat_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ap_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ap_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ap_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void update_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_purchaseActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            
            // update purchase table
            statement.execute("UPDATE purchase SET ap_name='" + ap_name.getText() + "'," 
                    + "ap_contact=" + ap_contact.getText() + ", ap_status='" + ap_status.getText() + "'" 
                            + " where flat_num=" + flat_num.getText());
            
            label.setText("Record Updated"); 
            statement.close();  
            con.close();  
        } 
        catch (SQLException | ClassNotFoundException se) {  
            JOptionPane.showMessageDialog(null, se);  
        }
        
    }//GEN-LAST:event_update_purchaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.swingcontrol.TextField ap_contact;
    private com.apartech.swingcontrol.TextField ap_name;
    private com.apartech.swingcontrol.TextField ap_status;
    private com.apartech.swingcontrol.TextField flat_num;
    private javax.swing.JLabel label;
    private com.apartech.component.Button_Gradient update_purchase;
    // End of variables declaration//GEN-END:variables
}
