
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class M_Complaint_Insert extends javax.swing.JPanel {


    public M_Complaint_Insert() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date_cpdate = new com.raven.datechooser.DateChooser();
        label = new javax.swing.JLabel();
        insert = new com.apartech.component.Button_Gradient();
        flat_num = new com.apartech.swingcontrol.TextField();
        complaint = new com.apartech.swingcontrol.TextField();
        house_help = new com.apartech.swingcontrol.TextField();
        compliant = new com.apartech.swingcontrol.TextField();
        cp_date = new com.apartech.swingcontrol.TextField();
        cpdate_button = new com.apartech.swingcontrol.Button();
        status = new com.apartech.swingcontrol.Combobox();

        date_cpdate.setForeground(new java.awt.Color(64, 64, 191));
        date_cpdate.setTextRefernce(cp_date);

        setForeground(new java.awt.Color(0, 0, 0));

        label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        flat_num.setBackground(new java.awt.Color(255, 255, 255));
        flat_num.setForeground(new java.awt.Color(0, 0, 0));
        flat_num.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        flat_num.setLabelText("FLAT NUMBER");
        flat_num.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        flat_num.setSelectionColor(new java.awt.Color(64, 64, 191));

        complaint.setBackground(new java.awt.Color(255, 255, 255));
        complaint.setForeground(new java.awt.Color(0, 0, 0));
        complaint.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        complaint.setLabelText("COMPAINT");
        complaint.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        complaint.setSelectionColor(new java.awt.Color(64, 64, 191));

        house_help.setBackground(new java.awt.Color(255, 255, 255));
        house_help.setForeground(new java.awt.Color(0, 0, 0));
        house_help.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        house_help.setLabelText("HOUSE HELP");
        house_help.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        house_help.setSelectionColor(new java.awt.Color(64, 64, 191));

        compliant.setBackground(new java.awt.Color(255, 255, 255));
        compliant.setForeground(new java.awt.Color(0, 0, 0));
        compliant.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        compliant.setLabelText("COMPLIANT");
        compliant.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        compliant.setSelectionColor(new java.awt.Color(64, 64, 191));

        cp_date.setBackground(new java.awt.Color(255, 255, 255));
        cp_date.setForeground(new java.awt.Color(0, 0, 0));
        cp_date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cp_date.setLabelText("COMPLAINT DATE");
        cp_date.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        cp_date.setSelectionColor(new java.awt.Color(64, 64, 191));

        cpdate_button.setForeground(new java.awt.Color(255, 255, 255));
        cpdate_button.setText("...");
        cpdate_button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cpdate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpdate_buttonActionPerformed(evt);
            }
        });

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RESOLVED", "NOT RESOLVED" }));
        status.setSelectedIndex(-1);
        status.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        status.setLabeText("STATUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(flat_num, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(complaint, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(compliant, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(cp_date, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(house_help, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpdate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(500, 500, 500))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(flat_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(complaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(house_help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(compliant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpdate_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cp_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        int cp_num = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query = "select count(*) from complaint";
            String query1 = "insert into complaint(complaint_num, flat_num, complaint, house_help, compliant, cp_date, status) values(?,?,?,?,?,?,?)";
            ResultSet rs = statement.executeQuery(query);
            
            rs.next();
            cp_num = rs.getInt(1);
            cp_num++;
            
            PreparedStatement pst = con.prepareStatement(query1);
            pst.setInt(1, cp_num);
            pst.setString(2, flat_num.getText());
            pst.setString(3, complaint.getText());
            pst.setString(4, house_help.getText());
            pst.setString(5, compliant.getText());
            pst.setString(6, cp_date.getText());
            pst.setString(7, (String) status.getSelectedItem());
            
            /*complaint date
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String complaint_date = sdf.format(cp_date.getDate());
            pst.setString(6, complaint_date);*/
            
            pst.executeUpdate();
            label.setText("Record Inserted");
            pst.close();
            con.close();
        }
        
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_insertActionPerformed

    private void cpdate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpdate_buttonActionPerformed
        // TODO add your handling code here:
        date_cpdate.showPopup();
    }//GEN-LAST:event_cpdate_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.swingcontrol.TextField complaint;
    private com.apartech.swingcontrol.TextField compliant;
    private com.apartech.swingcontrol.TextField cp_date;
    private com.apartech.swingcontrol.Button cpdate_button;
    private com.raven.datechooser.DateChooser date_cpdate;
    private com.apartech.swingcontrol.TextField flat_num;
    private com.apartech.swingcontrol.TextField house_help;
    private com.apartech.component.Button_Gradient insert;
    private javax.swing.JLabel label;
    private com.apartech.swingcontrol.Combobox status;
    // End of variables declaration//GEN-END:variables
}
