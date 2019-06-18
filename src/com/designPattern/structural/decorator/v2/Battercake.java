package com.designPattern.structural.decorator.v2;

/**煎饼
 * @author:tianhaolin
 * @version:1.0
 */
public class Battercake  extends AbstractBattercake{

    public String getDescription(){
        return "煎饼";
    }

    public int cost(){
        return 8;
    }
}
