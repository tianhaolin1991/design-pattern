package com.designprinciple.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Tianhaolin tianhaolin = new Tianhaolin();
        tianhaolin.learn(new JavaCourse());
        tianhaolin.learn(new PythonCourse());
    }
}
