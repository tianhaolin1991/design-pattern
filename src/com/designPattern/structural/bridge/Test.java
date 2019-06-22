package com.designPattern.structural.bridge;

/**
 * 体会桥接模式的好处,使用聚合/组合代替继承,使得类的扩展更加灵活
 * 只需要2个Account类,2个Bank类就形成了2乘2的组合
 * 3个Account类,3个Bank可以形成3乘3的组合
 * 当我们的ACCOUNT类型和Bank类型越多,优势越明显
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new StorageAccount());
        Bank abcBank = new ABCBank(new SavingAccount());
        icbcBank.openAccount();
        abcBank.openAccount();
    }
}
