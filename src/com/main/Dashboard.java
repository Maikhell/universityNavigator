package com.main;

import java.awt.Toolkit;

public class Dashboard extends javax.swing.JFrame {

    private HiddenLogin hiddenLogin;
    private int clickCount = 0;

    public Dashboard() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/cvsuSLogo.png")));
        hiddenLogin = new HiddenLogin();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        innerPanel = new javax.swing.JPanel();
        courseBtn = new javax.swing.JButton();
        infoBtn = new javax.swing.JButton();
        mapsBtn = new javax.swing.JButton();
        teacherBtn = new javax.swing.JButton();
        contactUsLabel = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        dashboardImage = new javax.swing.JLabel();
        secretClickable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1273, 714));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1220, 714));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        innerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseBtn.setBackground(new java.awt.Color(0, 0, 0));
        courseBtn.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        courseBtn.setForeground(new java.awt.Color(255, 255, 255));
        courseBtn.setText("Course");
        courseBtn.setMargin(new java.awt.Insets(5, 15, 5, 15));
        courseBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        courseBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        courseBtn.setPreferredSize(new java.awt.Dimension(166, 66));
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });
        innerPanel.add(courseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));

        infoBtn.setBackground(new java.awt.Color(0, 0, 0));
        infoBtn.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        infoBtn.setForeground(new java.awt.Color(255, 255, 255));
        infoBtn.setText("Info");
        infoBtn.setMargin(new java.awt.Insets(5, 15, 5, 15));
        infoBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        infoBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        infoBtn.setPreferredSize(new java.awt.Dimension(166, 66));
        innerPanel.add(infoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));

        mapsBtn.setBackground(new java.awt.Color(0, 0, 0));
        mapsBtn.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        mapsBtn.setForeground(new java.awt.Color(255, 255, 255));
        mapsBtn.setText("Maps");
        mapsBtn.setMargin(new java.awt.Insets(5, 15, 5, 15));
        mapsBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        mapsBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        mapsBtn.setPreferredSize(new java.awt.Dimension(166, 66));
        mapsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapsBtnActionPerformed(evt);
            }
        });
        innerPanel.add(mapsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        teacherBtn.setBackground(new java.awt.Color(0, 0, 0));
        teacherBtn.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        teacherBtn.setForeground(new java.awt.Color(255, 255, 255));
        teacherBtn.setText("Teachers");
        teacherBtn.setMargin(new java.awt.Insets(5, 15, 5, 15));
        teacherBtn.setMaximumSize(new java.awt.Dimension(166, 66));
        teacherBtn.setMinimumSize(new java.awt.Dimension(166, 66));
        teacherBtn.setPreferredSize(new java.awt.Dimension(166, 66));
        teacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherBtnActionPerformed(evt);
            }
        });
        innerPanel.add(teacherBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        contactUsLabel.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        contactUsLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactUsLabel.setText("CONTACT ");
        innerPanel.add(contactUsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 120, 50));

        aboutLabel.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        aboutLabel.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel.setText("ABOUT");
        innerPanel.add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 90, 50));

        titleLabel.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Cavite State University - Bacoor");
        innerPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 850, 50));

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });
        innerPanel.add(exitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        dashboardImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dashboard..png"))); // NOI18N
        innerPanel.add(dashboardImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        secretClickable.setText("jLabel1");
        secretClickable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secretClickableMouseClicked(evt);
            }
        });
        innerPanel.add(secretClickable, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 10, 90, 90));

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void mapsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapsBtnActionPerformed
        FrameSwitch.showMapPage(this);
    }//GEN-LAST:event_mapsBtnActionPerformed

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        Exit_Dialog dialog = new Exit_Dialog(this);
        if (dialog.showExitConfirmation()) {
            System.exit(0);
        };
    }//GEN-LAST:event_exitIconMouseClicked

    private void secretClickableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretClickableMouseClicked
        hiddenLogin.secretClickableMouseClicked(evt);
        clickCount++;
        if (clickCount == 5) {
            this.dispose();
        }
    }//GEN-LAST:event_secretClickableMouseClicked

    private void teacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherBtnActionPerformed

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBtnActionPerformed
        FrameSwitch.showCoursePage(this);
    }//GEN-LAST:event_courseBtnActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dashboard dashFrame = new Dashboard();
                dashFrame.pack();
                dashFrame.setLocationRelativeTo(null);
                dashFrame.setResizable(false);
                dashFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel contactUsLabel;
    private javax.swing.JButton courseBtn;
    private javax.swing.JLabel dashboardImage;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JButton infoBtn;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JButton mapsBtn;
    private javax.swing.JLabel secretClickable;
    private javax.swing.JButton teacherBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
