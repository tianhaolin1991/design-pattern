package com.designPattern.behavior.strategy;

/**
 * 返现到muke的账户中
 */
public class FanXianPromotionStrategy implements PromotionStrategy {


    @Override
    public void doPromotion() {
        System.out.println("返现10%到慕课网账户中");
    }
}
