package com.designPattern.firstDesign;

public class MallardDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck(new FlyWithWings(),new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
