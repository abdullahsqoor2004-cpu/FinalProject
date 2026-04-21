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
    BG       = new Color(245, 247, 252);
    SIDEBAR  = new Color(10, 40, 100);    // ← نفس لون الـ dark
    TEXT     = Color.WHITE;               // ← نفس لون الـ dark
    BTN_BG   = new Color(30, 100, 200);
    BTN_TEXT = Color.WHITE;
    PANEL_BG = new Color(245, 247, 252);  // ← أبيض فاتح
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
        w.revalidate();
        w.repaint();
    }

    }

  public static void applyToContainer(Container c) {
    for (Component comp : c.getComponents()) {
        if (comp instanceof javax.swing.JScrollPane) {
            javax.swing.JScrollPane sp = (javax.swing.JScrollPane) comp;
            sp.setBackground(PANEL_BG);
            sp.getViewport().setBackground(PANEL_BG);
            applyToContainer(sp.getViewport());
        }
        if (comp instanceof javax.swing.JTable) {
            javax.swing.JTable t = (javax.swing.JTable) comp;
            t.setBackground(PANEL_BG);
            t.setForeground(TEXT);
            t.getTableHeader().setBackground(BTN_BG);
            t.getTableHeader().setForeground(BTN_TEXT);
            t.setGridColor(new Color(80, 100, 150));
        }
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
        if (comp instanceof javax.swing.JTextField) {
            comp.setBackground(PANEL_BG);
            comp.setForeground(TEXT);
        }
        if (comp instanceof Container) {
            applyToContainer((Container) comp);
        }
        if (comp instanceof javax.swing.JPanel) {
    // لا تغير الـ sidebar
    if (comp.getBackground().equals(new Color(10, 40, 100)) ||
        comp.getBackground().equals(new Color(15, 35, 90))) {
        // تجاهل
    } else {
        comp.setBackground(PANEL_BG);
        applyToContainer((Container) comp);
    }
}
    }
}
}