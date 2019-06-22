package com.designPattern.behavior.strategy;

/**
 * 立减促销策略
 */
public class LijianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("减30");
    }
}
