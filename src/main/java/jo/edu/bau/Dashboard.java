package jo.edu.bau;

import jo.edu.bau.settings.ThemeManager;
import jo.edu.bau.pay.Payroll;
import jo.edu.bau.attendance.Attendance;
import jo.edu.bau.emp.Employees;


public class Dashboard extends java.awt.Frame {
java.awt.Color PRIMARY   = new java.awt.Color(30, 100, 200);
java.awt.Color SIDEBAR   = new java.awt.Color(10, 40, 100);
java.awt.Color HOVER     = new java.awt.Color(100, 160, 255);
java.awt.Color TEXT      = new java.awt.Color(255, 255, 255);
java.awt.Color HEADER_BG = new java.awt.Color(20, 60, 140);

public Dashboard() {
    initComponents();
    
    // ← START: أضف هذا
    jPanel3.setLayout(new java.awt.BorderLayout());
    jPanel3.add(jPanel1, java.awt.BorderLayout.WEST);
    jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);
    // ← END
    
    setSize(1200, 700);
    setLocationRelativeTo(null);
    jPanel4.setBackground(java.awt.Color.WHITE);
    jPanel4.setOpaque(true);
    setTitle("HR-Pro");
    addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent evt) {
            System.exit(0);
        }
    });
    setupSidebar();
    setupCards();
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Employees");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Attendance");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Payroll");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Settings");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Ask Ai");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Report");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Hr-Pro");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3, "card2");

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

 private void setupSidebar() {
    jPanel1.setBackground(SIDEBAR);
    
 javax.swing.JLabel[] labels = {jLabel8, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7};
String[] cards = {"Dashboard", "Employees", "Attendance", "Payroll", "Settings", "AIChat", "Report"};
String[] icons = {"@ ", "* ", "~ ", "$ ", "# ", "? ", "= "};
    for (int i = 0; i < labels.length; i++) {
        labels[i].setText(icons[i] + labels[i].getText());
        labels[i].setForeground(TEXT);
        labels[i].setOpaque(true);
        labels[i].setBackground(SIDEBAR);
        labels[i].setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 12, 10, 12));
        labels[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        final String cardName = cards[i];
        final javax.swing.JLabel lbl = labels[i];

        lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
    // شيل الـ hover من كل الأزرار
    for (javax.swing.JLabel l : labels) {
        l.setBackground(SIDEBAR);
    }
    // حط الـ hover على اللي انضغط
    lbl.setBackground(HOVER);
    showCard(cardName);
}

public void mouseEntered(java.awt.event.MouseEvent e) {
    lbl.setBackground(HOVER);
}

public void mouseExited(java.awt.event.MouseEvent e) {
    // ارجع للـ SIDEBAR بس إذا مش هو الـ active
    boolean isActive = lbl.getBackground().equals(HOVER);
    // شوف إذا في زر active ثاني
    boolean otherActive = false;
    for (javax.swing.JLabel l : labels) {
        if (l != lbl && l.getBackground().equals(HOVER)) {
            otherActive = true;
            break;
        }
    }
    if (otherActive || !isActive) {
        lbl.setBackground(SIDEBAR);
    }

            }
        });
    }

    // أول واحد active
    labels[0].setBackground(HOVER);
    
    // لون الـ header
    jLabel1.setForeground(TEXT);
jPanel3.setBackground(new java.awt.Color(10, 40, 100));
}

private void setupCards() {
    jPanel4.removeAll();
    jPanel4.setLayout(new java.awt.BorderLayout());
    jPanel4.setBackground(ThemeManager.PANEL_BG);
    
    cardsContainer = new javax.swing.JPanel(new java.awt.CardLayout());
    cardsContainer.setBackground(ThemeManager.PANEL_BG);
    
    cardsContainer.add(createDashboardHome(), "Dashboard");
    
    empPanel = new Employees();
    cardsContainer.add(empPanel, "Employees");
    
    attPanel = new Attendance();
    cardsContainer.add(attPanel, "Attendance");
    
    payPanel = new Payroll();
    cardsContainer.add(payPanel, "Payroll");
    
    cardsContainer.add(buildSettingsPanel(), "Settings");
    cardsContainer.add(createAIChatPanel(), "AIChat");
cardsContainer.add(createReportPanel(), "Report");    
    jPanel4.add(cardsContainer, java.awt.BorderLayout.CENTER);
    
    jPanel4.revalidate();
    jPanel4.repaint();
    
    java.awt.CardLayout cl = (java.awt.CardLayout) cardsContainer.getLayout();
    cl.show(cardsContainer, "Dashboard");
}
public void showCard(String name) {
    switch (name) {
        case "Employees":  empPanel.refresh();  break;
        case "Attendance": attPanel.refresh();  break;
        case "Payroll":    payPanel.refresh();  break;
    }
    java.awt.CardLayout cl = (java.awt.CardLayout) cardsContainer.getLayout();
    cl.show(cardsContainer, name);
}

