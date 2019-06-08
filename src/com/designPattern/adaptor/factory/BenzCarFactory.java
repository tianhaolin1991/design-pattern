package com.designPattern.adaptor.factory;

public class BenzCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Car("奔驰","红色");
    }
}
