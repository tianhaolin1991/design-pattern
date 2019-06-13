package com.designprinciple.dependenceinversion;

public class JavaCourse implements ICourse {

    @Override
    public void learnCourse() {
        System.out.println("学习JAVA课程");
    }
}
