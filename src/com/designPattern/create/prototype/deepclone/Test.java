package com.designPattern.create.prototype.deepclone;

import java.util.Date;

/**潜克隆测试,以及它引出的问题
 * 深克隆测试,看它解决了这个问题
 * @author:tianhaolin
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig1 = new Pig("小猪佩奇",date);
        Pig pig2 = (Pig)pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        System.out.println("===========================================================================================================");
        //从输出结果我们可以看到,pig1和pig2的生日属性都改变了
        //这是因为pig1/pig2的birthday属性都指向date的地址
        //当date的属性发生了改变,那么pig1/pig2的birthday属性都指向了date地址
        pig1.getBirthday().setTime(666666666666L);
        System.out.println(pig1);
        System.out.println(pig2);

        System.out.println("========================================================深克隆===============================================");
        Date date2 = new Date(0L);
        DeepClonePig deepClonePig1 = new DeepClonePig("小猪佩奇",date2);
        DeepClonePig deepClonePig2 = (DeepClonePig)deepClonePig1.clone();
        deepClonePig1.getBirthday().setTime(666666666666L);
        System.out.println(deepClonePig1);
        System.out.println(deepClonePig2);
    }
}
