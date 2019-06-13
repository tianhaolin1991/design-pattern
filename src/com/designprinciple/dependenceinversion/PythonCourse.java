package com.designprinciple.dependenceinversion;

public class PythonCourse implements ICourse {
    @Override
    public void learnCourse() {
        System.out.println("学习Python课程");
    }
}
