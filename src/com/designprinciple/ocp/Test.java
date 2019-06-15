package com.designprinciple.ocp;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96,"从零到顶Java教程",348d);
        JavaDiscountCourse javaDisCountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("原价"+javaDisCountCourse.getPrice()+",折后价:"+javaDisCountCourse.getDiscountPrice(0.8d));
    }
}
