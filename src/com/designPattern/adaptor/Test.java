package com.designPattern.adaptor;

import com.designPattern.adaptor.factory.Car;

public class Test {
    public static void main(String[] args) {
        CarAdaptorImpl adaptor = new CarAdaptorImpl();
        boolean flag = adaptor.isSupport("宝马");
        if(flag){
            Car car = adaptor.createCar();
            System.out.println(car);
            adaptor.changeColor(car,"WHITE");
            System.out.println(car);
        }
    }
}
