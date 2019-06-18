package com.designPattern.create.singleton.lazySingleton;

public class MyThread extends Thread {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"-->"+instance);
    }
}
