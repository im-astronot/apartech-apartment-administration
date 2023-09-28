package com.apartech.form;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.border.EmptyBorder;

public class AR_Main_Form extends javax.swing.JPanel {

    public AR_Main_Form() {
        initComponents();
        setOpaque(false);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(10, 20, 10, 20));
    }
    
    public void showForm(Component form){
        removeAll();
        add(form);
        repaint();
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
