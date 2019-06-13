package com.designprinciple.interfacesegragation.undo;

public class Bird implements AnimalAction {
    @Override
    public void eat() {
        System.out.println("鸟吃米");
    }

    @Override
    public void fly() {
        System.out.println("鸟飞");
    }

    @Override
    public void swim() {
        System.out.println("...");
    }
}
