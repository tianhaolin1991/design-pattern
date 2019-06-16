package com.designPattern.simplefactory;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python" +
                "视频");
    }
}
