package com.designPattern.create.abstractFactory.production.video;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("播放PythonVideo");
    }
}
