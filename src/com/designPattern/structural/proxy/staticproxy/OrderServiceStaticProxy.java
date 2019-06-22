package com.designPattern.structural.proxy.staticproxy;

import com.designPattern.structural.proxy.IOrderService;
import com.designPattern.structural.proxy.Order;
import com.designPattern.structural.proxy.OrderServiceImpl;
import com.designPattern.structural.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId%2;
        System.out.println("静态代理分配到[db+"+dbRouter+"]数据库");
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        int i = iOrderService.saveOrder(order);
        afterMethod();
        return i;
    }

    private void beforeMethod(){
        System.out.println("静态代理 before code");
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
