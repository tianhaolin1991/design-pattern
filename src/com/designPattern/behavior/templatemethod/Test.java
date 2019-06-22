package com.designPattern.behavior.templatemethod;

/**
 * 我们可以看到,使用了模板方法之后,我们制作了一个makeCourse的算法
 * 该算法的步骤为:制作PPT,制作视频,编写手记(可选),课程素材包(根据课程不同改变)
 * 所以提供了一个钩子方法,用于子类决定是否需要手记
 * 提供了一个抽象的提供课程素材包抽象方法,由所有子类必须实现
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("designPattern Course start----");
        DesignPatternCourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("designPattern Course end----");

        System.out.println("Fe Course start----");
        FeCourse feCourse = new FeCourse();
        feCourse.makeCourse();
        System.out.println("Fe Course end----");

    }
}
