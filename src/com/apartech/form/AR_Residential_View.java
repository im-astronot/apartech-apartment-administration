
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AR_Residential_View extends javax.swing.JPanel {


    public AR_Residential_View() {
        initComponents();
        residential_view();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
    }

    public ArrayList<Residential> residentialList(){
        ArrayList<Residential> residentiallist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select * from residential";
            ResultSet rs = statement.executeQuery(query1);
            Residential res;
            while(rs.next()){
                res = new Residential(rs.getString("flat_num"), rs.getString("block_name"), rs.getString("r_name"), rs.getString("r_contact"), rs.getString("park_num"), rs.getString("status"));
                residentiallist.add(res);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return residentiallist;
    }
    
        public void residential_view(){
        ArrayList<Residential> list = residentialList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFlat_num();
            row[1] = list.get(i).getBlock_name();
            row[2] = list.get(i).getR_name();
            row[3] = list.get(i).getR_contact();
            row[4] = list.get(i).getPark_num();
            row[5] = list.get(i).getStatus();
            model.addRow(row);
        }
    }
        
    // OWNED STATUS
    public ArrayList<Residential> residentialownedList(){
        ArrayList<Residential> residentiallist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select * from residential where status='OWNED'";
            ResultSet rs = statement.executeQuery(query1);
            Residential res;
            while(rs.next()){
                res = new Residential(rs.getString("flat_num"), rs.getString("block_name"), rs.getString("r_name"), rs.getString("r_contact"), rs.getString("park_num"), rs.getString("status"));
                residentiallist.add(res);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return residentiallist;
    }
    
        public void residential_owned_view(){
        ArrayList<Residential> list = residentialownedList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFlat_num();
            row[1] = list.get(i).getBlock_name();
            row[2] = list.get(i).getR_name();
            row[3] = list.get(i).getR_contact();
            row[4] = list.get(i).getPark_num();
            row[5] = list.get(i).getStatus();
            model.addRow(row);
        }
    }
    
    // LEASED STATUS
    public ArrayList<Residential> residentialleasedList(){
        ArrayList<Residential> residentiallist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select * from residential where status='LEASED'";
            ResultSet rs = statement.executeQuery(query1);
            Residential res;
            while(rs.next()){
                res = new Residential(rs.getString("flat_num"), rs.getString("block_name"), rs.getString("r_name"), rs.getString("r_contact"), rs.getString("park_num"), rs.getString("status"));
                residentiallist.add(res);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return residentiallist;
    }
    
        public void residential_leased_view(){
        ArrayList<Residential> list = residentialleasedList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFlat_num();
            row[1] = list.get(i).getBlock_name();
            row[2] = list.get(i).getR_name();
            row[3] = list.get(i).getR_contact();
            row[4] = list.get(i).getPark_num();
            row[5] = list.get(i).getStatus();
            model.addRow(row);
        }
    }    
        
        
    // RENTED STATUS
    public ArrayList<Residential> residentialrentedList(){
        ArrayList<Residential> residentiallist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select * from residential where status='RENTED'";
            ResultSet rs = statement.executeQuery(query1);
            Residential res;
            while(rs.next()){
                res = new Residential(rs.getString("flat_num"), rs.getString("block_name"), rs.getString("r_name"), rs.getString("r_contact"), rs.getString("park_num"), rs.getString("status"));
                residentiallist.add(res);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return residentiallist;
    }
    
        public void residential_rented_view(){
        ArrayList<Residential> list = residentialrentedList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFlat_num();
            row[1] = list.get(i).getBlock_name();
            row[2] = list.get(i).getR_name();
            row[3] = list.get(i).getR_contact();
            row[4] = list.get(i).getPark_num();
            row[5] = list.get(i).getStatus();
            model.addRow(row);
        }
    }        
    
    // VACANT STATUS
    public ArrayList<Residential> residentialvacantList(){
        ArrayList<Residential> residentiallist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            //String query1 = "select * from residential where status is null";
            String query1 = "select * from residential where status is null and block_name='" + block_name.getSelectedItem() + "'";
            ResultSet rs = statement.executeQuery(query1);
            Residential res;
            while(rs.next()){
                res = new Residential(rs.getString("flat_num"), rs.getString("block_name"), rs.getString("r_name"), rs.getString("r_contact"), rs.getString("park_num"), rs.getString("status"));
                residentiallist.add(res);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return residentiallist;
    }
    
        public void residential_vacant_view(){
        ArrayList<Residential> list = residentialvacantList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFlat_num();
            row[1] = list.get(i).getBlock_name();
            row[2] = list.get(i).getR_name();
            row[3] = list.get(i).getR_contact();
            row[4] = list.get(i).getPark_num();
            row[5] = list.get(i).getStatus();
            model.addRow(row);
        }
    }
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.apartech.tableswing.Table();
        jLabel1 = new javax.swing.JLabel();
        all_records = new com.apartech.component.Button_Gradient();
        vacant = new com.apartech.component.Button_Gradient();
        rented = new com.apartech.component.Button_Gradient();
        leased = new com.apartech.component.Button_Gradient();
        owned = new com.apartech.component.Button_Gradient();
        block_name = new com.apartech.swingcontrol.Combobox();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FLAT NUMBER", "BLOCK NAME", "RESIDENT NAME", "RESIDENT CONTACT", "PARKING LOT", "RESIDENT STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setRowHeight(35);
        jScrollPane1.setViewportView(table1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RESIDENTIAL RECORDS");

        all_records.setText("ALL RECORDS");
        all_records.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        all_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_recordsActionPerformed(evt);
            }
        });

        vacant.setText("SORT VACANT");
        vacant.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        vacant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacantActionPerformed(evt);
            }
        });

        rented.setText("RENTED");
        rented.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rented.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentedActionPerformed(evt);
            }
        });

        leased.setText("LEASED");
        leased.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        leased.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leasedActionPerformed(evt);
            }
        });

        owned.setText("OWNED");
        owned.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        owned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownedActionPerformed(evt);
            }
        });

        block_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AMBER", "BLUE", "CRIMSON", "DAFFODIL" }));
        block_name.setSelectedIndex(-1);
        block_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        block_name.setLabeText("SORT BY BLOCK NAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(block_name, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vacant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(owned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leased, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rented, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(all_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1466, Short.MAX_VALUE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(vacant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(block_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(all_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rented, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leased, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(owned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ownedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownedActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        residential_owned_view();
    }//GEN-LAST:event_ownedActionPerformed

    private void leasedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leasedActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        residential_leased_view();
    }//GEN-LAST:event_leasedActionPerformed

    private void rentedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentedActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        residential_rented_view();
    }//GEN-LAST:event_rentedActionPerformed

    private void vacantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacantActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        residential_vacant_view();
    }//GEN-LAST:event_vacantActionPerformed

    private void all_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_recordsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        residential_view();
    }//GEN-LAST:event_all_recordsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient all_records;
    private com.apartech.swingcontrol.Combobox block_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.apartech.component.Button_Gradient leased;
    private com.apartech.component.Button_Gradient owned;
    private com.apartech.component.Button_Gradient rented;
    private com.apartech.tableswing.Table table1;
    private com.apartech.component.Button_Gradient vacant;
    // End of variables declaration//GEN-END:variables
}
