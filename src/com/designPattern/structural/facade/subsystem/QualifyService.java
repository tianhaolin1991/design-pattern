package com.designPattern.structural.facade.subsystem;

import com.designPattern.structural.facade.PointsGift;

/**模拟校验子系统,校验是否具有兑换资格
 * @author:tianhaolin
 * @version:1.0
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+"资格成功");
        return true;
    }
}
