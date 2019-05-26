package com.designPattern.factoryMethod;

public class Main {
    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("Cheese");

        PizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("Clam");
    }
}
