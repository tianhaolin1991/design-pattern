package com.designPattern.structural.facade.subsystem;

import com.designPattern.structural.facade.PointsGift;

/**模拟礼物支付子系统
 * 逻辑就不再写了
 * @author:tianhaolin
 * @version:1.0
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println("礼物"+pointsGift.getName()+"支付成功,扣减积分20");
        return true;
    }
}
