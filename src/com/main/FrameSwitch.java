package com.main;

import javax.swing.JFrame;

public class FrameSwitch {

    public static void showDashboard(JFrame currentFrame) {
        switchToFrame(currentFrame, new Dashboard());
    }

    public static void showLoginPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Login_Page());
    }

    public static void showMapPage(JFrame currentFrame) {
        switchToFrame(currentFrame, new Campus_Map());
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
