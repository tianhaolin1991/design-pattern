package com.designPattern.abstractFactory.production.article;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("阅读Python手记");
    }
}
