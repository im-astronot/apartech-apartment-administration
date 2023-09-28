
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class M_DailyEntry_View extends javax.swing.JPanel {

    public M_DailyEntry_View() {
        initComponents();
        dentry_view();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
    }
    
    public ArrayList<DailyEntry> dentryList(){
        ArrayList<DailyEntry> dentrylist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select * from dentry";
            ResultSet rs = statement.executeQuery(query1);
            DailyEntry de;
            while(rs.next()){
                de = new DailyEntry(rs.getString("sl_num"), rs.getString("d_name"), rs.getString("d_contact"), rs.getString("d_date"), rs.getString("purpose"), rs.getString("from_loc"), rs.getString("flat_num"), rs.getString("emp_id"));
                dentrylist.add(de);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return dentrylist;
    }
    
    public void dentry_view(){
        ArrayList<DailyEntry> list = dentryList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[10];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getSl_num();
            row[1] = list.get(i).getD_name();
            row[2] = list.get(i).getD_contact();
            row[3] = list.get(i).getD_date();
            row[4] = list.get(i).getPurpose();
            row[5] = list.get(i).getFrom_loc();
            row[6] = list.get(i).getFlat_num();
            row[7] = list.get(i).getEmp_id();
            model.addRow(row);
        }
    }

    // SEARCH BY DATE 
    public ArrayList<DailyEntry> dentrydateList(){
        ArrayList<DailyEntry> dentrylist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select * from dentry where d_date ='" + date.getText() + "'";
            ResultSet rs = statement.executeQuery(query1);
            DailyEntry de;
            while(rs.next()){
                de = new DailyEntry(rs.getString("sl_num"), rs.getString("d_name"), rs.getString("d_contact"), rs.getString("d_date"), rs.getString("purpose"), rs.getString("from_loc"), rs.getString("flat_num"), rs.getString("emp_id"));
                dentrylist.add(de);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return dentrylist;
    }
    
    public void dentry_date_view(){
        ArrayList<DailyEntry> list = dentrydateList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[10];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getSl_num();
            row[1] = list.get(i).getD_name();
            row[2] = list.get(i).getD_contact();
            row[3] = list.get(i).getD_date();
            row[4] = list.get(i).getPurpose();
            row[5] = list.get(i).getFrom_loc();
            row[6] = list.get(i).getFlat_num();
            row[7] = list.get(i).getEmp_id();
            model.addRow(row);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.apartech.tableswing.Table();
        jLabel1 = new javax.swing.JLabel();
        date = new com.apartech.swingcontrol.TextField();
        search = new com.apartech.component.Button_Gradient();
        all_records = new com.apartech.component.Button_Gradient();

        dateChooser1.setForeground(new java.awt.Color(64, 64, 191));
        dateChooser1.setTextRefernce(date);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL_NUM", "D_NAME", "D_CONTACT", "D_DATE", "PURPOSE", "FROM_LOC", "FLAT_NUM", "EMP_ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DAILY ENTRY RECORDS");

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        date.setLabelText("SEARCH RECORD");

        search.setText("SEARCH");
        search.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        all_records.setText("ALL RECORDS");
        all_records.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        all_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_recordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(all_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 714, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(all_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        dentry_date_view();
    }//GEN-LAST:event_searchActionPerformed

    private void all_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_recordsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        dentry_view();
    }//GEN-LAST:event_all_recordsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient all_records;
    private com.apartech.swingcontrol.TextField date;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.apartech.component.Button_Gradient search;
    private com.apartech.tableswing.Table table1;
    // End of variables declaration//GEN-END:variables
}
