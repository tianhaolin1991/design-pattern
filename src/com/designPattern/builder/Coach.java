package com.designPattern.builder;

import com.sun.org.apache.regexp.internal.RE;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,String courseVideo,String courseArchive,String courseQA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArchive(courseArchive);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