public void refreshDashboard() {
    jPanel4.remove(jPanel4.getComponent(0));
    jPanel4.add(createDashboardHome(), "Dashboard", 0);
    jPanel4.revalidate();
    jPanel4.repaint();
}
private javax.swing.JPanel buildSettingsPanel() {
   javax.swing.JPanel root = new javax.swing.JPanel(new java.awt.BorderLayout());
root.setBackground(ThemeManager.PANEL_BG);
root.setPreferredSize(new java.awt.Dimension(900, 600));

    javax.swing.JLabel title = new javax.swing.JLabel("Settings");
    title.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
    title.setForeground(ThemeManager.TEXT);
    title.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255, 30)),
        javax.swing.BorderFactory.createEmptyBorder(28, 36, 20, 36)
    ));
    root.add(title, java.awt.BorderLayout.NORTH);

    javax.swing.JPanel content = new javax.swing.JPanel();
    content.setLayout(new javax.swing.BoxLayout(content, javax.swing.BoxLayout.Y_AXIS));
    content.setBackground(ThemeManager.PANEL_BG);
    content.setBorder(javax.swing.BorderFactory.createEmptyBorder(28, 36, 28, 36));

    final boolean[] isDark = {false};
    javax.swing.JToggleButton toggle = buildSettingsToggle();
    javax.swing.JLabel toggleLabel = new javax.swing.JLabel("Light Mode");
    toggleLabel.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
    toggleLabel.setForeground(new java.awt.Color(255, 255, 255, 150));

    javax.swing.JPanel toggleRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 0));
    toggleRow.setOpaque(false);
    toggleRow.add(toggleLabel);
    toggleRow.add(toggle);

    toggle.addActionListener(e -> {
        isDark[0] = toggle.isSelected();
        toggleLabel.setText(isDark[0] ? "Dark Mode" : "Light Mode");
        if (isDark[0]) ThemeManager.applyDark();
        else           ThemeManager.applyLight();
        toggle.repaint();
    });

    content.add(buildSettingsCard("🌙", "Appearance", "Switch between Light and Dark mode", toggleRow));
    content.add(javax.swing.Box.createVerticalStrut(14));

    javax.swing.JButton btnPass = buildSettingsBtn("Change Password", new java.awt.Color(30, 100, 200), java.awt.Color.WHITE);
    btnPass.addActionListener(e -> {
        jo.edu.bau.settings.ChangePassword dialog = new jo.edu.bau.settings.ChangePassword(null, true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    });
    content.add(buildSettingsCard("🔑", "Change Password", "Update your login password", btnPass));
    content.add(javax.swing.Box.createVerticalStrut(14));

    javax.swing.JButton btnOut = buildSettingsBtn("Sign Out", new java.awt.Color(210, 35, 35), java.awt.Color.WHITE);
    btnOut.addActionListener(e -> {
        int choice = javax.swing.JOptionPane.showConfirmDialog(
            root, "Do you want to log out?", "Log Out",
            javax.swing.JOptionPane.YES_NO_OPTION
        );
        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            dispose();
            new jo.edu.bau.Login().setVisible(true);
        }
    });
    content.add(buildSettingsCard("🚪", "Sign Out", "End your current session", btnOut));

    javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(content);
    scroll.setBorder(null);
    scroll.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    scroll.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    scroll.getViewport().setBackground(ThemeManager.PANEL_BG);
    scroll.setBackground(ThemeManager.PANEL_BG);

    root.add(scroll, java.awt.BorderLayout.CENTER);
    return root;
}

private javax.swing.JPanel buildSettingsCard(String icon, String titleText,
                                              String subtitle, java.awt.Component action) {
    javax.swing.JPanel card = new javax.swing.JPanel(new java.awt.BorderLayout(16, 0)) {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 16, 16);
            g2.dispose();
        }
    };
    card.setOpaque(false);
    card.setBackground(new java.awt.Color(255, 255, 255, 15));
    card.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
    card.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, 86));
    card.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        new SettingsRoundedBorder(16, new java.awt.Color(255, 255, 255, 40), 1),
        javax.swing.BorderFactory.createEmptyBorder(18, 22, 18, 22)
    ));

    javax.swing.JLabel ico = new javax.swing.JLabel(icon) {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new java.awt.Color(255, 255, 255, 20));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 12, 12);
            g2.dispose();
            super.paintComponent(g);
        }
    };
    ico.setFont(new java.awt.Font("Segoe UI Emoji", java.awt.Font.PLAIN, 24));
    ico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    ico.setPreferredSize(new java.awt.Dimension(48, 48));
    ico.setOpaque(false);

    javax.swing.JPanel textPanel = new javax.swing.JPanel(new java.awt.GridLayout(2, 1, 0, 3));
    textPanel.setOpaque(false);
    javax.swing.JLabel lblT = new javax.swing.JLabel(titleText);
    lblT.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
    lblT.setForeground(ThemeManager.TEXT);
    javax.swing.JLabel lblS = new javax.swing.JLabel(subtitle);
    lblS.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
    lblS.setForeground(new java.awt.Color(255, 255, 255, 120));
    textPanel.add(lblT);
    textPanel.add(lblS);

    card.add(ico, java.awt.BorderLayout.WEST);
    card.add(textPanel, java.awt.BorderLayout.CENTER);
    card.add(action, java.awt.BorderLayout.EAST);
    return card;
}

private javax.swing.JToggleButton buildSettingsToggle() {
    javax.swing.JToggleButton t = new javax.swing.JToggleButton();
    t.setSelected(false);
    t.setPreferredSize(new java.awt.Dimension(54, 28));
    t.setFocusPainted(false);
    t.setBorderPainted(false);
    t.setContentAreaFilled(false);
    t.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    t.setUI(new javax.swing.plaf.basic.BasicToggleButtonUI() {
        @Override
        public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            boolean on = t.isSelected();
            g2.setColor(on ? new java.awt.Color(30, 100, 200) : new java.awt.Color(190, 196, 210));
            g2.fillRoundRect(0, 0, 54, 28, 28, 28);
            g2.setColor(java.awt.Color.WHITE);
            g2.fillOval(on ? 28 : 4, 3, 22, 22);
            g2.dispose();
        }
    });
    return t;
}

private javax.swing.JButton buildSettingsBtn(String text, java.awt.Color bg, java.awt.Color fg) {
    javax.swing.JButton btn = new javax.swing.JButton(text) {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
            g2.dispose();
            super.paintComponent(g);
        }
    };
    btn.setBackground(bg);
    btn.setForeground(fg);
    btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
    btn.setFocusPainted(false);
    btn.setContentAreaFilled(false);
    btn.setBorderPainted(false);
    btn.setOpaque(false);
    btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(9, 22, 9, 22));
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent e) { btn.setBackground(bg.darker()); btn.repaint(); }
        public void mouseExited (java.awt.event.MouseEvent e) { btn.setBackground(bg);           btn.repaint(); }
    });
    return btn;
}

