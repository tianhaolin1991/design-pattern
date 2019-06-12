package com.principle.dependenceinversion;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        Tianhaolin tianhaolin = new Tianhaolin();
        tianhaolin.learn(new JavaCourse());
        tianhaolin.learn(new PythonCourse());
    }
}
