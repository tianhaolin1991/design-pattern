package com.designPattern.structural.facade;

/**积分礼物
 * @author:tianhaolin
 * @version:1.0
 */
public class PointsGift {
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
