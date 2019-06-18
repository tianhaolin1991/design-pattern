package com.designPattern.create.singleton.lazySingleton;

/**
 * DoubleCheck的方法仅在对象为null的时候才会进入锁,兼顾了安全性与效率
 * 必须使用volatile关键字,该关键字保证了内存的可见性,并且禁止重排序的发生,杜绝了出错的隐患
 */
public class DoubleCheckLazySingleton {
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
}
