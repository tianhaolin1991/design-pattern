package com.designPattern.structural.adaptor.objectAdaptor;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adaptor(new Adaptee());
        target.request();
    }
}
