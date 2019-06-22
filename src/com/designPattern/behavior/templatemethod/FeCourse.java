package com.designPattern.behavior.templatemethod;

public class FeCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
