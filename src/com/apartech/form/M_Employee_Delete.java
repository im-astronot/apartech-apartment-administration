
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class M_Employee_Delete extends javax.swing.JPanel {

    public M_Employee_Delete() {
        initComponents();
        employee_view();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
    }
    
    public ArrayList<Employee> EmployeeList(){
        ArrayList<Employee> emplist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query1 = "select * from employee";
            ResultSet rs = statement.executeQuery(query1);
            Employee emp;
            while(rs.next()){
                emp = new Employee(rs.getString("emp_id"), rs.getString("emp_name"), rs.getString("dob"), rs.getString("hiredate"), rs.getString("job"), rs.getString("salary"));
                emplist.add(emp);
            }
         }
         catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        return emplist;
    }
    
     public void employee_view(){
        ArrayList<Employee> list = EmployeeList();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getEmp_id();
            row[1] = list.get(i).getEmp_name();
            row[2] = list.get(i).getDob();
            row[3] = list.get(i).getHiredate();
            row[4] = list.get(i).getJob();
            row[5] = list.get(i).getSalary();
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
        emp_id = new com.apartech.swingcontrol.TextField();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMP_ID", "EMP_NAME", "DOB", "HIREDATE", "JOB", "SALARY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
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
        delete.setSizeSpeed(4.0F);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EMPLOYEE RECORDS");

        emp_id.setBackground(new java.awt.Color(255, 255, 255));
        emp_id.setForeground(new java.awt.Color(0, 0, 0));
        emp_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emp_id.setLabelText("INPUT THE EMPLOYEE ID TO BE DELETED");
        emp_id.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        emp_id.setSelectionColor(new java.awt.Color(64, 64, 191));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
                        .addGap(59, 59, 59))))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emp_id, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            
            // delete employee record
            statement.executeUpdate("Delete from employee where emp_id=" + emp_id.getText());
            
            
            label.setText("Record Deleted"); 
            
            // Refresh after update
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            model.setRowCount(0);
            employee_view();
            
            statement.close();  
            con.close();  
        } 
        catch (SQLException | ClassNotFoundException se) {  
            JOptionPane.showMessageDialog(null, se);  
        }
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient delete;
    private com.apartech.swingcontrol.TextField emp_id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private com.apartech.tableswing.Table table1;
    // End of variables declaration//GEN-END:variables
}
