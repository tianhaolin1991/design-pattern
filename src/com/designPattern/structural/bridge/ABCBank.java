package com.designPattern.structural.bridge;

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("农业银行");
        account.openAccount();
    }
}
