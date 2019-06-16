package com.designPattern.builder;

public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        coach.setCourseBuilder(new CourseActualBuilder());
        Course course = coach.makeCourse("Java设计模式精讲", "Java设计模式精讲PPT", "Java设计模式精讲视频", "Java设计模式精讲手记", "Java设计模式精讲问答");
        System.out.println(course);
    }
}
