package com.designPattern.structural.bridge;

public class SavingAccount implements Account {
    @Override
    public Account getAccount() {
        return new SavingAccount();
    }

    @Override
    public void openAccount() {
        System.out.println("一般账户");
    }
}
