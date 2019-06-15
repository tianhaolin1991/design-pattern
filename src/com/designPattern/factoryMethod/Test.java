package com.designPattern.factoryMethod;

import com.designPattern.factoryMethod.factory.JavaVideoFactory;
import com.designPattern.factoryMethod.factory.VideoFactory;
import com.designPattern.factoryMethod.production.Video;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
