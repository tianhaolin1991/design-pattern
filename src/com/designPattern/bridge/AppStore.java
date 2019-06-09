package com.designPattern.bridge;

public class AppStore implements SoftWare {
    @Override
    public void run() {
        System.out.println("打开APP Store");
    }
}
