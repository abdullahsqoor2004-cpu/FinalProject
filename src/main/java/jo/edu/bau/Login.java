package jo.edu.bau;

import jo.edu.bau.utils.DatabaseConnection;


public class Login extends java.awt.Frame {
java.awt.Font BIG   = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22);
    java.awt.Font SMALL = new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18);

java.awt.Color PRIMARY    = new java.awt.Color(30, 100, 200);
java.awt.Color SECONDARY  = new java.awt.Color(100, 160, 255);
java.awt.Color BG_DARK    = new java.awt.Color(10, 40, 100);
java.awt.Color CARD_BG    = new java.awt.Color(20, 60, 140);
java.awt.Color TEXT_LIGHT = new java.awt.Color(255, 255, 255);
java.awt.Color GRAY_TEXT  = new java.awt.Color(180, 200, 255);

    public Login() {
        initComponents();
    setSize(600, 450);
  setLocationRelativeTo(null);

        jPanel1.setBackground(BG_DARK);
        jPanel2.setBackground(CARD_BG);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(SECONDARY, 1));

        // Tab: Login (active by default)
        jLabel1.setForeground(TEXT_LIGHT);
        jLabel1.setFont(BIG);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) { switchToLogin(); }
        });

        // Tab: SignUp (inactive by default)
        jLabel2.setForeground(new java.awt.Color(180, 180, 180));
        jLabel2.setFont(SMALL);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) { switchToSignUp(); }
            public void mouseEntered(java.awt.event.MouseEvent e) { jLabel2.setForeground(TEXT_LIGHT); }
            public void mouseExited(java.awt.event.MouseEvent e) {
                if (jLabel1.getFont().getSize() == 22)
                    jLabel2.setForeground(new java.awt.Color(180, 180, 180));
            }
        });

        jLabel3.setForeground(TEXT_LIGHT);
        jLabel4.setForeground(TEXT_LIGHT);

        styleField(jTextField1, "Enter username");
        stylePasswordField(jPasswordField1, "Enter password");

        styleBtn(jButton1, PRIMARY);
        styleBtn(jButton2, SECONDARY);
    }

    // ── Helper: style text field with placeholder ────────────
    private void styleField(javax.swing.JTextField field, String placeholder) {
        field.setText(placeholder);
        field.setForeground(GRAY_TEXT);
        field.setBackground(CARD_BG);
        field.setCaretColor(TEXT_LIGHT);
        field.setBorder(normalBorder());
        field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(TEXT_LIGHT);
                }
                field.setBorder(focusBorder());
            }
            public void focusLost(java.awt.event.FocusEvent e) {
                if (field.getText().trim().isEmpty()) {
                    field.setText(placeholder);
                    field.setForeground(GRAY_TEXT);
                }
                field.setBorder(normalBorder());
            }
        });
    }

    // ── Helper: style password field with placeholder ────────
    private void stylePasswordField(javax.swing.JPasswordField field, String placeholder) {
        field.setEchoChar((char) 0);
        field.setText(placeholder);
        field.setForeground(GRAY_TEXT);
        field.setBackground(CARD_BG);
        field.setCaretColor(TEXT_LIGHT);
        field.setBorder(normalBorder());
        field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent e) {
                if (new String(field.getPassword()).equals(placeholder)) {
                    field.setText("");
                    field.setForeground(TEXT_LIGHT);
                    field.setEchoChar('•');
                }
                field.setBorder(focusBorder());
            }
            public void focusLost(java.awt.event.FocusEvent e) {
                if (new String(field.getPassword()).trim().isEmpty()) {
                    field.setEchoChar((char) 0);
                    field.setText(placeholder);
                    field.setForeground(GRAY_TEXT);
                }
                field.setBorder(normalBorder());
            }
        });
    }

    private javax.swing.border.Border normalBorder() {
        return javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(SECONDARY, 1),
            javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
    }

    private javax.swing.border.Border focusBorder() {
        return javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 179, 255), 2),
            javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
    }

    private javax.swing.border.Border errorBorder() {
        return javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED, 2),
            javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
    }

    private void styleBtn(javax.swing.JButton btn, java.awt.Color bg) {
        btn.setBackground(bg);
        btn.setForeground(TEXT_LIGHT);
        btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 20, 8, 20));
    }

    private javax.swing.JLabel makeLabel(String text) {
        javax.swing.JLabel lbl = new javax.swing.JLabel(text);
        lbl.setForeground(TEXT_LIGHT);
        lbl.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        return lbl;
    }

    // ── Switch to Login tab ──────────────────────────────────
    public void switchToLogin() {
        jLabel1.setFont(BIG);
        jLabel1.setForeground(TEXT_LIGHT);
        jLabel2.setFont(SMALL);
        jLabel2.setForeground(new java.awt.Color(180, 180, 180));
        showLoginFields();
        setSize(600, 450);
        setLocationRelativeTo(null);
    }

    // ── Switch to SignUp tab ─────────────────────────────────
    private void switchToSignUp() {
        jLabel2.setFont(BIG);
        jLabel2.setForeground(TEXT_LIGHT);
        jLabel1.setFont(SMALL);
        jLabel1.setForeground(new java.awt.Color(180, 180, 180));
        showSignUpFields();
        setSize(600, 570);
        setLocationRelativeTo(null);
    }

    // ── Rebuild jPanel2 with Login fields ───────────────────
    private void showLoginFields() {
        jPanel2.removeAll();
        jPanel2.setLayout(new java.awt.GridBagLayout());

        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1; gbc.gridx = 0;

        // Reset placeholders
        jTextField1.setText("Enter username");   jTextField1.setForeground(GRAY_TEXT);
        jPasswordField1.setEchoChar((char) 0);
        jPasswordField1.setText("Enter password"); jPasswordField1.setForeground(GRAY_TEXT);

        gbc.gridy = 0; gbc.insets = new java.awt.Insets(16, 30, 2, 30);
        jPanel2.add(makeLabel("Username"), gbc);
        gbc.gridy = 1; gbc.insets = new java.awt.Insets(0, 30, 12, 30);
        jPanel2.add(jTextField1, gbc);

        gbc.gridy = 2; gbc.insets = new java.awt.Insets(8, 30, 2, 30);
        jPanel2.add(makeLabel("Password"), gbc);
       gbc.gridy = 3; gbc.insets = new java.awt.Insets(0, 30, 16, 30);
jPanel2.add(makePasswordPanel(jPasswordField1), gbc);
        javax.swing.JPanel row = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));
        row.setBackground(CARD_BG);
        row.add(jButton2); row.add(jButton1);
        gbc.gridy = 4; gbc.insets = new java.awt.Insets(0, 30, 20, 30);
        jPanel2.add(row, gbc);

        jPanel2.revalidate(); jPanel2.repaint();
    }

    private javax.swing.JPanel makePasswordPanel(javax.swing.JPasswordField field) {
    javax.swing.JPanel p = new javax.swing.JPanel(new java.awt.BorderLayout());
    p.setBackground(new java.awt.Color(20, 60, 140));
    
    javax.swing.JButton eye = new javax.swing.JButton("👁");
    eye.setBackground(new java.awt.Color(20, 60, 140));
    eye.setForeground(TEXT_LIGHT);
    eye.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
    eye.setFocusPainted(false);
    eye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    
    eye.addActionListener(e -> {
        if (field.getEchoChar() == '•') {
            field.setEchoChar((char) 0);
            eye.setText("🙈");
        } else {
            field.setEchoChar('•');
            eye.setText("👁");
        }
    });
    
    p.add(field, java.awt.BorderLayout.CENTER);
    p.add(eye, java.awt.BorderLayout.EAST);
    p.setBorder(field.getBorder());
    field.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    
    return p;
}
    // ── Rebuild jPanel2 with SignUp fields ───────────────────
    private void showSignUpFields() {
        jPanel2.removeAll();
        jPanel2.setLayout(new java.awt.GridBagLayout());

        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1; gbc.gridx = 0;

        javax.swing.JTextField    txtUser    = new javax.swing.JTextField();
        javax.swing.JTextField    txtEmail   = new javax.swing.JTextField();
        javax.swing.JPasswordField txtPass   = new javax.swing.JPasswordField();
        javax.swing.JPasswordField txtConfirm= new javax.swing.JPasswordField();

        styleField(txtUser,  "Enter username");
        styleField(txtEmail, "Enter email");
        // Tooltip على الـ email
txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent e) {
        javax.swing.ToolTipManager.sharedInstance().setInitialDelay(0);
        if (!txtEmail.getText().contains("@") && 
            !txtEmail.getText().equals("Enter email")) {
            txtEmail.setToolTipText("⚠ Email must contain '@'");
        } else {
            txtEmail.setToolTipText("Format: example@domain.com");
        }
    }
});
        stylePasswordField(txtPass,    "Enter password");
txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent e) {
        javax.swing.ToolTipManager.sharedInstance().setInitialDelay(0);
        txtPass.setToolTipText("Min 8 chars, 1 capital, 1 number, 1 symbol (!@#$%)");
    }
});
        stylePasswordField(txtConfirm, "Confirm password");
txtConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyReleased(java.awt.event.KeyEvent e) {
        String p = new String(txtPass.getPassword());
        String c = new String(txtConfirm.getPassword());
        if (!c.isEmpty() && !p.equals(c)) {
            txtConfirm.setBorder(errorBorder());
            txtConfirm.setBackground(new java.awt.Color(80, 20, 20));
            txtConfirm.setForeground(new java.awt.Color(255, 100, 100));
            txtConfirm.setToolTipText("⚠ Passwords do not match!");
        } else {
            txtConfirm.setBorder(normalBorder());
            txtConfirm.setBackground(CARD_BG);
            txtConfirm.setForeground(TEXT_LIGHT);
            txtConfirm.setToolTipText(null);
        }
    }
});

        gbc.gridy = 0; gbc.insets = new java.awt.Insets(14, 30, 2, 30);
        jPanel2.add(makeLabel("Username"), gbc);
        gbc.gridy = 1; gbc.insets = new java.awt.Insets(0, 30, 8, 30);
        jPanel2.add(txtUser, gbc);

        gbc.gridy = 2; gbc.insets = new java.awt.Insets(6, 30, 2, 30);
        jPanel2.add(makeLabel("Email"), gbc);
        gbc.gridy = 3; gbc.insets = new java.awt.Insets(0, 30, 8, 30);
        jPanel2.add(txtEmail, gbc);

        gbc.gridy = 4; gbc.insets = new java.awt.Insets(6, 30, 2, 30);
        jPanel2.add(makeLabel("Password"), gbc);
       gbc.gridy = 5; gbc.insets = new java.awt.Insets(0, 30, 8, 30);
