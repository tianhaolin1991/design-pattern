package com.designPattern.structural.decorator.v2;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public abstract class BattercakeSwagger extends AbstractBattercake {

    private AbstractBattercake battercake;

    public BattercakeSwagger(AbstractBattercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String getDescription() {
       return battercake.getDescription();
    }

    @Override
    public int cost() {
        return battercake.cost();
    }
}
