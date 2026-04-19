package jo.edu.bau;

import jo.edu.bau.settings.ThemeManager;
import jo.edu.bau.settings.Settings;
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
    jPanel4.setLayout(new java.awt.CardLayout());
jPanel4.setLayout(new java.awt.CardLayout());

    jPanel4.add(createDashboardHome(), "Dashboard");

    Employees emp = new Employees();
    jPanel4.add(emp, "Employees");
    
    Attendance att = new Attendance();
    jPanel4.add(att, "Attendance");
    
    Payroll pay = new Payroll();
    jPanel4.add(pay, "Payroll");
    
    Settings set = new Settings();
    jPanel4.add(set, "Settings");
    
    jPanel4.add(createPlaceholder("AI Chat - Coming Soon"), "AIChat");
    jPanel4.add(createPlaceholder("Report - Coming Soon"),  "Report");
    
    java.awt.CardLayout cl = (java.awt.CardLayout) jPanel4.getLayout();
cl.show(jPanel4, "Dashboard");
}

public void showCard(String name) {
    java.awt.CardLayout cl = (java.awt.CardLayout) jPanel4.getLayout();
    cl.show(jPanel4, name);
}
public void refreshDashboard() {
    jPanel4.remove(jPanel4.getComponent(0));
    jPanel4.add(createDashboardHome(), "Dashboard", 0);
    jPanel4.revalidate();
    jPanel4.repaint();
}

private javax.swing.JPanel createDashboardHome() {
    javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.BorderLayout());
    panel.setBackground(java.awt.Color.WHITE);

    // ===== Header =====
    javax.swing.JLabel header = new javax.swing.JLabel("Hr-Pro / Dashboard");
    header.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
    header.setForeground(new java.awt.Color(91, 33, 182));
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
    p.setBackground(java.awt.Color.WHITE);
    p.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200), 1, true),
        javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)
    ));

    javax.swing.JLabel title = new javax.swing.JLabel("Employees by Department");
    title.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
    title.setForeground(new java.awt.Color(46, 16, 101));
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
                g2.setColor(new java.awt.Color(160, 160, 160));
                g2.drawString(String.valueOf(i * 25), 2, y + 4);
                g2.setColor(new java.awt.Color(230, 230, 230));
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


    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
        jo.edu.bau.settings.ThemeManager.apply();

    java.awt.EventQueue.invokeLater(() -> {
        new Dashboard().setVisible(true);
    });
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

    public void refreshTheme() {
    }
}
