package com.designPattern.simplefactory;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制JAVA视频");
    }
}
