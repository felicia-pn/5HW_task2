package com.company;

import java.util.ArrayList;

public class Exam {

    private int maxValue;
    //@ public invariant questions != null;
    private ArrayList<Integer> questions = new ArrayList<Integer>();
    private ArrayList<Student> students = new ArrayList<Student>();

    public boolean register(Student s) {
        students.add(s);
        return true;
    }

    public void addQuestion(int id, String task, int value) {
        questions.add(id);
    }

    public void setMaxValue(int max) {
        this.maxValue = max;
    }
}
