package com.designPattern.structural.adaptor.classAdaptor;

/**
 * 类适配器
 * 实现Target接口,继承Adaptor,实现了将Adaptor适配成为了Target
 * @author:tianhaolin
 * @version:1.0
 */
public class Adaptor extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
