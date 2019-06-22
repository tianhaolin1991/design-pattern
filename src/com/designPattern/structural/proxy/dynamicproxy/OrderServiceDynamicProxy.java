package com.designPattern.structural.proxy.dynamicproxy;

import com.designPattern.structural.proxy.Order;
import com.designPattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler{
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        beforeMethod(args[0]);
        Object invoke = method.invoke(target, args);
        afterMethod();
        return invoke;
    }

    public Object bind(){
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return o;
    }

    private void beforeMethod(Object object){
        System.out.println("Dynamic Proxy Before Method");
        if(object instanceof Order){
            int router = ((Order) object).getUserId() % 2;
            DataSourceContextHolder.setDBType("db" + router);
            System.out.println("分库,将该用户路由至:db" + router);
        }
    }
    private void afterMethod(){
        System.out.println("Dynamic Proxy After Method");
    }

}
