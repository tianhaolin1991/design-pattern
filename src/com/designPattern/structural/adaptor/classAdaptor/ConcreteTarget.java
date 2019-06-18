package com.designPattern.structural.adaptor.classAdaptor;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget的Request方法");
    }
}
