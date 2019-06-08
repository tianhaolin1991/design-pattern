package com.designPattern.adaptor;

public class GreenTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("Turkey fly 20m");
    }
}
