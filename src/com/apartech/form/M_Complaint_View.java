
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class M_Complaint_View extends javax.swing.JPanel {

    public M_Complaint_View(){
        initComponents();
        complaint_view();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
    }
    
    public ArrayList<Complaint> complaintList(){
        ArrayList<Complaint> complaintlist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            //String query1 = "select * from complaint";
            String query1 = "select complaint_num, flat_num, complaint, house_help, compliant, to_char(cp_date, 'DD-MON-YYYY') complaint_date, status from complaint";
            ResultSet rs = statement.executeQuery(query1);
            Complaint cp;
            while(rs.next()){
                cp = new Complaint(rs.getString("complaint_num"), rs.getString("flat_num"), rs.getString("complaint"), rs.getString("house_help"), rs.getString("compliant"), rs.getString("complaint_date"), rs.getString("status"));
                complaintlist.add(cp);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return complaintlist;
    }

    public void complaint_view(){
        ArrayList<Complaint> list = complaintList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getComplaint_num();
            row[1] = list.get(i).getFlat_num();
            row[2] = list.get(i).getComplaint();
            row[3] = list.get(i).getHouse_help();
            row[4] = list.get(i).getCompliant();
            row[5] = list.get(i).getCp_date();
            row[6] = list.get(i).getStatus();
            model.addRow(row);
        }
    }
    
    // STATUS
    public ArrayList<Complaint> complaintstatusList(){
        ArrayList<Complaint> complaintlist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select * from complaint where status ='" + status.getSelectedItem()+ "'";
            ResultSet rs = statement.executeQuery(query1);
            Complaint cp;
            while(rs.next()){
                cp = new Complaint(rs.getString("complaint_num"), rs.getString("flat_num"), rs.getString("complaint"), rs.getString("house_help"), rs.getString("compliant"), rs.getString("cp_date"), rs.getString("status"));
                complaintlist.add(cp);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return complaintlist;
    }

    public void complaint_status_view(){
        ArrayList<Complaint> list = complaintstatusList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getComplaint_num();
            row[1] = list.get(i).getFlat_num();
            row[2] = list.get(i).getComplaint();
            row[3] = list.get(i).getHouse_help();
            row[4] = list.get(i).getCompliant();
            row[5] = list.get(i).getCp_date();
            row[6] = list.get(i).getStatus();
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.apartech.tableswing.Table();
        jLabel1 = new javax.swing.JLabel();
        status = new com.apartech.swingcontrol.Combobox();
        statussort = new com.apartech.component.Button_Gradient();
        all_records = new com.apartech.component.Button_Gradient();
        complaint_num = new com.apartech.swingcontrol.TextField();
        update = new com.apartech.component.Button_Gradient();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COMPLAINT_NUM", "FLAT_NUM", "COMPLAINT", "HOUSE_HELP", "COMPLIANT", "CP_DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("COMPLAINT RECORDS");

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RESOLVED", "NOT RESOLVED" }));
        status.setSelectedIndex(-1);
        status.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        status.setLabeText("STATUS");

        statussort.setText("SORT STATUS");
        statussort.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        statussort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statussortActionPerformed(evt);
            }
        });

        all_records.setText("ALL RECORDS");
        all_records.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        all_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_recordsActionPerformed(evt);
            }
        });

        complaint_num.setBackground(new java.awt.Color(255, 255, 255));
        complaint_num.setForeground(new java.awt.Color(0, 0, 0));
        complaint_num.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        complaint_num.setLabelText("COMPLAINT NUMBER");

        update.setText("UPDATE");
        update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1483, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(complaint_num, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statussort, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(all_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statussort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(all_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complaint_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void statussortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statussortActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        complaint_status_view();
    }//GEN-LAST:event_statussortActionPerformed

    private void all_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_recordsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        complaint_view();
    }//GEN-LAST:event_all_recordsActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            
            // update complaint table
            statement.execute("UPDATE complaint set status='" + status.getSelectedItem() + "' where complaint_num = " + complaint_num.getText());

            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            model.setRowCount(0);
            complaint_view();
            
            complaint_num.setText("");
            
            statement.close();  
            con.close();  
        } 
        catch (SQLException | ClassNotFoundException se) {  
            JOptionPane.showMessageDialog(null, se);  
        }
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient all_records;
    private com.apartech.swingcontrol.TextField complaint_num;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.apartech.swingcontrol.Combobox status;
    private com.apartech.component.Button_Gradient statussort;
    private com.apartech.tableswing.Table table1;
    private com.apartech.component.Button_Gradient update;
    // End of variables declaration//GEN-END:variables
}