private static class SettingsRoundedBorder implements javax.swing.border.Border {
    private final int radius, thickness;
    private final java.awt.Color color;
    SettingsRoundedBorder(int r, java.awt.Color c, int t) { radius = r; color = c; thickness = t; }
    @Override public java.awt.Insets getBorderInsets(java.awt.Component c) {
        return new java.awt.Insets(thickness, thickness, thickness, thickness);
    }
    @Override public boolean isBorderOpaque() { return false; }
    @Override public void paintBorder(java.awt.Component c, java.awt.Graphics g,
                                      int x, int y, int w, int h) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                            java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(color);
        g2.setStroke(new java.awt.BasicStroke(thickness));
        g2.drawRoundRect(x, y, w - 1, h - 1, radius, radius);
        g2.dispose();
    }
}
private javax.swing.JPanel createDashboardHome() {
    javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.BorderLayout());
    panel.setBackground(ThemeManager.PANEL_BG);  // ← بدل Color.WHITE

    // ===== Header =====
    javax.swing.JLabel header = new javax.swing.JLabel("Hr-Pro / Dashboard");
    header.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
    header.setForeground(ThemeManager.TEXT);  // ← بدل new Color(91,33,182)
    header.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 20, 8, 0));
    panel.add(header, java.awt.BorderLayout.NORTH);

    // ===== Content Panel =====
    javax.swing.JPanel content = new javax.swing.JPanel(new java.awt.GridBagLayout());
    content.setBackground(java.awt.Color.WHITE);
    content.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 16, 10, 16));
    java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
    gbc.insets = new java.awt.Insets(8, 8, 8, 8);
    gbc.fill = java.awt.GridBagConstraints.BOTH;

    // ===== Stat Cards Row =====
    String[] statLabels  = {"Total Employees", "Active", "On Leave", "Monthly Payroll"};
String[] statValues = {
    String.valueOf(getEmployeeCount()),
    String.valueOf(getEmployeeCount()),
    "0",
    "0 JOD"
};
        java.awt.Color[] statColors = {
        new java.awt.Color(91, 33, 182),
        new java.awt.Color(16, 110, 86),
        new java.awt.Color(180, 83, 9),
        new java.awt.Color(185, 28, 28)
    };

    for (int i = 0; i < 4; i++) {
        javax.swing.JPanel card = new javax.swing.JPanel(new java.awt.BorderLayout(0, 4));
        card.setBackground(new java.awt.Color(statColors[i].getRed(),
                                               statColors[i].getGreen(),
                                               statColors[i].getBlue(), 20));
        card.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(statColors[i], 1, true),
            javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16)
        ));
        card.setOpaque(true);

        javax.swing.JLabel lbl = new javax.swing.JLabel(statLabels[i]);
        lbl.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
        lbl.setForeground(statColors[i]);

        javax.swing.JLabel val = new javax.swing.JLabel(statValues[i]);
        val.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
        val.setForeground(statColors[i]);

        card.add(lbl, java.awt.BorderLayout.NORTH);
        card.add(val, java.awt.BorderLayout.CENTER);

        gbc.gridx = i; gbc.gridy = 0;
        gbc.weightx = 1; gbc.weighty = 0;
        gbc.ipady = 10;
        content.add(card, gbc);
    }

    // ===== Charts Row =====
    gbc.gridy = 1;
    gbc.weighty = 1;
    gbc.ipady = 0;

    // Employee Bar Chart
    gbc.gridx = 0; gbc.gridwidth = 2;
    content.add(createEmployeeBarChart(), gbc);

    // Payroll Line Chart
    gbc.gridx = 2; gbc.gridwidth = 2;
    content.add(createPayrollLineChart(), gbc);

    panel.add(content, java.awt.BorderLayout.CENTER);
    return panel;
}
private javax.swing.JPanel createEmployeeBarChart() {
    javax.swing.JPanel p = new javax.swing.JPanel(new java.awt.BorderLayout(0, 6));
    p.setBackground(ThemeManager.PANEL_BG);       // ← بدل Color.WHITE
p.setBorder(javax.swing.BorderFactory.createCompoundBorder(
    javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255, 40), 1, true),  // ← بدل new Color(200,200,200)
    javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)
));

    javax.swing.JLabel title = new javax.swing.JLabel("Employees by Department");
    title.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
title.setForeground(ThemeManager.TEXT);  // ← بدل الألوان الملونة
    p.add(title, java.awt.BorderLayout.NORTH);

    String[] depts  = {"IT", "HR", "Finance", "Operations"};
    int[]    values = {85, 40, 60, 70};
    java.awt.Color BAR_COLOR = new java.awt.Color(91, 33, 182);

    javax.swing.JPanel chart = new javax.swing.JPanel() {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            super.paintComponent(g);
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

            int w = getWidth(), h = getHeight();
            int pad = 30, barW = (w - pad * 2) / (values.length * 2);
            int maxVal = 100;

            // Grid lines
            g2.setColor(new java.awt.Color(230, 230, 230));
            g2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 10));
            for (int i = 0; i <= 4; i++) {
                int y = h - pad - (int)((double) i / 4 * (h - pad * 2));
                g2.drawLine(pad, y, w - pad, y);
g2.setColor(new java.awt.Color(255, 255, 255, 30));  // ← grid lines بدل Color(230,230,230)
                g2.drawString(String.valueOf(i * 25), 2, y + 4);
g2.setColor(new java.awt.Color(255, 255, 255, 150)); // ← text labels بدل Color(160,160,160)
            }

            // Bars
            for (int i = 0; i < values.length; i++) {
                int barH = (int)((double) values[i] / maxVal * (h - pad * 2));
                int x = pad + i * (barW * 2) + barW / 2;
                int y = h - pad - barH;

                // Shadow
                g2.setColor(new java.awt.Color(91, 33, 182, 30));
                g2.fillRoundRect(x + 3, y + 3, barW, barH, 6, 6);

                // Bar
                g2.setColor(BAR_COLOR);
                g2.fillRoundRect(x, y, barW, barH, 6, 6);

                // Value on top
                g2.setColor(new java.awt.Color(46, 16, 101));
                g2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 11));
                g2.drawString(String.valueOf(values[i]),
                              x + barW / 2 - 8, y - 4);

                // Dept label
                g2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 11));
                g2.setColor(new java.awt.Color(100, 100, 100));
                g2.drawString(depts[i], x + barW / 2 - (depts[i].length() * 3), h - 6);
            }
        }
    };
    chart.setBackground(java.awt.Color.WHITE);
    p.add(chart, java.awt.BorderLayout.CENTER);
    return p;
}

