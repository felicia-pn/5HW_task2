package com.company;

public class Student {

    private int id;
    private String name;

    Project p[] = new Project[1];

    public String getName() {
        return name;
    }

    //@ public invariant p != null;
    public Project getProject() {
        return p[0];
    }
}
