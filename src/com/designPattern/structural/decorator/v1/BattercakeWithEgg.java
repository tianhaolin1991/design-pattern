package com.designPattern.structural.decorator.v1;

/**加蛋煎饼
 * @author:tianhaolin
 * @version:1.0
 */
public class BattercakeWithEgg extends Battercake{
    public String getDescription(){
        return super.getDescription()+"加一个鸡蛋";
    }

    public int cost(){
        return super.cost()+1;
    }
}
