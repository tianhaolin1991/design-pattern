package com.designPattern.factoryMethod.factory;

import com.designPattern.factoryMethod.production.JavaVideo;
import com.designPattern.factoryMethod.production.Video;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
