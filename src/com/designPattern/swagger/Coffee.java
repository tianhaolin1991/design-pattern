package com.designPattern.swagger;

import com.designPattern.swagger.swagger.Milk;
import com.designPattern.swagger.swagger.Mocha;

public class Coffee {
    public static void main(String[] args) {
        Beverage Beverage1 = new DarkRoast();
        Beverage1 = new Milk(Beverage1);
        Beverage1 = new Milk(Beverage1);
        Beverage1 = new Mocha(Beverage1);
        System.out.println("咖啡: " + Beverage1.getDescription());
        System.out.println("价格: " + Beverage1.cost());

        Beverage Beverage2 = new HouseBlend();
        Beverage2 = new Mocha(Beverage2);
        Beverage2 = new Milk(Beverage2);
        Beverage2 = new Mocha(Beverage2);
        System.out.println("咖啡: " + Beverage2.getDescription());
        System.out.println("价格: " + Beverage2.cost());
    }
}
