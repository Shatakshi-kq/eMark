package com.example.emark.lib.models;

public class Branch {
    private int id;
    private String branch_id;
    private int course_id;

    public Branch(int id, String branch_id, int course_id) {
        this.id = id;
        this.branch_id = branch_id;
        this.course_id = course_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
}
