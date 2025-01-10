package com.main;

import javax.swing.*;
import java.awt.event.*;

public class HiddenLogin {

    private int clickCount = 0; //Track No of Clicks
    private static final String CORRECT_PASSWORD = "Admin123";

    // Method to handle click event
    public void secretClickableMouseClicked(MouseEvent evt) {
        clickCount++; // Increment the click count

        if (clickCount == 5) { //Click Limit Before Pop up

            showPasswordDialog();
        }
    }

    // Method to show the password dialog
    private void showPasswordDialog() {
        JPasswordField passwordField = new JPasswordField();
        int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (option == JOptionPane.OK_OPTION) { // If Enter is pressed
            char[] enteredPassword = passwordField.getPassword();
            if (isPasswordCorrect(enteredPassword)) {

                JOptionPane.showMessageDialog(null, "Welcome Back Admin! + Name");
                Login_Page loginFrame = new Login_Page();
                loginFrame.pack();
                loginFrame.setLocationRelativeTo(null);
                loginFrame.setResizable(false);
                loginFrame.setVisible(true);

            } else {
                // Error Output
                JOptionPane.showMessageDialog(null, "Unauthorized Personnel Only", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
        clickCount = 0;

    }

    private boolean isPasswordCorrect(char[] enteredPassword) {
        String password = new String(enteredPassword); // Convert char array to string
        return CORRECT_PASSWORD.equals(password); // Compare with the correct password
    }

}
