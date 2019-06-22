package com.designPattern.structural.proxy.staticproxy;

import com.designPattern.structural.proxy.Order;

/**
 * 使用静态代理增强方法
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        int i = orderServiceStaticProxy.saveOrder(order);
        System.out.println(i);
    }
}
