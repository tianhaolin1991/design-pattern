package com.designPattern.create.factoryMethod.factory;

import com.designPattern.create.factoryMethod.production.JavaVideo;
import com.designPattern.create.factoryMethod.production.Video;

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
