package com.main;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class RetrieveData {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/uni_db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    public List<Teacher> getTeachers() {
        List<Teacher> teachers = new ArrayList<>();

        // Query to retrieve teacher data, including the id
        String query = "SELECT id, firstName, lastName, position, department, designation, teacher_image, first_sched, second_sched FROM teacher_tb";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD); 
             PreparedStatement preparedStatement = connection.prepareStatement(query); 
             ResultSet resultSet = preparedStatement.executeQuery()) {

            // Loop through the result set and add Teacher objects to the list
            while (resultSet.next()) {
                int id = resultSet.getInt("id");  // Retrieve the teacher's ID
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String position = resultSet.getString("position");
                String department = resultSet.getString("department");
                String designation = resultSet.getString("designation");

                // Retrieve the image byte arrays from the result set
                byte[] Timg = resultSet.getBytes("teacher_image");
                byte[] img1st = resultSet.getBytes("first_sched");
                byte[] img2nd = resultSet.getBytes("second_sched");

                // Convert byte array to ImageIcon for the teacher image
                ImageIcon teacherImageIcon = null;
                if (Timg != null) {
                    teacherImageIcon = new ImageIcon(Timg);
                    Image teacherImage = teacherImageIcon.getImage();
                    Image scaledTeacherImage = teacherImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                    teacherImageIcon = new ImageIcon(scaledTeacherImage);
                }

                // Convert byte array to ImageIcon for the first schedule image
                ImageIcon firstSemImageIcon = null;
                if (img1st != null) {
                    firstSemImageIcon = new ImageIcon(img1st);
                    Image firstSemImage = firstSemImageIcon.getImage();
                    Image scaledFirstSemImage = firstSemImage.getScaledInstance(300, 240, Image.SCALE_SMOOTH);
                    firstSemImageIcon = new ImageIcon(scaledFirstSemImage);
                }

                // Convert byte array to ImageIcon for the second schedule image
                ImageIcon secondSemImageIcon = null;
                if (img2nd != null) {
                    secondSemImageIcon = new ImageIcon(img2nd);
                    Image secondSemImage = secondSemImageIcon.getImage();
                    Image scaledSecondSemImage = secondSemImage.getScaledInstance(300, 240, Image.SCALE_SMOOTH);
                    secondSemImageIcon = new ImageIcon(scaledSecondSemImage);
                }

                // Create a Teacher object with the id and other attributes
                Teacher teacher = new Teacher(id, firstName, lastName, position, department, designation, teacherImageIcon, firstSemImageIcon, secondSemImageIcon);
                teachers.add(teacher);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error retrieving teacher data: " + e.getMessage());
        }

        return teachers;
    }
}
