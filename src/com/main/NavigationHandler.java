package com.main;

import java.util.List;
import javax.swing.ImageIcon;

public class NavigationHandler {

    private int currentIndex = 0; // Track the currently displayed teacher
    private List<Teacher> teachers;

    // Constructor
    public NavigationHandler(List<Teacher> teachers) {
        if (teachers != null) {
            this.teachers = teachers;
        } else {
            this.teachers = List.of(); // Initialize with an empty list if null
        }
    }

    // Get teacher by ID
    private int getTeacherIndexById(int id) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                return i; // Return index of teacher with matching id
            }
        }
        return -1; // Return -1 if no teacher found with that id
    }

    // Navigate to the next teacher by id
    public Teacher getNextTeacher(int currentTeacherId) {
        int currentIndex = getTeacherIndexById(currentTeacherId);
        if (currentIndex >= 0 && currentIndex < teachers.size() - 1) {
            return teachers.get(currentIndex + 1);
        }
        return null; // Return null if no next teacher exists
    }

    // Navigate to the previous teacher by id
    public Teacher getPreviousTeacher(int currentTeacherId) {
        int currentIndex = getTeacherIndexById(currentTeacherId);
        if (currentIndex > 0) {
            return teachers.get(currentIndex - 1);
        }
        return null; // Return null if no previous teacher exists
    }

    // Get the first teacher
    public Teacher getFirstTeacher() {
        if (!teachers.isEmpty()) {
            return teachers.get(0);
        }
        return null; // Return null if no teachers exist
    }

    // Get the last teacher
    public Teacher getLastTeacher() {
        if (!teachers.isEmpty()) {
            return teachers.get(teachers.size() - 1);
        }
        return null; // Return null if no teachers exist
    }
}
