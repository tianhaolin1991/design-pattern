package com.designPattern.structural.facade.subsystem;

import com.designPattern.structural.facade.PointsGift;

/**物流子系统
 * @author:tianhaolin
 * @version:1.0
 */
public class ShippingService {
    public String shipCode(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"发送成功");
        return "6666666";
    }
}
