package jo.edu.bau.settings;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ThemeManager {

   static boolean isDark = false;

    // ألوان الثيم
    public static final java.awt.Color PRIMARY    = new java.awt.Color(91, 33, 182);   
    public static final java.awt.Color SECONDARY  = new java.awt.Color(167, 139, 250);  
    public static final java.awt.Color ACCENT     = new java.awt.Color(124, 58, 237); 
    public static final java.awt.Color BG_LIGHT   = new java.awt.Color(245, 243, 255);
    public static final java.awt.Color BG_DARK    = new java.awt.Color(46, 16, 101);   
    public static final java.awt.Color TEXT_LIGHT = new java.awt.Color(255, 255, 255);
    public static final java.awt.Color TEXT_DARK  = new java.awt.Color(17, 24, 39);

    public static void applyTheme(java.awt.Container container) {
        java.awt.Color bg = isDark ? BG_DARK : BG_LIGHT;
        java.awt.Color fg = isDark ? TEXT_LIGHT : TEXT_DARK;

        container.setBackground(bg);
        for (java.awt.Component c : container.getComponents()) {
            if (c instanceof javax.swing.JLabel) {
                c.setForeground(fg);
                c.setBackground(bg);
            } else if (c instanceof javax.swing.JTextField || 
                       c instanceof javax.swing.JPasswordField ||
                       c instanceof javax.swing.JTextArea) {
                c.setBackground(isDark ? new java.awt.Color(60, 68, 56) : java.awt.Color.WHITE);
                c.setForeground(fg);
                ((javax.swing.JComponent) c).setBorder(
                    javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createLineBorder(SECONDARY, 1),
                        javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)
                    )
                );
            } else if (c instanceof javax.swing.JButton) {
                styleButton((javax.swing.JButton) c);
            } else if (c instanceof javax.swing.JTable) {
                styleTable((javax.swing.JTable) c);
            } else if (c instanceof javax.swing.JPanel) {
                c.setBackground(bg);
                applyTheme((java.awt.Container) c);
            } else if (c instanceof javax.swing.JScrollPane) {
                c.setBackground(bg);
                applyTheme((java.awt.Container) c);
            }
        }
    }

    public static void styleButton(javax.swing.JButton btn) {
        btn.setBackground(PRIMARY);
        btn.setForeground(java.awt.Color.WHITE);
        btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(SECONDARY, 1),
            javax.swing.BorderFactory.createEmptyBorder(6, 16, 6, 16)
        ));
    }

    public static void styleTable(javax.swing.JTable table) {
        table.setRowHeight(30);
        table.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        table.setGridColor(new java.awt.Color(220, 225, 215));
        table.setSelectionBackground(SECONDARY);
        table.setSelectionForeground(java.awt.Color.WHITE);
        table.setBackground(isDark ? new java.awt.Color(55, 62, 50) : java.awt.Color.WHITE);
        table.setForeground(isDark ? TEXT_LIGHT : TEXT_DARK);

        // Header
        table.getTableHeader().setBackground(PRIMARY);
        table.getTableHeader().setForeground(java.awt.Color.WHITE);
        table.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        table.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 35));
    }

    public static void styleLoginPanel(java.awt.Container container) {
        java.awt.Color bg = isDark ? BG_DARK : BG_LIGHT;
        container.setBackground(bg);

        for (java.awt.Component c : container.getComponents()) {
            if (c instanceof javax.swing.JPanel) {
                javax.swing.JPanel panel = (javax.swing.JPanel) c;
                panel.setBackground(isDark ? new java.awt.Color(52, 60, 48) : java.awt.Color.WHITE);
                panel.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                    javax.swing.BorderFactory.createLineBorder(SECONDARY, 2),
                    javax.swing.BorderFactory.createEmptyBorder(20, 30, 20, 30)
                ));
                applyTheme(panel);
            }
        }
    }

}
