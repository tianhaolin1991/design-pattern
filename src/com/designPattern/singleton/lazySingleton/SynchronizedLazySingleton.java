package com.designPattern.singleton.lazySingleton;

/**
 * 安全的懒汉模式,但是有synchronized锁的是静态方法,代表其锁对象是SynchronizedLazySingleton.class
 * 这个class文件,那么会导致访问效率低下
 */
public class SynchronizedLazySingleton {
    private static SynchronizedLazySingleton synchronizedLazySingleton = null;

    private SynchronizedLazySingleton(){}

    public synchronized static SynchronizedLazySingleton getInstance(){
        if(synchronizedLazySingleton==null){
            return new SynchronizedLazySingleton();
        }
        return synchronizedLazySingleton;
    }
}
