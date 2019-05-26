package com.designPattern.swagger.swagger;

import com.designPattern.swagger.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage Beverage;

    public Mocha(Beverage Beverage){
        this.Beverage = Beverage;
    }

    @Override
    public String getDescription() {
        return Beverage.getDescription() + "Mocha ";
    }

    @Override
    public double cost() {
        return Beverage.cost() + 1;
    }
}
