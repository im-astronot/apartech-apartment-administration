package com.apartech.component;

import com.apartech.component.AR_EventMenu;
import com.apartech.component.AR_EventMenuSelected;
import com.apartech.component.AR_EventShowPopupMenu;
import com.apartech.component.AR_MenuAnimation;
import com.apartech.component.AR_MenuItem;
import com.apartech.component.AR_ModelMenu;
import com.apartech.component.AR_ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

public class AR_Menu extends javax.swing.JPanel {

    public boolean isShowMenu() {
        return showMenu;
    }

    public void addEvent(AR_EventMenuSelected event) {
        this.event = event;
    }

    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    public void addEventShowPopup(AR_EventShowPopupMenu eventShowPopup) {
        this.eventShowPopup = eventShowPopup;
    }

    private final MigLayout layout;
    private AR_EventMenuSelected event;
    private AR_EventShowPopupMenu eventShowPopup;
    private boolean enableMenu = true;
    private boolean showMenu = true;

    public AR_Menu() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new AR_ScrollBarCustom());
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        panel.setLayout(layout);
    }

    public void initMenuItem() {
          addMenu(new AR_ModelMenu(new ImageIcon(getClass().getResource("/com/apartech/icon/home.png")), "HOME"));
          addMenu(new AR_ModelMenu(new ImageIcon(getClass().getResource("/com/apartech/icon/purchase.png")), "PURCHASE", "View Record", "Update Record"));
          addMenu(new AR_ModelMenu(new ImageIcon(getClass().getResource("/com/apartech/icon/residential.png")), "RESIDENTIAL", "View Record", "Update Record"));
          addMenu(new AR_ModelMenu(new ImageIcon(getClass().getResource("/com/apartech/icon/exit.png")), "Log Out"));
    }

    private void addMenu(AR_ModelMenu menu) {
        panel.add(new AR_MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 40!");
    }

    private AR_EventMenu getEventMenu() {
        return (Component com, boolean open) -> {
            if (enableMenu) {
                if (isShowMenu()) {
                    if (open) {
                        new AR_MenuAnimation(layout, com).openMenu();
                    } else {
                        new AR_MenuAnimation(layout, com).closeMenu();
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
            AR_MenuItem item = (AR_MenuItem) com;
            if (item.isOpen()) {
                new AR_MenuAnimation(layout, com, 500).closeMenu();
                item.setOpen(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        profile2 = new com.apartech.component.AR_Profile();

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
            .addGap(0, 776, Short.MAX_VALUE)
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
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aR_Logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aR_Logout1MouseClicked
        // TODO add your handling code here:
        
        // take to main frame

    }//GEN-LAST:event_aR_Logout1MouseClicked

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
    private com.apartech.component.AR_Profile profile2;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
