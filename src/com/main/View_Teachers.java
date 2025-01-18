/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.main;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.util.List;

public class View_Teachers extends javax.swing.JFrame {

    private List<Teacher> teachers;

    private NavigationHandler navHandler;

    public View_Teachers() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/cvsuSLogo.png")));
        RetrieveData RData = new RetrieveData();
        List<Teacher> teachers = RData.getTeachers();

        if (teachers != null && !teachers.isEmpty()) {

            NavigationHandler navHandler = new NavigationHandler(teachers);
            Teacher firstTeacher = navHandler.getFirstTeacher();
            if (firstTeacher != null) {
                updateLabels(firstTeacher);
            }
        }
    }

    private void updateLabels(Teacher teacher) {
        indexIDlbl.setText("ID" + teacher.getId());
        teacherNamelbl.setText("Name: " + teacher.getFirstName() + " " + teacher.getLastName());
        teacherPoslbl.setText("Position: " + teacher.getPosition());
        teacherDeptlbl.setText("Department: " + teacher.getDepartment());
        teacherDesiglbl.setText("Designation: " + teacher.getDesignation());

        // Update images
        teacherConImg.setIcon(teacher.getTeacherImage());  // ImageIcon for teacher
        firstsemConImg.setIcon(teacher.getFirstSemImage());  // ImageIcon for 1st semester schedule
        secondsemConImg.setIcon(teacher.getSecondSemImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        innerPanel = new javax.swing.JPanel();
        indexIDlbl = new javax.swing.JLabel();
        stickerImg = new javax.swing.JLabel();
        teacherConImg = new javax.swing.JLabel();
        secondsemConImg = new javax.swing.JLabel();
        firstsemConImg = new javax.swing.JLabel();
        leftMaxbtn = new javax.swing.JLabel();
        rightMaxbtn = new javax.swing.JLabel();
        rightOnebtn = new javax.swing.JLabel();
        leftOnebtn = new javax.swing.JLabel();
        searchlbl = new javax.swing.JLabel();
        mapbtnLabel = new javax.swing.JLabel();
        teacherbtnLabel = new javax.swing.JLabel();
        homebtnLabel = new javax.swing.JLabel();
        coursebtnLabel = new javax.swing.JLabel();
        teacherNamelbl = new javax.swing.JLabel();
        teacherPoslbl = new javax.swing.JLabel();
        teacherDesiglbl = new javax.swing.JLabel();
        teacherDeptlbl = new javax.swing.JLabel();
        cvsuTitlelbl = new javax.swing.JLabel();
        scheduleLbl = new javax.swing.JLabel();
        secondSemlbl = new javax.swing.JLabel();
        firstSemlbl = new javax.swing.JLabel();
        homeLbl = new javax.swing.JLabel();
        mapLbl = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        viewTeacherImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        innerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indexIDlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indexIDlblMouseClicked(evt);
            }
        });
        innerPanel.add(indexIDlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 40, 60));

        stickerImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stickerImage.png"))); // NOI18N
        stickerImg.setText("jLabel1");
        innerPanel.add(stickerImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 260, 250));
        innerPanel.add(teacherConImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 200, 180));
        innerPanel.add(secondsemConImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 300, 240));
        innerPanel.add(firstsemConImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 300, 240));

        leftMaxbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMaxbtnMouseClicked(evt);
            }
        });
        innerPanel.add(leftMaxbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 50, 60));

        rightMaxbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightMaxbtnMouseClicked(evt);
            }
        });
        innerPanel.add(rightMaxbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 50, 60));

        rightOnebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightOnebtnMouseClicked(evt);
            }
        });
        innerPanel.add(rightOnebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 30, 60));

        leftOnebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftOnebtnMouseClicked(evt);
            }
        });
        innerPanel.add(leftOnebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 40, 60));

        searchlbl.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        searchlbl.setForeground(new java.awt.Color(255, 255, 255));
        searchlbl.setText("Search");
        searchlbl.setFocusable(false);
        innerPanel.add(searchlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 100, 40));

        mapbtnLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        mapbtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        mapbtnLabel.setText("Map");
        mapbtnLabel.setFocusable(false);
        mapbtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapbtnLabelMouseClicked(evt);
            }
        });
        innerPanel.add(mapbtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, 110, 30));

        teacherbtnLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        teacherbtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        teacherbtnLabel.setText("Teachers");
        teacherbtnLabel.setFocusable(false);
        teacherbtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherbtnLabelMouseClicked(evt);
            }
        });
        innerPanel.add(teacherbtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 40));

        homebtnLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        homebtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        homebtnLabel.setText("Home");
        homebtnLabel.setFocusable(false);
        homebtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnLabelMouseClicked(evt);
            }
        });
        innerPanel.add(homebtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, -1));

        coursebtnLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        coursebtnLabel.setForeground(new java.awt.Color(255, 255, 255));
        coursebtnLabel.setText("Courses");
        coursebtnLabel.setFocusable(false);
        coursebtnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursebtnLabelMouseClicked(evt);
            }
        });
        innerPanel.add(coursebtnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 255, 120, 30));

        teacherNamelbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        teacherNamelbl.setForeground(new java.awt.Color(0, 0, 0));
        teacherNamelbl.setText("Teacher's Name");
        innerPanel.add(teacherNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 140, -1));

        teacherPoslbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        teacherPoslbl.setForeground(new java.awt.Color(0, 0, 0));
        teacherPoslbl.setText("Position In University");
        innerPanel.add(teacherPoslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 190, -1));

        teacherDesiglbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        teacherDesiglbl.setForeground(new java.awt.Color(0, 0, 0));
        teacherDesiglbl.setText("Designation");
        innerPanel.add(teacherDesiglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 110, -1));

        teacherDeptlbl.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        teacherDeptlbl.setForeground(new java.awt.Color(0, 0, 0));
        teacherDeptlbl.setText("Department");
        innerPanel.add(teacherDeptlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 110, -1));

        cvsuTitlelbl.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        cvsuTitlelbl.setForeground(new java.awt.Color(255, 255, 255));
        cvsuTitlelbl.setText("Cavite State University of Bacoor");
        innerPanel.add(cvsuTitlelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        scheduleLbl.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        scheduleLbl.setForeground(new java.awt.Color(0, 0, 0));
        scheduleLbl.setText("SCHEDULES");
        innerPanel.add(scheduleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, -1));

        secondSemlbl.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        secondSemlbl.setForeground(new java.awt.Color(0, 0, 0));
        secondSemlbl.setText("2ND SEMESTER");
        innerPanel.add(secondSemlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 190, -1));

        firstSemlbl.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        firstSemlbl.setForeground(new java.awt.Color(0, 0, 0));
        firstSemlbl.setText("1ST SEMESTER");
        innerPanel.add(firstSemlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, -1));

        homeLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        homeLbl.setForeground(new java.awt.Color(255, 255, 255));
        homeLbl.setText("Home >");
        homeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLblMouseClicked(evt);
            }
        });
        innerPanel.add(homeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        mapLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mapLbl.setForeground(new java.awt.Color(0, 102, 0));
        mapLbl.setText("Teachers");
        innerPanel.add(mapLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 80, 30));

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });
        innerPanel.add(exitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        viewTeacherImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewTeacher.png"))); // NOI18N
        innerPanel.add(viewTeacherImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLblMouseClicked
        FrameSwitch.showDashboard(this);
    }//GEN-LAST:event_homeLblMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        Exit_Dialog dialog = new Exit_Dialog(this);
        if (dialog.showExitConfirmation()) {
            System.exit(0);
        };
    }//GEN-LAST:event_exitIconMouseClicked

    private void homebtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnLabelMouseClicked
        FrameSwitch.showDashboard(this);
    }//GEN-LAST:event_homebtnLabelMouseClicked

    private void teacherbtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherbtnLabelMouseClicked
        JOptionPane.showMessageDialog(null, "You are Here! ");
    }//GEN-LAST:event_teacherbtnLabelMouseClicked

    private void coursebtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursebtnLabelMouseClicked
        FrameSwitch.showCoursePage(this);
    }//GEN-LAST:event_coursebtnLabelMouseClicked

    private void mapbtnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapbtnLabelMouseClicked
        FrameSwitch.showMapPage(this);
    }//GEN-LAST:event_mapbtnLabelMouseClicked

    private void leftMaxbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMaxbtnMouseClicked
        if (teachers != null && !teachers.isEmpty()) {
            Teacher firstTeacher = navHandler.getFirstTeacher(); // Get the first teacher by id
            if (firstTeacher != null) {
                updateLabels(firstTeacher);
            }
        }

    }//GEN-LAST:event_leftMaxbtnMouseClicked

    private void leftOnebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftOnebtnMouseClicked
        Teacher previousTeacher = navHandler.getPreviousTeacher(currentTeacher.getId());
        if (previousTeacher != null) {
            updateLabels(previousTeacher);
            //we need to trach the ID to so it can go to next teacher
        }
    }//GEN-LAST:event_leftOnebtnMouseClicked

    private void rightOnebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightOnebtnMouseClicked
        Teacher nextTeacher = navHandler.getNextTeacher(currentTeacher.getId()); // Get next teacher by id
        if (nextTeacher != null) {
            updateLabels(nextTeacher);
        }


    }//GEN-LAST:event_rightOnebtnMouseClicked

    private void rightMaxbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMaxbtnMouseClicked
        Teacher lastTeacher = navHandler.getLastTeacher();
        if (lastTeacher != null) {
            updateLabels(lastTeacher);
        }
    }//GEN-LAST:event_rightMaxbtnMouseClicked

    private void indexIDlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indexIDlblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_indexIDlblMouseClicked

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
            java.util.logging.Logger.getLogger(View_Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Teachers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coursebtnLabel;
    private javax.swing.JLabel cvsuTitlelbl;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel firstSemlbl;
    private javax.swing.JLabel firstsemConImg;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JLabel homebtnLabel;
    private javax.swing.JLabel indexIDlbl;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JLabel leftMaxbtn;
    private javax.swing.JLabel leftOnebtn;
    private javax.swing.JLabel mapLbl;
    private javax.swing.JLabel mapbtnLabel;
    private javax.swing.JLabel rightMaxbtn;
    private javax.swing.JLabel rightOnebtn;
    private javax.swing.JLabel scheduleLbl;
    private javax.swing.JLabel searchlbl;
    private javax.swing.JLabel secondSemlbl;
    private javax.swing.JLabel secondsemConImg;
    private javax.swing.JLabel stickerImg;
    private javax.swing.JLabel teacherConImg;
    private javax.swing.JLabel teacherDeptlbl;
    private javax.swing.JLabel teacherDesiglbl;
    private javax.swing.JLabel teacherNamelbl;
    private javax.swing.JLabel teacherPoslbl;
    private javax.swing.JLabel teacherbtnLabel;
    private javax.swing.JLabel viewTeacherImg;
    // End of variables declaration//GEN-END:variables
}
