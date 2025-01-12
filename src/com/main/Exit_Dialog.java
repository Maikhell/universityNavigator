
package com.main;
import javax.swing.*;
public class Exit_Dialog {
    private JFrame parentFrame;

    // Constructor to initialize with a parent frame
    public Exit_Dialog(JFrame parentFrame) {
        this.parentFrame = parentFrame;
    }

    // Show confirmation dialog
    public boolean showExitConfirmation() {
        int result = JOptionPane.showConfirmDialog(
                parentFrame,
                "Are you sure you want to exit?",
                "Exit Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        return result == JOptionPane.YES_OPTION;
    }
}

