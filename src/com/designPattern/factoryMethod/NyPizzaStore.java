package com.designPattern.factoryMethod;

public class NyPizzaStore extends PizzaStore {
    private Pizza pizza;
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")){
            pizza = new NyStyleCheesePizza();
        }else{
            pizza = new NyStyleClamPizza();
        }
        return pizza;
    }
}
