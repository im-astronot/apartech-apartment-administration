
package com.apartech.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class M_DailyEntry_Insert extends javax.swing.JPanel {

    public M_DailyEntry_Insert() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ddate = new com.raven.datechooser.DateChooser();
        label = new javax.swing.JLabel();
        insert = new com.apartech.component.Button_Gradient();
        name = new com.apartech.swingcontrol.TextField();
        contact = new com.apartech.swingcontrol.TextField();
        d_date = new com.apartech.swingcontrol.TextField();
        purpose = new com.apartech.swingcontrol.TextField();
        from = new com.apartech.swingcontrol.TextField();
        flat_num = new com.apartech.swingcontrol.TextField();
        emp_id = new com.apartech.swingcontrol.TextField();
        date_button = new com.apartech.swingcontrol.Button();

        ddate.setForeground(new java.awt.Color(64, 64, 191));
        ddate.setTextRefernce(d_date);

        label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        name.setLabelText("NAME");
        name.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        name.setSelectionColor(new java.awt.Color(64, 64, 191));

        contact.setBackground(new java.awt.Color(255, 255, 255));
        contact.setForeground(new java.awt.Color(0, 0, 0));
        contact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contact.setLabelText("CONTACT");
        contact.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        contact.setSelectionColor(new java.awt.Color(64, 64, 191));

        d_date.setBackground(new java.awt.Color(255, 255, 255));
        d_date.setForeground(new java.awt.Color(0, 0, 0));
        d_date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d_date.setLabelText("DATE");
        d_date.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        d_date.setSelectionColor(new java.awt.Color(64, 64, 191));

        purpose.setBackground(new java.awt.Color(255, 255, 255));
        purpose.setForeground(new java.awt.Color(0, 0, 0));
        purpose.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        purpose.setLabelText("PURPOSE");
        purpose.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        purpose.setSelectionColor(new java.awt.Color(64, 64, 191));

        from.setBackground(new java.awt.Color(255, 255, 255));
        from.setForeground(new java.awt.Color(0, 0, 0));
        from.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        from.setLabelText("FROM LOCATION");
        from.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        from.setSelectionColor(new java.awt.Color(64, 64, 191));

        flat_num.setBackground(new java.awt.Color(255, 255, 255));
        flat_num.setForeground(new java.awt.Color(0, 0, 0));
        flat_num.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        flat_num.setLabelText("FLAT NUMBER");
        flat_num.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        flat_num.setSelectionColor(new java.awt.Color(64, 64, 191));

        emp_id.setBackground(new java.awt.Color(255, 255, 255));
        emp_id.setForeground(new java.awt.Color(0, 0, 0));
        emp_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emp_id.setLabelText("EMPLOYEE ID");
        emp_id.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        emp_id.setSelectionColor(new java.awt.Color(64, 64, 191));

        date_button.setForeground(new java.awt.Color(255, 255, 255));
        date_button.setText("...");
        date_button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        date_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(flat_num, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(purpose, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(emp_id, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(d_date, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(480, 480, 480))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(d_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(purpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flat_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        int slnum = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "apartech", "krbr");
            Statement statement = con.createStatement(); 
            String query = "select count(*) from dentry";
            String query1 = "insert into dentry(sl_num, d_name, d_contact, d_date, purpose, from_loc, flat_num, emp_id) values(?,?,?,?,?,?,?,?)";
            ResultSet rs = statement.executeQuery(query);
            
            rs.next();
            slnum = rs.getInt(1);
            slnum++;
            
            PreparedStatement pst = con.prepareStatement(query1);
            pst.setInt(1, slnum);
            pst.setString(2, name.getText());
            pst.setString(3, contact.getText());
            pst.setString(4, d_date.getText());
            /* daily entry date
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String d_date = sdf.format(date.getDate());
            pst.setString(4, d_date);*/
            
            pst.setString(5, purpose.getText());
            pst.setString(6, from.getText());
            pst.setString(7, flat_num.getText());
            pst.setString(8, emp_id.getText());
            pst.executeUpdate();
            label.setText("Record Inserted");
            pst.close();
            con.close();
        }
        
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_insertActionPerformed

    private void date_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_buttonActionPerformed
        // TODO add your handling code here:
        ddate.showPopup();
    }//GEN-LAST:event_date_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apartech.swingcontrol.TextField contact;
    private com.apartech.swingcontrol.TextField d_date;
    private com.apartech.swingcontrol.Button date_button;
    private com.raven.datechooser.DateChooser ddate;
    private com.apartech.swingcontrol.TextField emp_id;
    private com.apartech.swingcontrol.TextField flat_num;
    private com.apartech.swingcontrol.TextField from;
    private com.apartech.component.Button_Gradient insert;
    private javax.swing.JLabel label;
    private com.apartech.swingcontrol.TextField name;
    private com.apartech.swingcontrol.TextField purpose;
    // End of variables declaration//GEN-END:variables
}
