package com.designPattern.factoryMethod;

public abstract class PizzaStore {

    private Pizza pizza;

    public void orderPizza(String type){
        pizza  = createPizza(type);
        System.out.println("生成订单" + pizza.getName());
    }

    public abstract Pizza createPizza(String type);
}
