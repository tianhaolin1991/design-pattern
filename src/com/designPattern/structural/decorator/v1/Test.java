package com.designPattern.structural.decorator.v1;

/**使用继承模式,如果客人要两个蛋,该怎么办??
 * 系统算不出来需要多少钱
 * @author:tianhaolin
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        BattercakeWithEggAndSausage battercake = new BattercakeWithEggAndSausage();
        System.out.println(battercake.getDescription()+"花费:"+battercake.cost()+"元");
    }
}
