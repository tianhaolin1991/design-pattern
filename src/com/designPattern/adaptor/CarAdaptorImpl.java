package com.designPattern.adaptor;

import com.designPattern.adaptor.factory.BMWCarFactory;
import com.designPattern.adaptor.factory.BenzCarFactory;
import com.designPattern.adaptor.factory.Car;
import com.designPattern.adaptor.factory.CarFactory;

import java.util.ArrayList;
import java.util.List;

public class CarAdaptorImpl implements CarAdaptor {

    CarFactory carFactory;
    List<CarFactory> factories = new ArrayList<CarFactory>();
    {
        factories.add(new BenzCarFactory());
        factories.add(new BMWCarFactory());
    }

    @Override
    public boolean isSupport(String brand) {

        for (CarFactory factory : factories) {
            if(factory.createCar().getBrand().equals(brand)){
                carFactory = factory;
                return true;
            }
        }
        return false;
    }

    @Override
    public Car changeColor(Car car ,String color) {
        if(car!=null){
            car.setColor(color);
        }else{
            car = carFactory.createCar();
            car.setColor(color);
        }
        return car;
    }

    public Car createCar(){
        Car car = carFactory.createCar();
        return car;
    }
}
