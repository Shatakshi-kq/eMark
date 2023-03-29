package com.example.emark.lib.models;

public class Course {
    private int course_id;
    private String course_name;
    private int college_id;

    public Course(int course_id, String course_name, int college_id) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.college_id = college_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }
}
