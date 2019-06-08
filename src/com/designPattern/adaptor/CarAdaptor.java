package com.designPattern.adaptor;

import com.designPattern.adaptor.factory.Car;
import com.designPattern.adaptor.factory.CarFactory;

public interface CarAdaptor {

    boolean isSupport(String brand);

    Car changeColor(Car car,String color);
}
