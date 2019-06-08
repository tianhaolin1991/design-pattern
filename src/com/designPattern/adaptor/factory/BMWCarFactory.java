package com.designPattern.adaptor.factory;

public class BMWCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return  new Car("宝马","红色");
    }
}
