package com.example.emark.lib.models;

public class Users {
    private int sno;
    private String rf_id;
    private String gps_id;
    private String name;
    private String desg;
    private String course;
    private String branch;
    private String year;
    private String address;
    private String contact;
    private String imgUrl;

    public Users(int sno, String rf_id, String gps_id, String name, String desg, String course, String branch, String year, String address, String contact, String imgUrl) {
        this.sno = sno;
        this.rf_id = rf_id;
        this.gps_id = gps_id;
        this.name = name;
        this.desg = desg;
        this.course = course;
        this.branch = branch;
        this.year = year;
        this.address = address;
        this.contact = contact;
        this.imgUrl = imgUrl;
    }

    public int getSno() {
        return sno;
    }

    public String getRf_id() {
        return rf_id;
    }

    public String getGps_id() {
        return gps_id;
    }

    public String getName() {
        return name;
    }

    public String getDesg() {
        return desg;
    }

    public String getCourse_id() {
        return course;
    }

    public String getBranch_id() {
        return branch;
    }

    public String getYear_id() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
