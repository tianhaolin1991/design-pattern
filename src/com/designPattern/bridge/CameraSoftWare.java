package com.designPattern.bridge;

public class CameraSoftWare implements SoftWare {
    @Override
    public void run() {
        System.out.println("Take Photos");
    }
}
