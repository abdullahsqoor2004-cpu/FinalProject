package jo.edu.bau;

import jo.edu.bau.utils.DatabaseConnection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Login extends java.awt.Frame {

    /**
     * Creates new form SigninLogin
     */
    public Login() {
        initComponents();
    setSize(600, 450);
    setLocationRelativeTo(null);
    
 // ألوان HR-Pro الرسمية
java.awt.Color PRIMARY    = new java.awt.Color(91, 33, 182);   // بنفسجي أساسي #5B21B6
java.awt.Color SECONDARY  = new java.awt.Color(167, 139, 250); // بنفسجي فاتح #A78BFA
java.awt.Color ACCENT     = new java.awt.Color(124, 58, 237);  // بنفسجي متوسط #7C3AED
java.awt.Color BG_LIGHT   = new java.awt.Color(245, 243, 255); // أبيض فاتح #F5F3FF
java.awt.Color BG_DARK    = new java.awt.Color(46, 16, 101);   // بنفسجي داكن #2E1065
java.awt.Color TEXT_LIGHT = new java.awt.Color(255, 255, 255); // أبيض
java.awt.Color TEXT_DARK  = new java.awt.Color(17, 24, 39);    // رمادي داكن

  // خلفية الشاشة
jPanel1.setBackground(BG_DARK);                     // الخلفية الرئيسية داكنة
jPanel2.setBackground(new java.awt.Color(57, 40, 107)); // بانل بنفسجي غامق متوسط
jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(SECONDARY, 1)); // حدود بنفسجي فاتح

  // Labels العلوية
jLabel1.setForeground(TEXT_LIGHT);                  // "Login" أبيض
jLabel2.setForeground(new java.awt.Color(224,224,224)); // "SignUp" رمادي فاتح
jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

// Labels الحقول
jLabel3.setForeground(TEXT_LIGHT); // "Username"
jLabel4.setForeground(TEXT_LIGHT); // "Password"

   

  // Placeholder username
jTextField1.setText("Enter username");
jTextField1.setForeground(java.awt.Color.GRAY);
jTextField1.setBackground(new java.awt.Color(57, 40, 107));
jTextField1.setCaretColor(TEXT_LIGHT);
jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createLineBorder(SECONDARY, 1),
        javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)
));
jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent e) {
        if (jTextField1.getText().equals("Enter username")) {
            jTextField1.setText("");
            jTextField1.setForeground(TEXT_LIGHT);
        }
    }
    public void focusLost(java.awt.event.FocusEvent e) {
        if (jTextField1.getText().trim().isEmpty()) {
            jTextField1.setText("Enter username");
            jTextField1.setForeground(java.awt.Color.GRAY);
        }
    }
});
    jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent e) {
            if (jTextField1.getText().equals("Enter username")) {
                jTextField1.setText("");
                jTextField1.setForeground(java.awt.Color.WHITE);
            }
        }
        public void focusLost(java.awt.event.FocusEvent e) {
            if (jTextField1.getText().trim().isEmpty()) {
                jTextField1.setText("Enter username");
                jTextField1.setForeground(java.awt.Color.GRAY);
            }
        }
    });

  // Placeholder password
jPasswordField1.setEchoChar((char) 0);
jPasswordField1.setText("Enter password");
jPasswordField1.setForeground(java.awt.Color.GRAY);
jPasswordField1.setBackground(new java.awt.Color(57, 40, 107));
jPasswordField1.setCaretColor(TEXT_LIGHT);
jPasswordField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createLineBorder(SECONDARY, 1),
        javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)
));
jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent e) {
        if (new String(jPasswordField1.getPassword()).equals("Enter password")) {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(TEXT_LIGHT);
            jPasswordField1.setEchoChar('•');
        }
    }
    public void focusLost(java.awt.event.FocusEvent e) {
        if (new String(jPasswordField1.getPassword()).trim().isEmpty()) {
            jPasswordField1.setEchoChar((char) 0);
            jPasswordField1.setText("Enter password");
            jPasswordField1.setForeground(java.awt.Color.GRAY);
        }
    }
});
    jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent e) {
            if (new String(jPasswordField1.getPassword()).equals("Enter password")) {
                jPasswordField1.setText("");
                jPasswordField1.setForeground(java.awt.Color.WHITE);
                jPasswordField1.setEchoChar('•');
            }
        }
        public void focusLost(java.awt.event.FocusEvent e) {
            if (new String(jPasswordField1.getPassword()).trim().isEmpty()) {
                jPasswordField1.setEchoChar((char) 0);
                jPasswordField1.setText("Enter password");
                jPasswordField1.setForeground(java.awt.Color.GRAY);
            }
        }
    });

    // لما تضغط SignUp
   jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent e) {
        jLabel2.setForeground(TEXT_LIGHT);
    }
    public void mouseExited(java.awt.event.MouseEvent e) {
        jLabel2.setForeground(new java.awt.Color(224,224,224));
    }
});
    // تصميم زر Login
// زر Login
jButton1.setBackground(PRIMARY);
jButton1.setForeground(TEXT_LIGHT);
jButton1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
jButton1.setFocusPainted(false);
jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 20, 8, 20));

// زر Clear
jButton2.setBackground(SECONDARY);
jButton2.setForeground(TEXT_LIGHT);
jButton2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
jButton2.setFocusPainted(false);
jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 20, 8, 20));
    }
    

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
        java.sql.PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        java.sql.ResultSet rs = ps.executeQuery();
        rs.next();
        if (rs.getInt(1) > 0) {
            Dashboard dsh = new Dashboard();
            dsh.show();
            dispose();
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    jTextField1.setText("Enter username");
    jTextField1.setForeground(java.awt.Color.GRAY);
    jPasswordField1.setEchoChar((char) 0);
    jPasswordField1.setText("Enter password");
    jPasswordField1.setForeground(java.awt.Color.GRAY);

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            DatabaseConnection.getConnection(); // ✅ اتصل مسبقاً
            new Login().setVisible(true);
        }
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
