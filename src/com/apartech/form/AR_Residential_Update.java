
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AR_Residential_Update extends javax.swing.JPanel {

 
    public AR_Residential_Update() {
        initComponents();
        setOpaque(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        update = new com.apartech.component.Button_Gradient();
        r_name = new com.apartech.swingcontrol.TextField();
        r_contact = new com.apartech.swingcontrol.TextField();
        status = new com.apartech.swingcontrol.Combobox();
        flat_num = new com.apartech.swingcontrol.TextField();

        label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        update.setText("UPDATE");
        update.setSizeSpeed(5.0F);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        r_name.setBackground(new java.awt.Color(255, 255, 255));
        r_name.setForeground(new java.awt.Color(0, 0, 0));
        r_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        r_name.setLabelText("RESIDENT NAME");
        r_name.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        r_name.setSelectionColor(new java.awt.Color(64, 64, 191));

        r_contact.setBackground(new java.awt.Color(255, 255, 255));
        r_contact.setForeground(new java.awt.Color(0, 0, 0));
        r_contact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        r_contact.setLabelText("RESIDENT CONTACT");
        r_contact.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        r_contact.setSelectionColor(new java.awt.Color(64, 64, 191));

        status.setForeground(new java.awt.Color(0, 0, 0));
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RENTED", "LEASED", "OWNED" }));
        status.setSelectedIndex(-1);
        status.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        status.setLabeText("STATUS");

        flat_num.setBackground(new java.awt.Color(255, 255, 255));
        flat_num.setForeground(new java.awt.Color(0, 0, 0));
        flat_num.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        flat_num.setLabelText("FLAT NUMBER");
        flat_num.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        flat_num.setSelectionColor(new java.awt.Color(64, 64, 191));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(549, 549, 549)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r_name, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(r_contact, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(flat_num, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(550, 550, 550))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(flat_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(r_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(r_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            
            // update residential table
            statement.execute("UPDATE residential SET r_name='" + r_name.getText() + "', r_contact=" + r_contact.getText() + ","
                    + "status='" + status.getSelectedItem() + "' where flat_num=" + flat_num.getText());
        
            label.setText("Record Updated"); 
            statement.close();  
            con.close();  
        } 
        catch (SQLException | ClassNotFoundException se) {  
            JOptionPane.showMessageDialog(null, se);  
        }
    }//GEN-LAST:event_updateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.swingcontrol.TextField flat_num;
    private javax.swing.JLabel label;
    private com.apartech.swingcontrol.TextField r_contact;
    private com.apartech.swingcontrol.TextField r_name;
    private com.apartech.swingcontrol.Combobox status;
    private com.apartech.component.Button_Gradient update;
    // End of variables declaration//GEN-END:variables
}
