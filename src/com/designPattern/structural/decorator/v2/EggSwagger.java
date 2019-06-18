package com.designPattern.structural.decorator.v2;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class EggSwagger extends BattercakeSwagger {
    public EggSwagger(AbstractBattercake battercake) {
        super(battercake);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
