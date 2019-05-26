package com.designPattern.swagger.swagger;

import com.designPattern.swagger.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
