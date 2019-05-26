package com.designPattern.swagger.swagger;

import com.designPattern.swagger.Beverage;

public class Milk extends CondimentDecorator {

    private Beverage Beverage;

    public Milk(Beverage Beverage) {
        this.Beverage = Beverage;
    }

    @Override
    public String getDescription() {
        return Beverage.getDescription() + "Milk ";
    }

    @Override
    public double cost() {
        return Beverage.cost() + 2;
    }
}
