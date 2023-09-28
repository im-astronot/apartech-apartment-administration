package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.apartech.form.M_Employee_View;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class M_Employee_InsertUpdate extends javax.swing.JPanel {

    private Object table1;

    public M_Employee_InsertUpdate() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date_dob = new com.raven.datechooser.DateChooser();
        date_hiredate = new com.raven.datechooser.DateChooser();
        label = new javax.swing.JLabel();
        insert = new com.apartech.component.Button_Gradient();
        update = new com.apartech.component.Button_Gradient();
        emp_id = new com.apartech.swingcontrol.TextField();
        emp_name = new com.apartech.swingcontrol.TextField();
        dob = new com.apartech.swingcontrol.TextField();
        salary = new com.apartech.swingcontrol.TextField();
        hiredate = new com.apartech.swingcontrol.TextField();
        job = new com.apartech.swingcontrol.Combobox();
        dob_button = new com.apartech.swingcontrol.Button();
        hiredate_button = new com.apartech.swingcontrol.Button();

        date_dob.setForeground(new java.awt.Color(64, 64, 191));
        date_dob.setTextRefernce(dob);

        date_hiredate.setForeground(new java.awt.Color(64, 64, 191));
        date_hiredate.setTextRefernce(hiredate);

        label.setBackground(new java.awt.Color(102, 102, 102));
        label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        insert.setText("INSERT");
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
        });

        update.setText("UPDATE");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        emp_id.setBackground(new java.awt.Color(255, 255, 255));
        emp_id.setForeground(new java.awt.Color(0, 0, 0));
        emp_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emp_id.setLabelText("EMPLOYEE ID");
        emp_id.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        emp_id.setSelectionColor(new java.awt.Color(64, 64, 191));

        emp_name.setBackground(new java.awt.Color(255, 255, 255));
        emp_name.setForeground(new java.awt.Color(0, 0, 0));
        emp_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emp_name.setLabelText("EMPLOYEE NAME");
        emp_name.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        emp_name.setSelectionColor(new java.awt.Color(64, 64, 191));

        dob.setBackground(new java.awt.Color(255, 255, 255));
        dob.setForeground(new java.awt.Color(0, 0, 0));
        dob.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dob.setLabelText("DATE OF BIRTH");
        dob.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        dob.setSelectionColor(new java.awt.Color(64, 64, 191));

        salary.setBackground(new java.awt.Color(255, 255, 255));
        salary.setForeground(new java.awt.Color(0, 0, 0));
        salary.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        salary.setLabelText("SALARY");
        salary.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        salary.setSelectionColor(new java.awt.Color(64, 64, 191));

        hiredate.setBackground(new java.awt.Color(255, 255, 255));
        hiredate.setForeground(new java.awt.Color(0, 0, 0));
        hiredate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hiredate.setLabelText("HIRE DATE");
        hiredate.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        hiredate.setSelectionColor(new java.awt.Color(64, 64, 191));

        job.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PROPERTY MANAGER", "SALES MANAGER", "FRONT DESK", "SECURITY GUARD", "ADMINISTRATIVE ASSISTANT", "HOUSE KEEPER", "GARDENER", "POOL ATTENDANT" }));
        job.setSelectedIndex(-1);
        job.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        job.setLabeText("JOB");

        dob_button.setText("...");
        dob_button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dob_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_buttonActionPerformed(evt);
            }
        });

        hiredate_button.setText("...");
        hiredate_button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hiredate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiredate_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(salary, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(hiredate, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(emp_name, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(emp_id, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hiredate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(500, 500, 500))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(dob_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hiredate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(hiredate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            String query = "insert into employee(emp_id, emp_name, dob, hiredate, job, salary) values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, emp_id.getText());
            pst.setString(2, emp_name.getText());
            pst.setString(3, dob.getText());
            pst.setString(4, hiredate.getText());
            
            /* dob
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String dob = sdf.format(dob_date.getDate());
            pst.setString(3, dob);*/
            
            /* hiredate
            SimpleDateFormat hsdf = new SimpleDateFormat("dd-MM-yyyy");
            String hiredate = hsdf.format(hire_date.getDate());
            pst.setString(4, hiredate);*/
            
            // select item from combo box
            String selectjob;
            selectjob = job.getSelectedItem().toString();
            pst.setString(5, selectjob);
            
            pst.setString(6, salary.getText());
            pst.executeUpdate();
            label.setText("Record Inserted");
            pst.close();
            con.close();
        }
        
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_insertMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement();
            
            // update employee table
            statement.execute("UPDATE employee SET job='" + job.getSelectedItem() + "', salary=" + salary.getText() + "WHERE emp_id=" + emp_id.getText() ); 
            
            label.setText("Record Updated"); 
            statement.close();  
            con.close();  
        } 
        catch (SQLException | ClassNotFoundException se) {  
            JOptionPane.showMessageDialog(null, se);  
        }
    }//GEN-LAST:event_updateMouseClicked

    private void dob_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_buttonActionPerformed
        // TODO add your handling code here:
        date_dob.showPopup();
    }//GEN-LAST:event_dob_buttonActionPerformed

    private void hiredate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiredate_buttonActionPerformed
        // TODO add your handling code here:
        date_hiredate.showPopup();
    }//GEN-LAST:event_hiredate_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser date_dob;
    private com.raven.datechooser.DateChooser date_hiredate;
    private com.apartech.swingcontrol.TextField dob;
    private com.apartech.swingcontrol.Button dob_button;
    private com.apartech.swingcontrol.TextField emp_id;
    private com.apartech.swingcontrol.TextField emp_name;
    private com.apartech.swingcontrol.TextField hiredate;
    private com.apartech.swingcontrol.Button hiredate_button;
    private com.apartech.component.Button_Gradient insert;
    private com.apartech.swingcontrol.Combobox job;
    private javax.swing.JLabel label;
    private com.apartech.swingcontrol.TextField salary;
    private com.apartech.component.Button_Gradient update;
    // End of variables declaration//GEN-END:variables
}