jPanel2.add(makePasswordPanel(txtPass), gbc);


        gbc.gridy = 6; gbc.insets = new java.awt.Insets(6, 30, 2, 30);
        jPanel2.add(makeLabel("Confirm Password"), gbc);
       gbc.gridy = 7; gbc.insets = new java.awt.Insets(0, 30, 14, 30);
jPanel2.add(makePasswordPanel(txtConfirm), gbc);

        javax.swing.JButton btnClear  = new javax.swing.JButton("Clear");
        javax.swing.JButton btnSignUp = new javax.swing.JButton("SignUp");
        styleBtn(btnClear,  SECONDARY);
        styleBtn(btnSignUp, PRIMARY);

        // Clear
        btnClear.addActionListener(e -> {
            txtUser.setText("Enter username");      txtUser.setForeground(GRAY_TEXT);
            txtEmail.setText("Enter email");        txtEmail.setForeground(GRAY_TEXT);
            txtPass.setEchoChar((char) 0);
            txtPass.setText("Enter password");      txtPass.setForeground(GRAY_TEXT);
            txtConfirm.setEchoChar((char) 0);
            txtConfirm.setText("Confirm password"); txtConfirm.setForeground(GRAY_TEXT);
            txtConfirm.setBorder(normalBorder());
        });

        // SignUp → validate + save
        btnSignUp.addActionListener(e -> {
            String user    = txtUser.getText().trim();
            String email   = txtEmail.getText().trim();
            String pass    = new String(txtPass.getPassword()).trim();
            String confirm = new String(txtConfirm.getPassword()).trim();

            if (user.equals("Enter username"))       user    = "";
            if (email.equals("Enter email"))         email   = "";
            if (pass.equals("Enter password"))       pass    = "";
            if (confirm.equals("Confirm password"))  confirm = "";

            // 1) Empty check
            if (user.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Please fill all fields", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
            
         if (!email.contains("@")) {
    txtEmail.setBorder(errorBorder());
    txtEmail.setBackground(new java.awt.Color(80, 20, 20));
    txtEmail.setForeground(new java.awt.Color(255, 100, 100));
    txtEmail.setToolTipText("⚠ Email must contain '@'");
    // أظهر الـ tooltip تلقائياً
    javax.swing.ToolTipManager.sharedInstance().setInitialDelay(0);
    javax.swing.ToolTipManager.sharedInstance().mouseMoved(
        new java.awt.event.MouseEvent(txtEmail, 0, 0, 0,
            txtEmail.getWidth()/2, txtEmail.getHeight()/2, 0, false));
    return;
}
txtEmail.setBorder(normalBorder());
txtEmail.setBackground(CARD_BG);
txtEmail.setForeground(TEXT_LIGHT);
txtEmail.setToolTipText(null);

            // 2) Password match check
          if (!pass.equals(confirm)) {
    txtConfirm.setBorder(errorBorder());
    txtConfirm.setBackground(new java.awt.Color(80, 20, 20));
    txtConfirm.setForeground(new java.awt.Color(255, 100, 100));
    txtConfirm.setToolTipText("⚠ Passwords do not match!");
    return;
}
txtConfirm.setBorder(normalBorder());
txtConfirm.setBackground(CARD_BG);
txtConfirm.setForeground(TEXT_LIGHT);
txtConfirm.setToolTipText(null);

            // 3) Save to DB
            try {
                String sql = "INSERT INTO USERS (USERNAME, EMAIL, PASSWORD) VALUES (?, ?, ?)";
                java.sql.PreparedStatement ps =
                    DatabaseConnection.getConnection().prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, email);
                ps.setString(3, pass);
                ps.executeUpdate();

                javax.swing.JOptionPane.showMessageDialog(this,
                    "Account created successfully!", "Success",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
                switchToLogin();
            } catch (Exception ex) {
                ex.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "Database Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        });

        javax.swing.JPanel row = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));
        row.setBackground(CARD_BG);
        row.add(btnClear); row.add(btnSignUp);
        gbc.gridy = 8; gbc.insets = new java.awt.Insets(0, 30, 18, 30);
        jPanel2.add(row, gbc);

        jPanel2.revalidate(); jPanel2.repaint();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("   Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("    SignUp");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Username");

        jTextField1.setText("jTextField1");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password");

        jPasswordField1.setText("jPasswordField1");

        jButton1.setText("Login");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Clear");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("Enter username");    jTextField1.setForeground(GRAY_TEXT);
        jPasswordField1.setEchoChar((char) 0);
        jPasswordField1.setText("Enter password"); jPasswordField1.setForeground(GRAY_TEXT);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String username = jTextField1.getText().trim();
    String password = new String(jPasswordField1.getPassword()).trim();
    if (username.equals("Enter username")) username = "";
    if (password.equals("Enter password")) password = "";

    if (username.isEmpty() || password.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Please fill all fields", "Validation",
            javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    try {
        String sql = "SELECT COUNT(*) FROM USERS WHERE USERNAME = ? AND PASSWORD = ?";
        java.sql.PreparedStatement ps =
            DatabaseConnection.getConnection().prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        java.sql.ResultSet rs = ps.executeQuery();
        rs.next();
        if (rs.getInt(1) > 0) {
            Dashboard dsh = new Dashboard();
            dsh.setVisible(true);
            this.setVisible(false);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Invalid username or password", "Login Failed",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
    }

    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            DatabaseConnection.getConnection();
 Login login = new Login();
            login.switchToLogin(); // ← أضف هاد
            login.setVisible(true);        }
    });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
