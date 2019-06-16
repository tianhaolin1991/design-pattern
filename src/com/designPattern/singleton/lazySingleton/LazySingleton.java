package com.designPattern.singleton.lazySingleton;

/**
 * 线程不安全的懒汉式,Test中结合MyThread结合多线程断点可以验证获取的不一定是同一个对象
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
