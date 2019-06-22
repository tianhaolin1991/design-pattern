package com.designPattern.structural.bridge;

public class StorageAccount implements Account{

    @Override
    public Account getAccount() {
        return new StorageAccount();
    }

    @Override
    public void openAccount() {
        System.out.println("存储账户");
    }
}