private javax.swing.JPanel createPayrollLineChart() {
    javax.swing.JPanel p = new javax.swing.JPanel(new java.awt.BorderLayout(0, 6));
    p.setBackground(java.awt.Color.WHITE);
    p.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200), 1, true),
        javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)
    ));

    javax.swing.JLabel title = new javax.swing.JLabel("Monthly Payroll (JOD)");
    title.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
    title.setForeground(new java.awt.Color(15, 110, 86));
    p.add(title, java.awt.BorderLayout.NORTH);

    String[] months  = {"Jan","Feb","Mar","Apr","May","Jun"};
    int[]    amounts = {38000, 39500, 37800, 41000, 42500, 42075};
    java.awt.Color LINE_COLOR = new java.awt.Color(16, 110, 86);

    javax.swing.JPanel chart = new javax.swing.JPanel() {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            super.paintComponent(g);
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

            int w = getWidth(), h = getHeight();
            int padX = 44, padY = 20;
            int minV = 35000, maxV = 45000;

            // Grid lines
            g2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 9));
            for (int i = 0; i <= 4; i++) {
                int y = h - padY - (int)((double) i / 4 * (h - padY * 2));
                g2.setColor(new java.awt.Color(230, 230, 230));
                g2.drawLine(padX, y, w - 10, y);
                g2.setColor(new java.awt.Color(150, 150, 150));
                g2.drawString((35 + i * 2.5 + "K").replace(".0",""), 2, y + 4);
            }

            // Compute points
            int n = months.length;
            int[] px = new int[n], py = new int[n];
            int chartW = w - padX - 10;
            for (int i = 0; i < n; i++) {
                px[i] = padX + (int)((double) i / (n - 1) * chartW);
                py[i] = h - padY - (int)((double)(amounts[i] - minV) / (maxV - minV) * (h - padY * 2));
            }

            // Fill under line
            java.awt.Polygon fill = new java.awt.Polygon();
            for (int i = 0; i < n; i++) fill.addPoint(px[i], py[i]);
            fill.addPoint(px[n-1], h - padY);
            fill.addPoint(px[0], h - padY);
            g2.setColor(new java.awt.Color(16, 110, 86, 30));
            g2.fillPolygon(fill);

            // Line
            g2.setColor(LINE_COLOR);
            g2.setStroke(new java.awt.BasicStroke(2.2f, java.awt.BasicStroke.CAP_ROUND,
                                                   java.awt.BasicStroke.JOIN_ROUND));
            for (int i = 0; i < n - 1; i++)
                g2.drawLine(px[i], py[i], px[i+1], py[i+1]);

            // Dots + month labels
            for (int i = 0; i < n; i++) {
                g2.setColor(java.awt.Color.WHITE);
                g2.fillOval(px[i] - 4, py[i] - 4, 8, 8);
                g2.setColor(LINE_COLOR);
                g2.setStroke(new java.awt.BasicStroke(2f));
                g2.drawOval(px[i] - 4, py[i] - 4, 8, 8);

                g2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 10));
                g2.setColor(new java.awt.Color(100, 100, 100));
                g2.drawString(months[i], px[i] - 10, h - 4);
            }
        }
    };
    chart.setBackground(java.awt.Color.WHITE);
    p.add(chart, java.awt.BorderLayout.CENTER);
    return p;
}
private javax.swing.JPanel createPlaceholder(String text) {
    javax.swing.JPanel p = new javax.swing.JPanel(new java.awt.BorderLayout());
    javax.swing.JLabel lbl = new javax.swing.JLabel(text, javax.swing.SwingConstants.CENTER);
    lbl.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
    lbl.setForeground(new java.awt.Color(91, 33, 182));
    p.add(lbl, java.awt.BorderLayout.CENTER);
    return p;
}
// ... createPlaceholder method ...

private int getEmployeeCount() {
    int count = 0;
    try {
        java.sql.Connection con = jo.edu.bau.utils.DatabaseConnection.getConnection();
        java.sql.ResultSet rs = con.createStatement()
            .executeQuery("SELECT COUNT(*) FROM EMPLOYEE");
        if (rs.next()) count = rs.getInt(1);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return count;
}

private javax.swing.JPanel createAIChatPanel() {
    // الـ outer panel هو اللي بيرجع
    javax.swing.JPanel outer = new javax.swing.JPanel(new java.awt.BorderLayout(0, 0));
    outer.setBackground(ThemeManager.PANEL_BG);

    javax.swing.JPanel root = new javax.swing.JPanel(new java.awt.BorderLayout(0, 0));
    root.setBackground(ThemeManager.PANEL_BG);

    // ===== Header =====
    javax.swing.JPanel headerPanel = new javax.swing.JPanel(new java.awt.BorderLayout());
    headerPanel.setBackground(ThemeManager.PANEL_BG);
    headerPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255, 30)),
        javax.swing.BorderFactory.createEmptyBorder(20, 28, 16, 28)
    ));

    javax.swing.JPanel headerLeft = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 12, 0));
    headerLeft.setOpaque(false);

    javax.swing.JLabel avatar = new javax.swing.JLabel("AI") {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new java.awt.Color(30, 100, 200));
            g2.fillOval(0, 0, getWidth(), getHeight());
            g2.dispose();
            super.paintComponent(g);
        }
    };
    avatar.setPreferredSize(new java.awt.Dimension(44, 44));
    avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    avatar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
    avatar.setForeground(java.awt.Color.WHITE);
    avatar.setOpaque(false);

    javax.swing.JPanel titleGroup = new javax.swing.JPanel(new java.awt.GridLayout(2, 1, 0, 2));
    titleGroup.setOpaque(false);
    javax.swing.JLabel titleLbl = new javax.swing.JLabel("HR Assistant");
    titleLbl.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16));
    titleLbl.setForeground(java.awt.Color.WHITE);
    javax.swing.JLabel statusLbl = new javax.swing.JLabel("● Online");
    statusLbl.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
    statusLbl.setForeground(new java.awt.Color(80, 200, 120));
    titleGroup.add(titleLbl);
    titleGroup.add(statusLbl);
    headerLeft.add(avatar);
    headerLeft.add(titleGroup);
    headerPanel.add(headerLeft, java.awt.BorderLayout.WEST);

    // ===== Chat Area =====
    javax.swing.JPanel chatArea = new javax.swing.JPanel();
    chatArea.setLayout(new javax.swing.BoxLayout(chatArea, javax.swing.BoxLayout.Y_AXIS));
    chatArea.setBackground(ThemeManager.PANEL_BG);
    chatArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 24, 20, 24));

    javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(chatArea);
    scrollPane.setBorder(null);
    scrollPane.setBackground(ThemeManager.PANEL_BG);
    scrollPane.getViewport().setBackground(ThemeManager.PANEL_BG);
    scrollPane.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    scrollPane.getVerticalScrollBar().setUnitIncrement(16);

    addAIWelcomeBubble(chatArea);
    chatArea.add(javax.swing.Box.createVerticalStrut(10));

    root.add(headerPanel, java.awt.BorderLayout.NORTH);
    root.add(scrollPane,  java.awt.BorderLayout.CENTER);

    // ===== Input Field =====
    // ===== Input Field =====
