package com.designprinciple.interfacesegragation.undo;

public class Dog implements AnimalAction {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void fly() {
        System.out.println("...");
    }

    @Override
    public void swim() {
        System.out.println("狗游泳");
    }
}
