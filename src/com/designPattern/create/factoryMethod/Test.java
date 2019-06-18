package com.designPattern.create.factoryMethod;

import com.designPattern.create.factoryMethod.factory.JavaVideoFactory;
import com.designPattern.create.factoryMethod.factory.VideoFactory;
import com.designPattern.create.factoryMethod.production.Video;

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
