package com.designPattern.abstractFactory;

import com.designPattern.abstractFactory.factory.CourseFactory;
import com.designPattern.abstractFactory.factory.JavaCourseFactory;
import com.designPattern.abstractFactory.production.article.Article;

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
