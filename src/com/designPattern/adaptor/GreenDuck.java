package com.designPattern.adaptor;

public class GreenDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck fly 100m");
    }
}
