package com.designPattern.adaptor;

public class Main {
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter(new GreenTurkey());
        duck.quack();
        duck.fly();
    }
}
