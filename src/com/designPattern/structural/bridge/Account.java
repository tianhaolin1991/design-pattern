package com.designPattern.structural.bridge;

/**
 * Account的子类是具体
 * Bank是抽象
 */
public interface Account {
    Account getAccount();
    void openAccount();
}
