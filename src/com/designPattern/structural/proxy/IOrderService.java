package com.designPattern.structural.proxy;

public interface IOrderService {

    /**
     * 返回生效行数
     * @param order
     * @return
     */
    int saveOrder(Order order);
}