javax.swing.JTextField inputField = new javax.swing.JTextField() {
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                            java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new java.awt.Color(10, 40, 110));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 16, 16);
        g2.dispose();
        super.paintComponent(g);
    }
    @Override
    protected void paintBorder(java.awt.Graphics g) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                            java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new java.awt.Color(80, 140, 255, 180));
        g2.setStroke(new java.awt.BasicStroke(1.5f));
        g2.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 16, 16);
        g2.dispose();
    }
};
inputField.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
inputField.setForeground(java.awt.Color.WHITE);
inputField.setCaretColor(new java.awt.Color(100, 170, 255));
inputField.setOpaque(false);
inputField.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
inputField.setPreferredSize(new java.awt.Dimension(0, 52));

final String placeholder = "🔍  اسأل عن موظف أو أي شيء...";
inputField.setText(placeholder);
inputField.setForeground(new java.awt.Color(140, 170, 220));
inputField.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent e) {
        if (inputField.getText().equals(placeholder)) {
            inputField.setText("");
            inputField.setForeground(java.awt.Color.WHITE);
        }
    }
    public void focusLost(java.awt.event.FocusEvent e) {
        if (inputField.getText().isEmpty()) {
            inputField.setText(placeholder);
            inputField.setForeground(new java.awt.Color(140, 170, 220));
        }
    }
});

// ===== Send Button =====
javax.swing.JButton sendBtn = new javax.swing.JButton("إرسال") {
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                            java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 14, 14);
        g2.dispose();
        super.paintComponent(g);
    }
};
sendBtn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
sendBtn.setBackground(new java.awt.Color(30, 100, 200));
sendBtn.setForeground(java.awt.Color.WHITE);
sendBtn.setFocusPainted(false);
sendBtn.setContentAreaFilled(false);
sendBtn.setBorderPainted(false);
sendBtn.setOpaque(false);
sendBtn.setPreferredSize(new java.awt.Dimension(95, 52));
sendBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
sendBtn.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent e) {
        sendBtn.setBackground(new java.awt.Color(50, 130, 240)); sendBtn.repaint(); }
    public void mouseExited(java.awt.event.MouseEvent e) {
        sendBtn.setBackground(new java.awt.Color(30, 100, 200)); sendBtn.repaint(); }
});

    javax.swing.JPanel inputWrapper = new javax.swing.JPanel(new java.awt.BorderLayout(10, 0));
    inputWrapper.setBackground(ThemeManager.PANEL_BG);
    inputWrapper.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255, 40)),
        javax.swing.BorderFactory.createEmptyBorder(12, 24, 12, 24)
    ));
    inputWrapper.add(inputField, java.awt.BorderLayout.CENTER);
    inputWrapper.add(sendBtn, java.awt.BorderLayout.EAST);

    // ===== Assemble outer =====
   outer.add(root, java.awt.BorderLayout.CENTER);
outer.add(inputWrapper, java.awt.BorderLayout.SOUTH);
outer.setMinimumSize(new java.awt.Dimension(400, 400));
outer.setPreferredSize(new java.awt.Dimension(900, 600));

    // ===== Send Action =====
   Runnable sendAction = () -> {
    String query = inputField.getText().trim();
    if (query.isEmpty() || query.equals(placeholder)) return;
    addAIUserBubble(chatArea, query);
    chatArea.add(javax.swing.Box.createVerticalStrut(10));
    inputField.setText("");
    chatArea.revalidate();
    chatArea.repaint();
    javax.swing.SwingUtilities.invokeLater(() -> {
        String result = searchEmployeeForAI(query);
        addAIBotBubble(chatArea, result);
        chatArea.add(javax.swing.Box.createVerticalStrut(10));
        chatArea.revalidate();
        chatArea.repaint();
        javax.swing.JScrollBar bar = scrollPane.getVerticalScrollBar();
        bar.setValue(bar.getMaximum());
    });
};

sendBtn.addActionListener(e -> sendAction.run());
inputField.addActionListener(e -> sendAction.run());

// Force layout
outer.revalidate();
outer.repaint();

return outer;
}
private void addAIWelcomeBubble(javax.swing.JPanel chatArea) {
    javax.swing.JPanel row = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
    row.setOpaque(false);
    row.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
    row.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

    javax.swing.JLabel bubble = new javax.swing.JLabel(
        "<html><body style='width:300px; padding:2px; font-family:Segoe UI'>" +
        "<b style='font-size:14px'>👋 مرحباً!</b><br><br>" +
        "أنا مساعدك الذكي لنظام HR-Pro.<br>" +
        "اكتب <b>اسم الموظف</b> وسأعرض لك بياناته كاملة." +
        "</body></html>"
    ) {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new java.awt.Color(30, 100, 200, 40));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            g2.setColor(new java.awt.Color(30, 100, 200, 80));
            g2.setStroke(new java.awt.BasicStroke(1));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            g2.dispose();
            super.paintComponent(g);
        }
    };
    bubble.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
    bubble.setForeground(java.awt.Color.WHITE);
    bubble.setOpaque(false);
    bubble.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 18, 14, 18));

    row.add(bubble);
    chatArea.add(row);
}

private void addAIUserBubble(javax.swing.JPanel chatArea, String text) {
    javax.swing.JPanel row = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 0));
    row.setOpaque(false);
    row.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
    row.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

    javax.swing.JLabel bubble = new javax.swing.JLabel(
        "<html><body style='width:240px; padding:2px'>" + text + "</body></html>"
    ) {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new java.awt.Color(30, 100, 200));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            g2.dispose();
            super.paintComponent(g);
        }
    };
    bubble.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
    bubble.setForeground(java.awt.Color.WHITE);
    bubble.setOpaque(false);
    bubble.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));

    row.add(bubble);
    chatArea.add(row);
}

