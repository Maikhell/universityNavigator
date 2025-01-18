package com.main;

import javax.swing.JFrame;

public class FrameSwitch {

    public static void showDashboard(JFrame currentFrame) {
        switchToFrame(currentFrame, new Dashboard());
    }

    public static void showViewTeachers(JFrame currentFrame) {
        switchToFrame(currentFrame, new View_Teachers());
    }

    public static void showInfoPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Info());
    }

    public static void showContactPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Contact_Us());
    }

    public static void showAboutPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new About_Us());
    }

    public static void showLoginPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Login_Page());
    }

    public static void showMapPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Campus_Map());
    }

    public static void showOldFirstPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Old_Building_Firstfloor());
    }

    public static void showOldSecondPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Old_Building_Secondfloor());
    }

    public static void showOldThirdPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Old_Building_Thirdfloor());
    }

    public static void showOldFourthPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Old_Building_Fourthfloor());
    }

    public static void showSignPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Signin_Page());
    }

    public static void showCoursePage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Course());
    }

    public static void showBSCSPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new BsCS());
    }

    public static void showBSITPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new BsIT());
    }

    public static void showBSITSched(JFrame currentFrame) {
        switchToFrame(currentFrame, new View_Sched_IT());
    }

    private static void switchToFrame(JFrame currentFrame, JFrame newFrame) {
        if (currentFrame != null) {
            currentFrame.dispose();
        }

        if (newFrame != null) {
            newFrame.pack();
            newFrame.setLocationRelativeTo(null);
            newFrame.setResizable(false);
            newFrame.setVisible(true);
        }
    }
}
