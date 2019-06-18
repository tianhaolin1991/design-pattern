package com.designPattern.create.factoryMethod.factory;

import com.designPattern.create.factoryMethod.production.Video;

/**在实际的业务场景中,如果对某些行为是已知的,可以使用抽象类
 * 如果没有,可以使用接口
 * 产生哪一类视频完全由子类JavaFactory和PythonFactory来决定
 * @author:tianhaolin
 * @version:1.0
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