private void addAIBotBubble(javax.swing.JPanel chatArea, String htmlContent) {
    javax.swing.JPanel row = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
    row.setOpaque(false);
    row.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
    row.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

    javax.swing.JLabel bubble = new javax.swing.JLabel(
        "<html><body style='width:340px; padding:2px; font-family:Segoe UI'>" + htmlContent + "</body></html>"
    ) {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new java.awt.Color(255, 255, 255, 15));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            g2.setColor(new java.awt.Color(255, 255, 255, 35));
            g2.setStroke(new java.awt.BasicStroke(1));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            g2.dispose();
            super.paintComponent(g);
        }
    };
    bubble.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
    bubble.setForeground(java.awt.Color.WHITE);
    bubble.setOpaque(false);
    bubble.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));

    row.add(bubble);
    chatArea.add(row);
}

private String searchEmployeeForAI(String input) {
    input = input.toLowerCase().trim();
    try {
        java.sql.Connection con = jo.edu.bau.utils.DatabaseConnection.getConnection();

        // ===== list all =====
        if (input.contains("list") || input.contains("all") || 
            input.contains("show") || input.contains("كل") || 
            input.contains("اعرض")) {
            java.sql.ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM EMPLOYEE WHERE ROWNUM <= 50");
            java.sql.ResultSetMetaData meta = rs.getMetaData();
            StringBuilder sb = new StringBuilder();
            sb.append("📋 <b>All Employees</b><br><br>");
            sb.append("<table style='border-collapse:collapse;width:100%'>");
            sb.append("<tr>");
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                sb.append("<td style='color:#7eb8ff;font-weight:bold;padding:4px 8px;border-bottom:1px solid rgba(255,255,255,0.2)'>")
                  .append(meta.getColumnName(i)).append("</td>");
            }
            sb.append("</tr>");
            while (rs.next()) {
                sb.append("<tr>");
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    String val = rs.getString(i);
                    sb.append("<td style='color:white;padding:4px 8px;border-bottom:1px solid rgba(255,255,255,0.1)'>")
                      .append(val != null ? val : "-").append("</td>");
                }
                sb.append("</tr>");
            }
            sb.append("</table>");
            return sb.toString();
        }

        // ===== count =====
        if (input.contains("count") || input.contains("how many") || 
            input.contains("كم") || input.contains("عدد")) {
            java.sql.ResultSet rs = con.createStatement()
                .executeQuery("SELECT COUNT(*) FROM EMPLOYEE");
            rs.next();
            return "👥 Total Employees: <b>" + rs.getInt(1) + "</b>";
        }

        // ===== department =====
        if (input.contains("department") || input.contains("dept") || input.contains("قسم")) {
            java.sql.ResultSet rs = con.createStatement()
                .executeQuery("SELECT DEPARTMENT, COUNT(*) as CNT FROM EMPLOYEE GROUP BY DEPARTMENT");
            StringBuilder sb = new StringBuilder();
            sb.append("🏢 <b>Employees by Department</b><br><br>");
            sb.append("<table style='border-collapse:collapse'>");
            sb.append("<tr><td style='color:#7eb8ff;font-weight:bold;padding:4px 8px'>Department</td>")
              .append("<td style='color:#7eb8ff;font-weight:bold;padding:4px 8px'>Count</td></tr>");
            while (rs.next()) {
                sb.append("<tr>")
                  .append("<td style='color:white;padding:4px 8px'>").append(rs.getString(1)).append("</td>")
                  .append("<td style='color:white;padding:4px 8px'>").append(rs.getInt(2)).append("</td>")
                  .append("</tr>");
            }
            sb.append("</table>");
            return sb.toString();
        }

        // ===== salary =====
        if (input.contains("salary") || input.contains("راتب") || input.contains("رواتب")) {
            java.sql.ResultSet rs = con.createStatement()
                .executeQuery("SELECT FIRST_NAME, LAST_NAME, SALARY FROM EMPLOYEE ORDER BY SALARY DESC");
            StringBuilder sb = new StringBuilder();
            sb.append("💰 <b>Salary List</b><br><br>");
            sb.append("<table style='border-collapse:collapse'>");
            sb.append("<tr>")
              .append("<td style='color:#7eb8ff;font-weight:bold;padding:4px 8px'>Name</td>")
              .append("<td style='color:#7eb8ff;font-weight:bold;padding:4px 8px'>Salary</td>")
              .append("</tr>");
            while (rs.next()) {
                sb.append("<tr>")
                  .append("<td style='color:white;padding:4px 8px'>")
                  .append(rs.getString("FIRST_NAME")).append(" ").append(rs.getString("LAST_NAME"))
                  .append("</td>")
                  .append("<td style='color:#90ee90;padding:4px 8px'>")
                  .append(rs.getString("SALARY")).append(" JOD")
                  .append("</td>")
                  .append("</tr>");
            }
            sb.append("</table>");
            return sb.toString();
        }

        // ===== hi / hello =====
        if (input.equals("hi") || input.equals("hello") || 
            input.equals("مرحبا") || input.equals("هلا") || input.equals("hey")) {
            return "👋 Hello! I'm your HR Assistant.<br><br>" +
                   "You can ask me:<br>" +
                   "• <b>list employees</b> — show all employees<br>" +
                   "• <b>count</b> — total number of employees<br>" +
                   "• <b>department</b> — employees by department<br>" +
                   "• <b>salary</b> — salary list<br>" +
                   "• Or type any <b>employee name</b> to search";
        }

        // ===== Search by name =====
        String sql = "SELECT * FROM EMPLOYEE WHERE " +
                     "LOWER(FIRST_NAME) LIKE ? OR " +
                     "LOWER(LAST_NAME) LIKE ? OR " +
                     "LOWER(FIRST_NAME || ' ' || LAST_NAME) LIKE ?";
        java.sql.PreparedStatement ps = con.prepareStatement(sql);
        String search = "%" + input + "%";
        ps.setString(1, search);
        ps.setString(2, search);
        ps.setString(3, search);
        java.sql.ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            return "❌ No data found for: <b>" + input + "</b><br><br>" +
                   "Try: list, count, department, salary, or an employee name.";
        }

        java.sql.ResultSetMetaData meta = rs.getMetaData();
        StringBuilder sb = new StringBuilder();
        sb.append("✅ <b>Employee Found</b><br><br>");
        sb.append("<table style='border-collapse:collapse'>");
        do {
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                String val = rs.getString(i);
                sb.append("<tr>")
                  .append("<td style='color:#7eb8ff;font-weight:bold;padding:5px 12px 5px 0'>")
                  .append(meta.getColumnName(i)).append("</td>")
                  .append("<td style='color:white;padding:5px'>")
                  .append(val != null ? val : "-").append("</td>")
                  .append("</tr>");
            }
        } while (rs.next());
        sb.append("</table>");
        return sb.toString();

    } catch (Exception e) {
        e.printStackTrace();
        return "⚠️ Error: " + e.getMessage();
    }
}
private javax.swing.JPanel createReportPanel() {
    javax.swing.JPanel outer = new javax.swing.JPanel(new java.awt.BorderLayout());
    outer.setBackground(ThemeManager.PANEL_BG);

    // ===== Header =====
    javax.swing.JLabel title = new javax.swing.JLabel("Reports");
    title.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 26));
    title.setForeground(java.awt.Color.WHITE);
    title.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255, 30)),
        javax.swing.BorderFactory.createEmptyBorder(20, 28, 16, 28)
    ));
    outer.add(title, java.awt.BorderLayout.NORTH);

    // ===== Tabs =====
    javax.swing.JTabbedPane tabs = new javax.swing.JTabbedPane();
    tabs.setBackground(ThemeManager.PANEL_BG);
    tabs.setForeground(java.awt.Color.WHITE);
    tabs.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));

    // ===== Tab 1: Employees =====
    javax.swing.JPanel empPanel = new javax.swing.JPanel(new java.awt.BorderLayout());
    empPanel.setBackground(ThemeManager.PANEL_BG);
    javax.swing.JTable empTable = new javax.swing.JTable();
    javax.swing.JScrollPane empScroll = new javax.swing.JScrollPane(empTable);
    empScroll.setBorder(null);
    empPanel.add(empScroll, java.awt.BorderLayout.CENTER);

    // Print button
    javax.swing.JButton btnPrintEmp = new javax.swing.JButton("🖨 Print");
    btnPrintEmp.setBackground(new java.awt.Color(30, 100, 200));
    btnPrintEmp.setForeground(java.awt.Color.WHITE);
    btnPrintEmp.setFocusPainted(false);
    btnPrintEmp.setBorderPainted(false);
    btnPrintEmp.setOpaque(true);
    javax.swing.JPanel empBtnPanel = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
    empBtnPanel.setBackground(ThemeManager.PANEL_BG);
    empBtnPanel.add(btnPrintEmp);
    empPanel.add(empBtnPanel, java.awt.BorderLayout.SOUTH);

    try {
        java.sql.ResultSet rs = jo.edu.bau.utils.DatabaseConnection.getConnection()
            .createStatement().executeQuery("SELECT * FROM EMPLOYEE");
        empTable.setModel(javax.swing.table.DefaultTableModel.class.cast(
            buildTableModel(rs)));
    } catch (Exception e) { e.printStackTrace(); }

    btnPrintEmp.addActionListener(e -> printTable(empTable, "Employees Report"));

    // ===== Tab 2: Payroll =====
    javax.swing.JPanel payPanel = new javax.swing.JPanel(new java.awt.BorderLayout());
    payPanel.setBackground(ThemeManager.PANEL_BG);
    javax.swing.JTable payTable = new javax.swing.JTable();
    javax.swing.JScrollPane payScroll = new javax.swing.JScrollPane(payTable);
    payScroll.setBorder(null);
    payPanel.add(payScroll, java.awt.BorderLayout.CENTER);

    javax.swing.JButton btnPrintPay = new javax.swing.JButton("🖨 Print");
    btnPrintPay.setBackground(new java.awt.Color(30, 100, 200));
    btnPrintPay.setForeground(java.awt.Color.WHITE);
    btnPrintPay.setFocusPainted(false);
    btnPrintPay.setBorderPainted(false);
    btnPrintPay.setOpaque(true);
    javax.swing.JPanel payBtnPanel = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
    payBtnPanel.setBackground(ThemeManager.PANEL_BG);
    payBtnPanel.add(btnPrintPay);
    payPanel.add(payBtnPanel, java.awt.BorderLayout.SOUTH);

    try {
        java.sql.ResultSet rs = jo.edu.bau.utils.DatabaseConnection.getConnection()
            .createStatement().executeQuery("SELECT * FROM PAYROLL");
        payTable.setModel(javax.swing.table.DefaultTableModel.class.cast(
            buildTableModel(rs)));
    } catch (Exception e) { e.printStackTrace(); }

    btnPrintPay.addActionListener(e -> printTable(payTable, "Payroll Report"));

    // ===== Tab 3: Attendance =====
    javax.swing.JPanel attPanel = new javax.swing.JPanel(new java.awt.BorderLayout());
    attPanel.setBackground(ThemeManager.PANEL_BG);
    javax.swing.JTable attTable = new javax.swing.JTable();
    javax.swing.JScrollPane attScroll = new javax.swing.JScrollPane(attTable);
    attScroll.setBorder(null);
    attPanel.add(attScroll, java.awt.BorderLayout.CENTER);

    javax.swing.JButton btnPrintAtt = new javax.swing.JButton("🖨 Print");
    btnPrintAtt.setBackground(new java.awt.Color(30, 100, 200));
    btnPrintAtt.setForeground(java.awt.Color.WHITE);
    btnPrintAtt.setFocusPainted(false);
    btnPrintAtt.setBorderPainted(false);
    btnPrintAtt.setOpaque(true);
    javax.swing.JPanel attBtnPanel = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
    attBtnPanel.setBackground(ThemeManager.PANEL_BG);
    attBtnPanel.add(btnPrintAtt);
    attPanel.add(attBtnPanel, java.awt.BorderLayout.SOUTH);

    try {
        java.sql.ResultSet rs = jo.edu.bau.utils.DatabaseConnection.getConnection()
            .createStatement().executeQuery("SELECT * FROM ATTENDANCE_LEAVE");
        attTable.setModel(javax.swing.table.DefaultTableModel.class.cast(
            buildTableModel(rs)));
    } catch (Exception e) { e.printStackTrace(); }

    btnPrintAtt.addActionListener(e -> printTable(attTable, "Attendance Report"));

    tabs.addTab("👥 Employees", empPanel);
    tabs.addTab("💰 Payroll", payPanel);
    tabs.addTab("📅 Attendance", attPanel);

    outer.add(tabs, java.awt.BorderLayout.CENTER);
    return outer;
}

