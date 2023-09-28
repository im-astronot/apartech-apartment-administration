
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class M_Complaint_Delete extends javax.swing.JPanel {

    public M_Complaint_Delete() {
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
            String query1 = "select * from complaint";
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.apartech.tableswing.Table();
        label = new javax.swing.JLabel();
        delete = new com.apartech.component.Button_Gradient();
        jLabel2 = new javax.swing.JLabel();
        complaint_num = new com.apartech.swingcontrol.TextField();

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

        label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("COMPLAINT RECORDS");

        complaint_num.setBackground(new java.awt.Color(255, 255, 255));
        complaint_num.setForeground(new java.awt.Color(0, 0, 0));
        complaint_num.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        complaint_num.setLabelText("INPUT THE COMPLAINT NUMBER TO BE DELETED");
        complaint_num.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        complaint_num.setSelectionColor(new java.awt.Color(64, 64, 191));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(complaint_num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(complaint_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            
            // delete COMPLAINT record
            statement.executeUpdate("Delete from complaint where complaint_num=" + complaint_num.getText());
            
            label.setText("Record Deleted"); 
            
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            model.setRowCount(0);
            complaint_view();
            
            statement.close();  
            con.close();  
        } 
        catch (SQLException | ClassNotFoundException se) {  
            JOptionPane.showMessageDialog(null, se);  
        } 
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.swingcontrol.TextField complaint_num;
    private com.apartech.component.Button_Gradient delete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private com.apartech.tableswing.Table table1;
    // End of variables declaration//GEN-END:variables
}
