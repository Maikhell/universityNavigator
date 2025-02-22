/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.main;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author J-Michael
 */
public class Signin_Page extends javax.swing.JFrame {

    /**
     * Creates new form Register_Page
     */
    public Signin_Page() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/cvsuSLogo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        innerPanel = new javax.swing.JPanel();
        homeLbl = new javax.swing.JLabel();
        loginLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        confirmpassLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        designationLbl = new javax.swing.JLabel();
        questionLbl = new javax.swing.JLabel();
        signinLbl = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        fullnameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmpassField = new javax.swing.JPasswordField();
        signinImage = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        innerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        homeLbl.setForeground(new java.awt.Color(255, 255, 255));
        homeLbl.setText("Home >");
        homeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLblMouseClicked(evt);
            }
        });
        innerPanel.add(homeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        loginLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(0, 153, 51));
        loginLbl.setText("Sign in");
        innerPanel.add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 40));

        titleLbl.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 0, 0));
        titleLbl.setText("Sign In");
        innerPanel.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        passwordLbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(0, 0, 0));
        passwordLbl.setText("Password");
        innerPanel.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 30));

        confirmpassLbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        confirmpassLbl.setForeground(new java.awt.Color(0, 0, 0));
        confirmpassLbl.setText("Confirm Password");
        innerPanel.add(confirmpassLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 30));

        emailLbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(0, 0, 0));
        emailLbl.setText("Email");
        innerPanel.add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 200, 30));

        designationLbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        designationLbl.setForeground(new java.awt.Color(0, 0, 0));
        designationLbl.setText("Username");
        innerPanel.add(designationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 30));

        questionLbl.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        questionLbl.setForeground(new java.awt.Color(0, 0, 0));
        questionLbl.setText("Already Have an Account?");
        questionLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questionLblMouseClicked(evt);
            }
        });
        innerPanel.add(questionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, 30));

        signinLbl.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        signinLbl.setForeground(new java.awt.Color(51, 204, 0));
        signinLbl.setText("Login in here");
        signinLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinLblMouseClicked(evt);
            }
        });
        innerPanel.add(signinLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 80, 30));

        signupbtn.setBackground(new java.awt.Color(0, 0, 0));
        signupbtn.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setText("Sign Up");
        innerPanel.add(signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 110, 40));

        fullnameField.setBackground(new java.awt.Color(240, 240, 215));
        fullnameField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        innerPanel.add(fullnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 30));

        emailField.setBackground(new java.awt.Color(240, 240, 215));
        emailField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        innerPanel.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, 30));

        passwordField.setBackground(new java.awt.Color(240, 240, 215));
        passwordField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        innerPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 400, 30));

        confirmpassField.setBackground(new java.awt.Color(240, 240, 215));
        confirmpassField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        innerPanel.add(confirmpassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 400, 30));

        signinImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signin.png"))); // NOI18N
        innerPanel.add(signinImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 510));

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });
        innerPanel.add(exitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void questionLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionLblMouseClicked
        FrameSwitch.showLoginPage(this);
    }//GEN-LAST:event_questionLblMouseClicked

    private void signinLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLblMouseClicked
        FrameSwitch.showLoginPage(this);
    }//GEN-LAST:event_signinLblMouseClicked

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

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Signin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Signin_Page rPage = new Signin_Page();
                rPage.pack();
                rPage.setLocationRelativeTo(null);
                rPage.setResizable(false);
                rPage.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmpassField;
    private javax.swing.JLabel confirmpassLbl;
    private javax.swing.JLabel designationLbl;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JTextField fullnameField;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JLabel signinImage;
    private javax.swing.JLabel signinLbl;
    private javax.swing.JButton signupbtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
