package com.designPattern.singleton.reflect;

/**
 * 只对饿汉式,和内部类方式有效;如果是懒汉式,如果先用反射创建,则构造中的判断不生效了
 */
public class HungrySingleton {
    private static HungrySingleton singleton;
    static{
        singleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if(singleton!=null){
            throw new RuntimeException("单例构造器,不允许反射");
        }
    };
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
