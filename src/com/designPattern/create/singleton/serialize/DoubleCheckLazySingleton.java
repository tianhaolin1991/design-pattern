package com.designPattern.create.singleton.serialize;

import java.io.Serializable;

/**
 * 添加了readResolve方法来解决反序列化问题
 * 反序列化过程中会新创建一个对象
 * 判断类是否有readResolve方法
 * 如果有,会使用反射来执行该方法,并将该方法的返回值来代替新创建的对象
 */
public class DoubleCheckLazySingleton implements Serializable {
    private volatile static DoubleCheckLazySingleton safeLazySingleton;
    private DoubleCheckLazySingleton(){}

    public static DoubleCheckLazySingleton getInstance(){
        if(safeLazySingleton==null){
            synchronized (DoubleCheckLazySingleton.class){
                if(safeLazySingleton==null){
                    //这一步在计算机底层实际是三步
                    //1.给对象分配一个地址
                    //2.初始化对象
                    //3.safeLazeSingleton指向对象地址
                    //在JAVA中为了提高效率允许重排序,以提高效率,
                    //该重排序的原则是在单线程中不影响最终结果
                    //所以2/3是可能颠倒的;
                    //如果2/3颠倒了,那么很可能在执行3后,线程2做第一次判断,此时得到的结果不是null了,线程2就可以执行29行代码
                    //但是此时的safeLazySingleton实际还是没有初始化的,从而引起错误
                    safeLazySingleton = new DoubleCheckLazySingleton();
                }
                return safeLazySingleton;
            }
        }
        return safeLazySingleton;
    }

    private Object readResolve(){
        return safeLazySingleton;
    }
}
