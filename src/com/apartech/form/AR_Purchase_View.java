
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AR_Purchase_View extends javax.swing.JPanel {


    public AR_Purchase_View() {
        initComponents();
        purchase_view();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
    }
    
    // All Records
    public ArrayList<Purchase> purchaseList(){
        ArrayList<Purchase> purchaselist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select flat_num, block_name, floor_num, area_sqft, ap_bhk, ap_name, ap_contact, ap_price, to_char(ap_date, 'DD-MON-YYYY') purchase_date, ap_status from purchase";
            ResultSet rs = statement.executeQuery(query1);
            Purchase ph;
            while(rs.next()){
                ph = new Purchase(rs.getString("flat_num"), rs.getString("block_name"), rs.getString("floor_num"), rs.getString("area_sqft"), rs.getString("ap_bhk"), rs.getString("ap_name"), rs.getString("ap_contact"), rs.getString("ap_price"), rs.getString("purchase_date"), rs.getString("ap_status"));
                purchaselist.add(ph);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return purchaselist;
    }
    
    public void purchase_view(){
        ArrayList<Purchase> list = purchaseList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[12];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFlat_num();
            row[1] = list.get(i).getBlock_name();
            row[2] = list.get(i).getFloor_num();
            row[3] = list.get(i).getArea_sqft();
            row[4] = list.get(i).getAp_bhk();
            row[5] = list.get(i).getAp_name();
            row[6] = list.get(i).getAp_contact();
            row[7] = list.get(i).getPrice();
            row[8] = list.get(i).getPurchase_date();
            row[9] = list.get(i).getAp_status();
            model.addRow(row);
        }
    }
 
    // Sold Apartments
    public ArrayList<Purchase> purchase_soldList(){
        ArrayList<Purchase> purchaselist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select flat_num, block_name, floor_num, area_sqft, ap_bhk, ap_name, ap_contact, ap_price, to_char(ap_date, 'DD-MON-YYYY') purchase_date, ap_status from purchase where ap_status='SOLD'";
            ResultSet rs = statement.executeQuery(query1);
            Purchase ph;
            while(rs.next()){
               ph = new Purchase(rs.getString("flat_num"), rs.getString("block_name"), rs.getString("floor_num"), rs.getString("area_sqft"), rs.getString("ap_bhk"), rs.getString("ap_name"), rs.getString("ap_contact"), rs.getString("ap_price"), rs.getString("purchase_date"), rs.getString("ap_status"));
                purchaselist.add(ph);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return purchaselist;
    }
    
    public void purchase_sold_view(){
        ArrayList<Purchase> list = purchase_soldList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[12];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFlat_num();
            row[1] = list.get(i).getBlock_name();
            row[2] = list.get(i).getFloor_num();
            row[3] = list.get(i).getArea_sqft();
            row[4] = list.get(i).getAp_bhk();
            row[5] = list.get(i).getAp_name();
            row[6] = list.get(i).getAp_contact();
            row[7] = list.get(i).getPrice();
            row[8] = list.get(i).getPurchase_date();
            row[9] = list.get(i).getAp_status();
            model.addRow(row);
        }
    }
    
    // Unsold Apartments
    public ArrayList<Purchase> purchase_unsoldList(){
        ArrayList<Purchase> purchaselist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select flat_num, block_name, floor_num, area_sqft, ap_bhk, ap_name, ap_contact, ap_price, to_char(ap_date, 'DD-MON-YYYY') purchase_date, ap_status from purchase where ap_status is null";
            ResultSet rs = statement.executeQuery(query1);
            Purchase ph;
            while(rs.next()){
                ph = new Purchase(rs.getString("flat_num"), rs.getString("block_name"), rs.getString("floor_num"), rs.getString("area_sqft"), rs.getString("ap_bhk"), rs.getString("ap_name"), rs.getString("ap_contact"), rs.getString("ap_price"), rs.getString("purchase_date"), rs.getString("ap_status"));
                purchaselist.add(ph);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return purchaselist;
    }
    
    public void purchase_unsold_view(){
        ArrayList<Purchase> list = purchase_unsoldList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[12];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFlat_num();
            row[1] = list.get(i).getBlock_name();
            row[2] = list.get(i).getFloor_num();
            row[3] = list.get(i).getArea_sqft();
            row[4] = list.get(i).getAp_bhk();
            row[5] = list.get(i).getAp_name();
            row[6] = list.get(i).getAp_contact();
            row[7] = list.get(i).getPrice();
            row[8] = list.get(i).getPurchase_date();
            row[9] = list.get(i).getAp_status();
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.apartech.tableswing.Table();
        jLabel1 = new javax.swing.JLabel();
        unsold_apartment = new com.apartech.component.Button_Gradient();
        sold_apartment = new com.apartech.component.Button_Gradient();
        all_apartment = new com.apartech.component.Button_Gradient();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FLAT NUMBER", "BLOCK NAME", "FLOOR ", "AREA IN SQFT", "BHK", "OWNER NAME", "CONTACT", "PRICE", "PURCHASE DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setRowHeight(35);
        jScrollPane1.setViewportView(table1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PURCHASE RECORDS");

        unsold_apartment.setText("UNSOLD APARTMENTS");
        unsold_apartment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        unsold_apartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unsold_apartmentActionPerformed(evt);
            }
        });

        sold_apartment.setText("SOLD APARTMENTS");
        sold_apartment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sold_apartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sold_apartmentActionPerformed(evt);
            }
        });

        all_apartment.setText("ALL RECORDS");
        all_apartment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        all_apartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_apartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1470, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sold_apartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unsold_apartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(all_apartment, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unsold_apartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sold_apartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(all_apartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void all_apartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_apartmentActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        purchase_view();
    }//GEN-LAST:event_all_apartmentActionPerformed

    private void sold_apartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sold_apartmentActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        purchase_sold_view();
    }//GEN-LAST:event_sold_apartmentActionPerformed

    private void unsold_apartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unsold_apartmentActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        purchase_unsold_view();
    }//GEN-LAST:event_unsold_apartmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient all_apartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.apartech.component.Button_Gradient sold_apartment;
    private com.apartech.tableswing.Table table1;
    private com.apartech.component.Button_Gradient unsold_apartment;
    // End of variables declaration//GEN-END:variables
}
