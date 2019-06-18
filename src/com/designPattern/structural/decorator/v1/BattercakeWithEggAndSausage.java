package com.designPattern.structural.decorator.v1;

/**加肠煎饼
 * @author:tianhaolin
 * @version:1.0
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg{
    public String getDescription(){
        return super.getDescription()+"加一个香肠";
    }

    public int cost(){
        return super.cost()+2;
    }
}
