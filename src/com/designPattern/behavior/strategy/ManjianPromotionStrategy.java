package com.designPattern.behavior.strategy;

/**
 * 满1000减100
 */
public class ManjianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满1000减100");
    }
}
