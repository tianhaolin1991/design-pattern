package com.designPattern.bridge;

public abstract class Phone {

    protected SoftWare softWare;

    public void setSoftWare(SoftWare softWare){
        this.softWare = softWare;
    }

    public abstract void run();
}
