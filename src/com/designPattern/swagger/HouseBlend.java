package com.designPattern.swagger;

import javax.net.ssl.HostnameVerifier;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        setDescription("HouseBlend ");
    }
    @Override
    public double cost() {
        return 10;
    }
}
