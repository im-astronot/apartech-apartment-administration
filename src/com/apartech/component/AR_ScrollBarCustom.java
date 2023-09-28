package com.apartech.component;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class AR_ScrollBarCustom extends JScrollBar {

    public AR_ScrollBarCustom() {
        setUI(new AR_ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setForeground(new Color(94, 139, 231));
        setUnitIncrement(20);
        setOpaque(false);
    }
}