private javax.swing.table.DefaultTableModel buildTableModel(java.sql.ResultSet rs) throws Exception {
    java.sql.ResultSetMetaData meta = rs.getMetaData();
    int cols = meta.getColumnCount();
    String[] colNames = new String[cols];
    for (int i = 1; i <= cols; i++) colNames[i - 1] = meta.getColumnName(i);
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(colNames, 0);
    while (rs.next()) {
        Object[] row = new Object[cols];
        for (int i = 1; i <= cols; i++) row[i - 1] = rs.getObject(i);
        model.addRow(row);
    }
    return model;
}

private void printTable(javax.swing.JTable table, String reportTitle) {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    fileChooser.setDialogTitle("Save PDF");
    fileChooser.setSelectedFile(new java.io.File(reportTitle + ".pdf"));
    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PDF Files", "pdf"));

    if (fileChooser.showSaveDialog(null) != javax.swing.JFileChooser.APPROVE_OPTION) return;

    java.io.File file = fileChooser.getSelectedFile();
    if (!file.getName().endsWith(".pdf")) file = new java.io.File(file.getAbsolutePath() + ".pdf");

    try {
        com.itextpdf.text.Document document = new com.itextpdf.text.Document(com.itextpdf.text.PageSize.A4.rotate());
        com.itextpdf.text.pdf.PdfWriter.getInstance(document, new java.io.FileOutputStream(file));
        document.open();

        // Title
        com.itextpdf.text.Font titleFont = new com.itextpdf.text.Font(
            com.itextpdf.text.Font.FontFamily.HELVETICA, 16, com.itextpdf.text.Font.BOLD);
        com.itextpdf.text.Paragraph title = new com.itextpdf.text.Paragraph(reportTitle, titleFont);
        title.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
        title.setSpacingAfter(20);
        document.add(title);

        // Table
        int cols = table.getColumnCount();
        com.itextpdf.text.pdf.PdfPTable pdfTable = new com.itextpdf.text.pdf.PdfPTable(cols);
        pdfTable.setWidthPercentage(100);

        // Headers
        com.itextpdf.text.Font headerFont = new com.itextpdf.text.Font(
            com.itextpdf.text.Font.FontFamily.HELVETICA, 10, com.itextpdf.text.Font.BOLD,
            com.itextpdf.text.BaseColor.WHITE);
        for (int i = 0; i < cols; i++) {
            com.itextpdf.text.pdf.PdfPCell cell = new com.itextpdf.text.pdf.PdfPCell(
                new com.itextpdf.text.Phrase(table.getColumnName(i), headerFont));
            cell.setBackgroundColor(new com.itextpdf.text.BaseColor(30, 100, 200));
            cell.setPadding(6);
            cell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            pdfTable.addCell(cell);
        }

        // Rows
        com.itextpdf.text.Font rowFont = new com.itextpdf.text.Font(
            com.itextpdf.text.Font.FontFamily.HELVETICA, 9);
        for (int r = 0; r < table.getRowCount(); r++) {
            com.itextpdf.text.BaseColor rowColor = (r % 2 == 0)
                ? new com.itextpdf.text.BaseColor(240, 245, 255)
                : com.itextpdf.text.BaseColor.WHITE;
            for (int c = 0; c < cols; c++) {
                Object val = table.getValueAt(r, c);
                com.itextpdf.text.pdf.PdfPCell cell = new com.itextpdf.text.pdf.PdfPCell(
                    new com.itextpdf.text.Phrase(val != null ? val.toString() : "", rowFont));
                cell.setBackgroundColor(rowColor);
                cell.setPadding(5);
                pdfTable.addCell(cell);
            }
        }

        document.add(pdfTable);
        document.close();

        javax.swing.JOptionPane.showMessageDialog(null, "PDF saved successfully ✔\n" + file.getAbsolutePath());

    } catch (Exception ex) {
        ex.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }

}
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

   
    public static void main(String args[]) {
    jo.edu.bau.settings.ThemeManager.apply();
    java.awt.EventQueue.invokeLater(() -> new Dashboard().setVisible(true));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
private jo.edu.bau.emp.Employees empPanel;
public jo.edu.bau.attendance.Attendance attPanel;
public jo.edu.bau.pay.Payroll payPanel;
private javax.swing.JPanel cardsContainer;
  public void refreshTheme() {
    // Sidebar
    jPanel1.setBackground(ThemeManager.SIDEBAR);
    jPanel3.setBackground(ThemeManager.SIDEBAR);
    
    // كل الـ labels بالـ sidebar
    jLabel1.setForeground(ThemeManager.TEXT);
    jLabel2.setForeground(ThemeManager.TEXT);
    jLabel3.setForeground(ThemeManager.TEXT);
    jLabel4.setForeground(ThemeManager.TEXT);
    jLabel5.setForeground(ThemeManager.TEXT);
    jLabel6.setForeground(ThemeManager.TEXT);
    jLabel7.setForeground(ThemeManager.TEXT);
    jLabel8.setForeground(ThemeManager.TEXT);

    // كل الشاشات
    if (empPanel != null) ThemeManager.applyToContainer(empPanel);
    if (attPanel != null) ThemeManager.applyToContainer(attPanel);
    if (payPanel != null) ThemeManager.applyToContainer(payPanel);

    // Dashboard, AIChat, Report, Settings
  for (java.awt.Component comp : jPanel4.getComponents()) {
    if (comp instanceof java.awt.Container) {
        ThemeManager.applyToContainer((java.awt.Container) comp);
    }
}

    jPanel1.revalidate(); jPanel1.repaint();
    jPanel3.revalidate(); jPanel3.repaint();
    jPanel4.revalidate(); jPanel4.repaint();
}

}
