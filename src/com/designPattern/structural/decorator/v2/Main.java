package com.designPattern.structural.decorator.v2;

/**使用装饰者完成灵活的增强
 * @author:tianhaolin
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) {
        AbstractBattercake battercake = new Battercake();
        battercake = new EggSwagger(battercake);
        battercake = new EggSwagger(battercake);
        battercake = new SausageSwagger(battercake);
        battercake = new SausageSwagger(battercake);
        System.out.println(battercake.getDescription()+battercake.cost());
    }
}
