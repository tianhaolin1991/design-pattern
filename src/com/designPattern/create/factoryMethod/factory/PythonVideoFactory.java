package com.designPattern.create.factoryMethod.factory;

import com.designPattern.create.factoryMethod.production.PythonVideo;
import com.designPattern.create.factoryMethod.production.Video;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
