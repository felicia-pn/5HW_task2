package com.company;

import java.util.ArrayList;

public class Course {

    public ArrayList<Professor> Professors;

    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;

    public Course(int id, String name, int cap, Professor prof) {
        this.id = id;
        this.name = name;
        this.maxCapacity = cap;
    }

    public static void enroll(Student student) {

    }

    public static void apply(TA ta) {

    }

    public void setMaxCap(int max) {
        this.maxCapacity = max;
    }

    public void setName(String name) {
        this.name = name;
    }


}
