package com.designPattern.behavior.strategy;

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;
    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotion(){
        promotionStrategy.doPromotion();
    }
}
