package com.designPattern.factoryMethod;

public class ChicagoPizzaStore extends PizzaStore {
    private Pizza pizza;
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else{
            pizza = new ChicagoStyleClamPizza();
        }
        return pizza;
    }
}
