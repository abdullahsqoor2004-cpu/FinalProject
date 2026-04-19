package jo.edu.bau.settings;

import java.awt.*;
import jo.edu.bau.Dashboard;

public class ThemeManager {

    public static boolean isDark = false;

public static Color BG       = new Color(10, 40, 100);
public static Color SIDEBAR  = new Color(20, 60, 140);
public static Color TEXT     = new Color(200, 220, 255);
public static Color BTN_BG   = new Color(30, 100, 200);
public static Color BTN_TEXT = Color.WHITE;
public static Color PANEL_BG = new Color(15, 50, 120);

   public static void applyLight() {
    isDark   = false;
    BG       = new Color(220, 235, 255);
    SIDEBAR  = new Color(30, 100, 200);
    TEXT     = new Color(10, 40, 100);
    BTN_BG   = new Color(30, 100, 200);
    BTN_TEXT = Color.WHITE;
    PANEL_BG = new Color(240, 245, 255);
    applyToAll();
}

public static void applyDark() {
    isDark   = true;
    BG       = new Color(10, 20, 60);
    SIDEBAR  = new Color(15, 35, 90);
    TEXT     = Color.WHITE;
    BTN_BG   = new Color(30, 100, 200);
    BTN_TEXT = Color.WHITE;
    PANEL_BG = new Color(20, 45, 110);
    applyToAll();
}

    public static void apply() {
        applyToAll();
    }

    private static void applyToAll() {
        for (Window w : Window.getWindows()) {
        if (w instanceof Dashboard) {
            ((Dashboard) w).refreshTheme();
        }
        w.repaint();
    }
    }

    public static void applyToContainer(Container c) {
        for (Component comp : c.getComponents()) {
            if (comp instanceof javax.swing.JPanel) {
                comp.setBackground(PANEL_BG);
            }
            if (comp instanceof javax.swing.JLabel) {
                comp.setForeground(TEXT);
            }
            if (comp instanceof javax.swing.JButton) {
                comp.setBackground(BTN_BG);
                ((javax.swing.JButton) comp).setForeground(BTN_TEXT);
            }
            if (comp instanceof javax.swing.JTable) {
                comp.setBackground(PANEL_BG);
                comp.setForeground(TEXT);
            }
            if (comp instanceof javax.swing.JTextField) {
                comp.setBackground(PANEL_BG);
                comp.setForeground(TEXT);
            }
            if (comp instanceof Container) {
                applyToContainer((Container) comp);
            }
        }
    }
}