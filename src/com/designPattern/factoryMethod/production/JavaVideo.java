package com.designPattern.factoryMethod.production;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("播放JavaVideo");
    }
}
