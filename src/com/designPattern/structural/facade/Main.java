package com.designPattern.structural.facade;

import com.designPattern.structural.facade.facade.GiftExchangeService;

/**客户端,不需要关心子系统的逻辑
 * 只需要使用giftExchange方法,即可完成PointsGift的兑换
 * @author:tianhaolin
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) {
        PointsGift mokbook = new PointsGift("慕课丛书");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(mokbook);
    }
}
