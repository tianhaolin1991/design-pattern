package com.designPattern.create.simplefactory;

/**
 * 简单工厂的缺点,就是每当我们要扩展一个产品时,就需要修改VideoFactory,违背了OCP
 * 我们可以通过反射创建来弥补这个缺点
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video java = videoFactory.getInstance("Java");
        java.produce();
        Video python = videoFactory.getInstance("Python");
        python.produce();
    }
}
