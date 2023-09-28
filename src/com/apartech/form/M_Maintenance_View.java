
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class M_Maintenance_View extends javax.swing.JPanel {

    public M_Maintenance_View() {
        initComponents();
        maintenance_view();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
    }

    public ArrayList<Maintenance> maintenanceList(){
        ArrayList<Maintenance> maintenancelist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select * from maintenance";
            ResultSet rs = statement.executeQuery(query1);
            Maintenance mt;
            while(rs.next()){
                mt = new Maintenance(rs.getString("flat_num"), rs.getString("emp_id"), rs.getString("amount"), rs.getString("quarter_1"), rs.getString("quarter_2"), rs.getString("quarter_3"), rs.getString("quarter_4"), rs.getString("expense"));
                maintenancelist.add(mt);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return maintenancelist;
    }

    public void maintenance_view(){
        ArrayList<Maintenance> list = maintenanceList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[10];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFlat_num();
            row[1] = list.get(i).getEmp_id();
            row[2] = list.get(i).getAmount();
            row[3] = list.get(i).getQuarter_1();
            row[4] = list.get(i).getQuarter_2();
            row[5] = list.get(i).getQuarter_3();
            row[6] = list.get(i).getQuarter_4();
            row[7] = list.get(i).getExpense();
            model.addRow(row);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.apartech.tableswing.Table();
        jLabel1 = new javax.swing.JLabel();
        flat_num = new com.apartech.swingcontrol.TextField();
        expense = new com.apartech.swingcontrol.TextField();
        update_expense = new com.apartech.component.Button_Gradient();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FLAT_NUM", "EMP_ID", "AMOUNT", "QUARTER_1", "QUARTER_2", "QUARTER_3", "QUARTER_4", "EXPENSE"
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
        jLabel1.setText("MAINTENANCE RECORDS");

        flat_num.setBackground(new java.awt.Color(255, 255, 255));
        flat_num.setForeground(new java.awt.Color(0, 0, 0));
        flat_num.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        flat_num.setLabelText("FLAT NUMBER");
        flat_num.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        flat_num.setSelectionColor(new java.awt.Color(64, 64, 191));

        expense.setBackground(new java.awt.Color(255, 255, 255));
        expense.setForeground(new java.awt.Color(0, 0, 0));
        expense.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        expense.setLabelText("EXPENSE");
        expense.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        expense.setSelectionColor(new java.awt.Color(64, 64, 191));

        update_expense.setText("UPDATE EXPENSE");
        update_expense.setSizeSpeed(4.0F);
        update_expense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_expenseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1475, Short.MAX_VALUE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(flat_num, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expense, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_expense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flat_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_expense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void update_expenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_expenseActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();

            // update maintenance table record // expense
            statement.execute("UPDATE maintenance SET expense = nvl(expense, 0) + " + expense.getText() + " where flat_num=" + flat_num.getText());
            
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            model.setRowCount(0);
            maintenance_view();
            
            expense.setText("");
            flat_num.setText("");

            statement.close();
            con.close();
        }
        catch (SQLException | ClassNotFoundException se) {
            JOptionPane.showMessageDialog(null, se);
        }
    }//GEN-LAST:event_update_expenseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.swingcontrol.TextField expense;
    private com.apartech.swingcontrol.TextField flat_num;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.apartech.tableswing.Table table1;
    private com.apartech.component.Button_Gradient update_expense;
    // End of variables declaration//GEN-END:variables
}
