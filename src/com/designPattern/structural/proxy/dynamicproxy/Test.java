package com.designPattern.structural.proxy.dynamicproxy;

import com.designPattern.structural.proxy.IOrderService;
import com.designPattern.structural.proxy.Order;
import com.designPattern.structural.proxy.OrderServiceImpl;

/**
 * 使用动态代理增强saveOrder方法
 */
public class Test {
    public static void main(String[] args) {
        OrderServiceImpl orderService = new OrderServiceImpl();
        OrderServiceDynamicProxy orderServiceDynamicProxy = new OrderServiceDynamicProxy(orderService);
        IOrderService proxy = (IOrderService)orderServiceDynamicProxy.bind();
        Order order = new Order();
        order.setUserId(2);
        proxy.saveOrder(order);
    }
}
