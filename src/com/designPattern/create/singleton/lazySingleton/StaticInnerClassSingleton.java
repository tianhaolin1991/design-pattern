package com.designPattern.create.singleton.lazySingleton;

/**
 * 单例对象的创建在静态内部类中;
 * 在Java中,类的静态成员(非常量)被访问会引起类的初始化
 * 类的初始化时会触发类初始化锁,所以new StaticInnerClassSingleton()的重排序对于其他线程是不可见的
 */
public class StaticInnerClassSingleton {

    private static class InnerClass{
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.singleton;
    }

    private StaticInnerClassSingleton(){}
}
