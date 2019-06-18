package com.designPattern.create.abstractFactory.production.article;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("阅读Java手记");
    }
}
