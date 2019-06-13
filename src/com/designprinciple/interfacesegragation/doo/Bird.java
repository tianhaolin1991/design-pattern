package com.designprinciple.interfacesegragation.doo;

public class Bird implements EatAnimalAction,FlyAnimalAction {
    @Override
    public void eat() {
        System.out.println("鸟吃米");
    }

    @Override
    public void fly() {
        System.out.println("我飞~!");
    }
}
