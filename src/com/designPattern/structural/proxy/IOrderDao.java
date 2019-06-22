package com.designPattern.structural.proxy;

public interface IOrderDao {
    /**
     * 模拟插入
     * @param order
     * @return
     */
    public int insert(Order order);
}
