package com.designPattern.structural.adaptor.objectAdaptor;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Adaptor implements Target {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.AdapteeRequst();
    }
}
