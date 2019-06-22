package com.designPattern.structural.proxy;

public class OrderServiceImpl implements IOrderService {
    @Override
    public int saveOrder(Order order) {
       IOrderDao iOrderDao =  new OrderDaoImpl();
        System.out.println("Service调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
