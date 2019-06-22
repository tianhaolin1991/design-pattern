package com.designPattern.structural.bridge;

public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("工商银行");
        account.openAccount();
    }
}
