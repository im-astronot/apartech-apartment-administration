package com.apartech.component;

import com.apartech.component.M_MenuAnimation;
import com.apartech.component.M_MenuItem;
import com.apartech.component.M_ModelMenu;
import com.apartech.component.M_ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import com.apartech.component.M_EventMenu;
import com.apartech.component.M_EventMenuSelected;
import com.apartech.component.M_EventShowPopupMenu;

public class M_Menu extends javax.swing.JPanel {

    public boolean isShowMenu() {
        return showMenu;
    }

    public void addEvent(M_EventMenuSelected event) {
        this.event = event;
    }

    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    public void addEventShowPopup(M_EventShowPopupMenu eventShowPopup) {
        this.eventShowPopup = eventShowPopup;
    }

    private final MigLayout layout;
    private M_EventMenuSelected event;
    private M_EventShowPopupMenu eventShowPopup;
    private boolean enableMenu = true;
    private boolean showMenu = true;

    public M_Menu() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new M_ScrollBarCustom());
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        panel.setLayout(layout);
    }

    public void initMenuItem() {
        addMenu(new M_ModelMenu(new ImageIcon(getClass().getResource("/com/apartech/icon/employee.png")), "EMPLOYEE", "View Record", "Insert or Update Record", "Delete Record"));
        addMenu(new M_ModelMenu(new ImageIcon(getClass().getResource("/com/apartech/icon/maintenance.png")), "MAINTENANCE", "View Record", "Update Record"));
        addMenu(new M_ModelMenu(new ImageIcon(getClass().getResource("/com/apartech/icon/dailyentry.png")), "DAILY ENTRY", "View Record", "Insert New Record"));
        addMenu(new M_ModelMenu(new ImageIcon(getClass().getResource("/com/apartech/icon/complaint.png")), "COMPLAINT", "View Record", "Insert New Record", "Delete Record"));
        addMenu(new M_ModelMenu(new ImageIcon(getClass().getResource("/com/apartech/icon/exit.png")), "Log Out"));
    }

    private void addMenu(M_ModelMenu menu) {
        panel.add(new M_MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 40!");
    }

    private M_EventMenu getEventMenu() {
        return (Component com, boolean open) -> {
            if (enableMenu) {
                if (isShowMenu()) {
                    if (open) {
                        new M_MenuAnimation(layout, com).openMenu();
                    } else {
                        new M_MenuAnimation(layout, com).closeMenu();
                    }
                    return true;
                } else {
                    eventShowPopup.showPopup(com);
                }
            }
            return false;
        };
    }

    public void hideallMenu() {
        for (Component com : panel.getComponents()) {
            M_MenuItem item = (M_MenuItem) com;
            if (item.isOpen()) {
                new M_MenuAnimation(layout, com, 500).closeMenu();
                item.setOpen(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        profile2 = new com.apartech.component.M_Profile();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        sp.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sp))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, new Color(13, 13, 13), getWidth(), 0, new Color(0, 43, 128));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private com.apartech.component.M_Profile profile2;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
