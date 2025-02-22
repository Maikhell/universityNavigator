/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.main;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Login_Page extends javax.swing.JFrame {

    public Login_Page() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/cvsuSLogo.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        innerPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        loginLbl = new javax.swing.JLabel();
        homeLbl = new javax.swing.JLabel();
        createAccLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        usernameLbl1 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        loginImage = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        innerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        innerPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 110, 40));

        passwordField.setBackground(new java.awt.Color(240, 240, 215));
        passwordField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
        passwordField.setCaretColor(new java.awt.Color(0, 0, 0));
        passwordField.setSelectionColor(new java.awt.Color(75, 153, 96));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        innerPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 300, 30));

        usernameField.setBackground(new java.awt.Color(240, 240, 215));
        usernameField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        usernameField.setForeground(new java.awt.Color(0, 0, 0));
        usernameField.setCaretColor(new java.awt.Color(0, 0, 0));
        usernameField.setName(""); // NOI18N
        usernameField.setSelectionColor(new java.awt.Color(75, 153, 96));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        innerPanel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 300, 30));

        loginLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(0, 153, 51));
        loginLbl.setText("Login");
        innerPanel.add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 40, 40));

        homeLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        homeLbl.setForeground(new java.awt.Color(255, 255, 255));
        homeLbl.setText("Home >");
        homeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLblMouseClicked(evt);
            }
        });
        innerPanel.add(homeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 40));

        createAccLbl.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        createAccLbl.setForeground(new java.awt.Color(51, 204, 0));
        createAccLbl.setText("Create an Account");
        createAccLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccLblMouseClicked(evt);
            }
        });
        innerPanel.add(createAccLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, 30));

        passwordLbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(0, 0, 0));
        passwordLbl.setText("Password ");
        innerPanel.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 110, -1));

        usernameLbl1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        usernameLbl1.setForeground(new java.awt.Color(0, 0, 0));
        usernameLbl1.setText("Username");
        innerPanel.add(usernameLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 110, -1));

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setText("Login");
        innerPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        loginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        innerPanel.add(loginImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 460));

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });
        innerPanel.add(exitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed

    }//GEN-LAST:event_usernameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed

    }//GEN-LAST:event_passwordFieldActionPerformed

    private void createAccLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccLblMouseClicked
        FrameSwitch.showSignPage(this);
    }//GEN-LAST:event_createAccLblMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        Exit_Dialog dialog = new Exit_Dialog(this);
        if (dialog.showExitConfirmation()) {
            System.exit(0);
        };
    }//GEN-LAST:event_exitIconMouseClicked

    private void homeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLblMouseClicked
        int option = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to Log out?", "Log Out Confirmation",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            FrameSwitch.showDashboard(this);
        }
    }//GEN-LAST:event_homeLblMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createAccLbl;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel loginImage;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLbl1;
    // End of variables declaration//GEN-END:variables
}
