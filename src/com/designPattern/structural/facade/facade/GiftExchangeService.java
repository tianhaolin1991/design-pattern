package com.designPattern.structural.facade.facade;

import com.designPattern.structural.facade.PointsGift;
import com.designPattern.structural.facade.subsystem.PointsPaymentService;
import com.designPattern.structural.facade.subsystem.QualifyService;
import com.designPattern.structural.facade.subsystem.ShippingService;

/**这是一个外观模式
 * @author:tianhaolin
 * @version:1.0
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        boolean available = qualifyService.isAvailable(pointsGift);
        if(available){
            boolean pay = pointsPaymentService.pay(pointsGift);
            if(pay){
                String shipCode = shippingService.shipCode(pointsGift);
                System.out.println("订单号:"+shipCode);
            }
        }
    }
}
