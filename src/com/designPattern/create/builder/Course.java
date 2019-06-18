package com.designPattern.create.builder;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArchive;
    //问题和答案
    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArchive() {
        return courseArchive;
    }

    public void setCourseArchive(String courseArchive) {
        this.courseArchive = courseArchive;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArchive='" + courseArchive + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
