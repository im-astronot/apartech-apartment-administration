
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class M_Employee_View extends javax.swing.JPanel {


    public M_Employee_View() {
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
    
    
    // SORT REMPLOYEE 
    public ArrayList<Employee> EmployeesortList(){
        ArrayList<Employee> emplist = new ArrayList<>();
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query = "select * from employee where job = '" +job.getSelectedItem()+ "'";
          
            ResultSet rs = statement.executeQuery(query);
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
    
     public void employee_sort_view(){
        ArrayList<Employee> list = EmployeesortList();
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
        jLabel1 = new javax.swing.JLabel();
        all_records = new com.apartech.component.Button_Gradient();
        empsort = new com.apartech.component.Button_Gradient();
        job = new com.apartech.swingcontrol.Combobox();

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EMPLOYEE RECORDS");

        all_records.setText("ALL RECORDS");
        all_records.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        all_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_recordsActionPerformed(evt);
            }
        });

        empsort.setText("SORT");
        empsort.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        empsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsortActionPerformed(evt);
            }
        });

        job.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PROPERTY MANAGER", "SALES MANAGER", "FRONT DESK", "SECURITY GUARD", "ADMINISTRATIVE ASSISTANT", "HOUSE KEEPER", "GARDENER", "POOL ATTENDANT" }));
        job.setSelectedIndex(-1);
        job.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        job.setLabeText("SORT BY JOB");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empsort, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(all_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empsort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(all_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void empsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsortActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        employee_sort_view();
    }//GEN-LAST:event_empsortActionPerformed

    private void all_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_recordsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        employee_view();
    }//GEN-LAST:event_all_recordsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.component.Button_Gradient all_records;
    private com.apartech.component.Button_Gradient empsort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.apartech.swingcontrol.Combobox job;
    private com.apartech.tableswing.Table table1;
    // End of variables declaration//GEN-END:variables
}
