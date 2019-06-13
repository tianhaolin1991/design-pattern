package com.designprinciple.interfacesegragation.doo;

public class Dog implements EatAnimalAction,SwimAnimalAction {
    @Override
    public void eat() {
        System.out.println("狗吃饭");
    }

    @Override
    public void swim() {
        System.out.println("狗刨🐩");
    }
}
