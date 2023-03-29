package com.example.emark.lib;

import com.example.emark.lib.models.Branch;
import com.example.emark.lib.models.Course;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.ArrayList;

public class Data {
    private static final String BRANCHURL = "";
    private static final String COURSEURL = "";
    private static final String YEARURL = "";

    public static ArrayList<Branch> getBranch(int course){
        ArrayList<Branch> branches = new ArrayList<>();
        branches.add(new Branch(1,"Computer Science Engineer", 1));
        branches.add(new Branch(2,"Information Technology", 1));
        branches.add(new Branch(3,"Mechanical Engineering", 1));
        branches.add(new Branch(4,"Electrical Engineering", 1));
        branches.add(new Branch(5,"BBA 1", 2));
        branches.add(new Branch(6,"BBA 2", 2));
        return branches;
    }


    public static ArrayList<Course> getCourses(){
        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new Course(1,"B Tech", 1));
        courses.add(new Course(1,"BBA", 2));

        return courses;

    }





}
