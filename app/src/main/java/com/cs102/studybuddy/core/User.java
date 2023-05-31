package com.cs102.studybuddy.core;

import android.widget.EditText;

import java.util.HashMap;

public class User {
    private String username;
    private String email;
    private String name;
    private String surname;
    private int birthYear;
    private String gender;
    private HashMap<String, Integer> enrollments;

    private String genderPreference;
    private boolean okWithGroup;

    // This is here for deserialization from Firebase document
    public User() {}

    public User(String username, String email, String name,
                String surname, int birthYear, String gender,
                HashMap<String, Integer> enrollments,
                String genderPreference, boolean okWithGroup)
    {
        this.username = username;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.gender = gender;
        this.enrollments = enrollments;
        this.genderPreference = genderPreference;
        this.okWithGroup = okWithGroup;
    }

    public User(String username, String email, EditText name, EditText surname, int birthYear, String gender, HashMap<String, Integer> enrollments, String genderPreference, boolean okWithGroup) {
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getBirthYear() { return birthYear; }
    public String getGender() { return gender; }
    public HashMap<String, Integer> getEnrollments() { return enrollments; }

    public String getGenderPreference() { return genderPreference; }
    public boolean isOkWithGroup() { return okWithGroup; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void enroll(Course c) {
        enrollments.put(c.getCourseId(), 0);
    }

    public void leave(Course c) {
        enrollments.remove(c.getCourseId());
    }
}
