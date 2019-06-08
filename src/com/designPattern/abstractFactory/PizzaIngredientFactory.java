package com.designPattern.abstractFactory;

public interface PizzaIngredientFactory {
    Cheese createCheese();
    Sauce createSauce();
    Dough createDough();
}
