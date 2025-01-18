package com.main;

import javax.swing.ImageIcon;

public class Teacher {

    private int id; // Unique identifier
    private String firstName;
    private String lastName;
    private String position;
    private String department;
    private String designation;
    private ImageIcon teacherImage;
    private ImageIcon firstSchedImg;
    private ImageIcon secondSchedImg;

    // Constructor
    public Teacher(int id, String firstName, String lastName, String position, String department,
            String designation, ImageIcon teacherImage, ImageIcon firstSchedImg, ImageIcon secondSchedImg) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
        this.designation = designation;
        this.teacherImage = teacherImage;
        this.firstSchedImg = firstSchedImg;
        this.secondSchedImg = secondSchedImg;
    }

    // Getters and setters for all fields
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public ImageIcon getTeacherImage() {
        return teacherImage;
    }

    public ImageIcon getFirstSemImage() {
        return firstSchedImg;
    }

    public ImageIcon getSecondSemImage() {
        return secondSchedImg;
    }
}
