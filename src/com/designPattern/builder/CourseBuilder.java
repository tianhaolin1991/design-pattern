package com.designPattern.builder;

/**
 * 制作课程
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArchive(String courseArchive);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
