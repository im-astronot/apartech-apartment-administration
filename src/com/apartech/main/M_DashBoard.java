package com.apartech.main;

import com.apartech.form.M_Main_Form;
import com.apartech.component.M_Menu;
import com.apartech.component.M_Header;
import com.apartech.component.M_MenuItem;
import com.apartech.component.M_PopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import com.apartech.component.M_EventMenuSelected;
import com.apartech.component.M_EventShowPopupMenu;
import com.apartech.form.M_Complaint_Delete;
import com.apartech.form.M_Complaint_Insert;
import com.apartech.form.M_Complaint_View;
import com.apartech.form.M_DailyEntry_Insert;
import com.apartech.form.M_DailyEntry_View;
import com.apartech.form.M_Employee_Delete;
import com.apartech.form.M_Employee_InsertUpdate;
import com.apartech.form.M_Employee_View;
import com.apartech.form.M_Maintenance_Update;
import com.apartech.form.M_Maintenance_View;

public class M_DashBoard extends javax.swing.JFrame {

    private MigLayout layout;
    private M_Menu menu;
    private M_Header header;
    private M_Main_Form main;
    private Animator animator;

    public M_DashBoard() {
        initComponents();
        init();
    }

    private void init() {
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        bg.setLayout(layout);
        menu = new M_Menu();
        header = new M_Header();
        main = new M_Main_Form();
        menu.addEvent(new M_EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu Index : " + menuIndex + " SubMenu Index " + subMenuIndex);
                
                switch (menuIndex) {
                    case 0:
                        if(subMenuIndex == 0) {
                            main.showForm(new M_Employee_View());
                        }
                        else if(subMenuIndex == 1){
                            main.showForm(new M_Employee_InsertUpdate());
                        }
                        else if (subMenuIndex == 2){
                            main.showForm(new M_Employee_Delete());
                        }   
                        break;
                        
                    case 1:
                        if(subMenuIndex == 0) {
                            main.showForm(new M_Maintenance_View());
                        }
                        else if(subMenuIndex == 1){
                            main.showForm(new M_Maintenance_Update());
                        }   
                        break;
                        
                    case 2:
                        if(subMenuIndex == 0) {
                            main.showForm(new M_DailyEntry_View());
                        }
                        else if(subMenuIndex == 1){
                            main.showForm(new M_DailyEntry_Insert());
                        }   
                        break;
                        
                    case 3:
                        if(subMenuIndex == 0) {
                            main.showForm(new M_Complaint_View());
                        }
                        else if(subMenuIndex == 1){
                            main.showForm(new M_Complaint_Insert());
                        }
                        else if(subMenuIndex == 2){
                            main.showForm(new M_Complaint_Delete());
                        }   
                        break;
                    
                    case 4:
                        if(subMenuIndex == -1) {
                            setVisible(false);
                            MainFrame frame = new MainFrame();
                            frame.setVisible(true);
                        }
                    default:
                        break;
                }
            }
        });
      
        
        menu.addEventShowPopup(new M_EventShowPopupMenu() {
            @Override
            public void showPopup(Component com) {
                M_MenuItem item = (M_MenuItem) com;
                M_PopupMenu popup = new M_PopupMenu(M_DashBoard.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
                int x = M_DashBoard.this.getX() + 52;
                int y = M_DashBoard.this.getY() + com.getY() + 86;
                popup.setLocation(x, y);
                popup.setVisible(true);
            }
        });
        menu.initMenuItem();
        bg.add(menu, "w 230!, spany 2");    // Span Y 2cell
        bg.add(header, "h 50!, wrap");
        bg.add(main, "w 100%, h 100%");
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowMenu()) {
                    width = 60 + (170 * (1f - fraction));
                } else {
                    width = 60 + (170 * fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnableMenu(true);
            }

        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        header.addMenuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
                menu.setEnableMenu(false);
                if (menu.isShowMenu()) {
                    menu.hideallMenu();
                }
            }
        });
        main.showForm(new M_Employee_View());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(M_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new M_DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
