package com.designPattern.structural.decorator.v2;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class SausageSwagger extends BattercakeSwagger {
    public SausageSwagger(AbstractBattercake battercake) {
        super(battercake);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
