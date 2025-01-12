/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.main;

import java.awt.Toolkit;

public class Campus_Map extends javax.swing.JFrame {

    private HiddenLogin hiddenLogin;
    private int clickCount = 0;


    public Campus_Map() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/cvsuSLogo.png")));
        hiddenLogin = new HiddenLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mapLbl = new javax.swing.JLabel();
        homeLbl = new javax.swing.JLabel();
        campuslbl = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        mapImage = new javax.swing.JLabel();
        secretClickable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mapLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mapLbl.setForeground(new java.awt.Color(0, 102, 0));
        mapLbl.setText("Map");
        jPanel1.add(mapLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 40));

        homeLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        homeLbl.setForeground(new java.awt.Color(0, 0, 0));
        homeLbl.setText("Home >");
        homeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLblMouseClicked(evt);
            }
        });
        jPanel1.add(homeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 40));

        campuslbl.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        campuslbl.setForeground(new java.awt.Color(255, 255, 255));
        campuslbl.setText("CVsU Bacoor Campus - Map");
        jPanel1.add(campuslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 680, 60));

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });
        jPanel1.add(exitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        mapImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campus Map.png"))); // NOI18N
        jPanel1.add(mapImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, -1, 720));

        secretClickable.setText("jLabel1");
        secretClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secretClickableMouseClicked(evt);
            }
        });
        jPanel1.add(secretClickable, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 10, 90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        Exit_Dialog dialog = new Exit_Dialog(this);
        if (dialog.showExitConfirmation()) {
            System.exit(0);
        };
    }//GEN-LAST:event_exitIconMouseClicked

    private void homeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLblMouseClicked
        FrameSwitch.showDashboard(this);
    }//GEN-LAST:event_homeLblMouseClicked

    private void secretClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretClickableMouseClicked
        hiddenLogin.secretClickableMouseClicked(evt);
        clickCount++;
        if (clickCount == 5) { //Click Limit Before Pop up
            this.dispose();
        }
    }//GEN-LAST:event_secretClickableMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Campus_Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campus_Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campus_Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campus_Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campus_Map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campuslbl;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mapImage;
    private javax.swing.JLabel mapLbl;
    private javax.swing.JLabel secretClickable;
    // End of variables declaration//GEN-END:variables
}
