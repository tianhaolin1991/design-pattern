package com.designPattern.create.builder.v2;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArchive;
    //问题和答案
    private String courseQA;

    public Course(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArchive = courseBuilder.courseArchive;
        this.courseQA = courseBuilder.courseQA;
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

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArchive;
        //问题和答案
        private String courseQA;

        public CourseBuilder setCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder setCoursePPT (String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBuilder setCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }
        public CourseBuilder setCourseArchive(String courseArchive){
            this.courseArchive = courseArchive;
            return this;
        }
        public CourseBuilder setCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
    }
}
