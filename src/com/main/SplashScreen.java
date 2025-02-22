/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.main;

import java.awt.Toolkit;

/**
 *
 * @author J-Michael
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form Spalsh_Screen
     */
    public SplashScreen() {
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
        lblperCount = new javax.swing.JLabel();
        splashProgress = new javax.swing.JProgressBar();
        loadingLbl = new javax.swing.JLabel();
        splashImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        innerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblperCount.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        lblperCount.setForeground(new java.awt.Color(0, 51, 0));
        lblperCount.setText("%");
        innerPanel.add(lblperCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 40, 20));

        splashProgress.setBackground(java.awt.Color.white);
        splashProgress.setForeground(new java.awt.Color(51, 204, 0));
        innerPanel.add(splashProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 490, 20));

        loadingLbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        loadingLbl.setForeground(new java.awt.Color(0, 102, 51));
        loadingLbl.setText("Loading Please Wait ...");
        innerPanel.add(loadingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, -1));

        splashImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/splashscreen.png"))); // NOI18N
        innerPanel.add(splashImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        SplashScreen ssc = new SplashScreen();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ssc.pack();
                ssc.setLocationRelativeTo(null);
                ssc.setResizable(false);
                ssc.setVisible(true);
                ssc.setVisible(true);

            }
        });

        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(25);
                ssc.splashProgress.setValue(i);
                ssc.lblperCount.setText(Integer.toString(i) + "%");

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        Dashboard dashboard = new Dashboard();

        ssc.setVisible(false);
        dashboard.pack();
        dashboard.setLocationRelativeTo(null);
        dashboard.setResizable(false);
        dashboard.setVisible(true);

        ssc.dispose();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel innerPanel;
    private javax.swing.JLabel lblperCount;
    private javax.swing.JLabel loadingLbl;
    private javax.swing.JLabel splashImage;
    private javax.swing.JProgressBar splashProgress;
    // End of variables declaration//GEN-END:variables
}
