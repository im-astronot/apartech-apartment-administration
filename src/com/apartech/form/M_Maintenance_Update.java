
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class M_Maintenance_Update extends javax.swing.JPanel {

    public M_Maintenance_Update() {
        initComponents();
        setOpaque(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        update = new com.apartech.component.Button_Gradient();
        flat_num = new com.apartech.swingcontrol.TextField();
        qt2 = new com.apartech.swingcontrol.Combobox();
        qt1 = new com.apartech.swingcontrol.Combobox();
        qt3 = new com.apartech.swingcontrol.Combobox();
        qt4 = new com.apartech.swingcontrol.Combobox();

        setForeground(new java.awt.Color(0, 0, 0));

        label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        update.setText("UPDATE");
        update.setSizeSpeed(4.0F);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        flat_num.setBackground(new java.awt.Color(255, 255, 255));
        flat_num.setForeground(new java.awt.Color(0, 0, 0));
        flat_num.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        flat_num.setLabelText("FLAT NUMBER");
        flat_num.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        flat_num.setSelectionColor(new java.awt.Color(64, 64, 191));

        qt2.setForeground(new java.awt.Color(0, 0, 0));
        qt2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PENDING", "PAID" }));
        qt2.setSelectedIndex(-1);
        qt2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        qt2.setLabeText("QUARTER 2");

        qt1.setForeground(new java.awt.Color(0, 0, 0));
        qt1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PENDING", "PAID" }));
        qt1.setSelectedIndex(-1);
        qt1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        qt1.setLabeText("QUARTER 1");

        qt3.setForeground(new java.awt.Color(0, 0, 0));
        qt3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PENDING", "PAID" }));
        qt3.setSelectedIndex(-1);
        qt3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        qt3.setLabeText("QUARTER 3");

        qt4.setForeground(new java.awt.Color(0, 0, 0));
        qt4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PENDING", "PAID" }));
        qt4.setSelectedIndex(-1);
        qt4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        qt4.setLabeText("QUARTER 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(qt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(flat_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(550, 550, 550))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(qt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(flat_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(qt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(qt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(qt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            
            // update maintenance table record
            statement.execute("UPDATE maintenance SET quarter_1='" + qt1.getSelectedItem() + "', quarter_2='" + qt2.getSelectedItem() + "', quarter_3='" + qt3.getSelectedItem() + "',"
                    + " quarter_4='" + qt4.getSelectedItem() + "' where flat_num=" + flat_num.getText());
            
            label.setText("Record Updated"); 
            statement.close();  
            con.close();  
        } 
        catch (SQLException | ClassNotFoundException se) {  
            JOptionPane.showMessageDialog(null, se);  
        }
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.swingcontrol.TextField flat_num;
    private javax.swing.JLabel label;
    private com.apartech.swingcontrol.Combobox qt1;
    private com.apartech.swingcontrol.Combobox qt2;
    private com.apartech.swingcontrol.Combobox qt3;
    private com.apartech.swingcontrol.Combobox qt4;
    private com.apartech.component.Button_Gradient update;
    // End of variables declaration//GEN-END:variables
}
