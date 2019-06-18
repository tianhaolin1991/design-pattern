package com.designPattern.create.abstractFactory;

import com.designPattern.create.abstractFactory.factory.CourseFactory;
import com.designPattern.create.abstractFactory.factory.JavaCourseFactory;

/**使用抽象工厂
 * @author:tianhaolin
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.getArticle().produce();
        javaCourseFactory.getVideo().produce();
    }
}
