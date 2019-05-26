package com.designPattern.swagger;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        setDescription("DarkRoast ");
    }
    @Override
    public double cost() {
        return 20;
    }
}
