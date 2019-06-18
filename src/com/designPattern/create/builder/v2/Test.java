package com.designPattern.create.builder.v2;

/**
 * 使用Course的内部类作为builder,使用链式调用来创建Course,可以实现灵活的创建
 */
public class Test {
    public static void main(String[] args) {
        Course build = new Course.CourseBuilder().setCourseName("Java精品课").setCourseArchive("Java精品课手记").setCourseVideo(",,,").build();
        System.out.println(build);

    }
}
