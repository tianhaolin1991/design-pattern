package com.designPattern.behavior.memeto;

/**
 * 模拟两次存档,第三次写完回退的功能
 */
public class Main {
    public static void main(String[] args) {

        ArticleManager articleManager = new ArticleManager();

        System.out.println("===================写完第一次,保存========================");
        Article article = new Article("设计模式A", "内容A", "图片A");
        System.out.println(article);
        ArticleMemento articleMemento = article.saveToMemento();
        articleManager.addMemento(articleMemento);
        System.out.println("=====================修改,保存===========================");
        article.setTitle("设计模式B");
        article.setContent("内容B");
        System.out.println(article);
        ArticleMemento articleMemento2 = article.saveToMemento();
        articleManager.addMemento(articleMemento2);
        System.out.println("=======================修改============================");
        article.setContent("内容C");
        article.setImgs("图片C");
        System.out.println(article);
        System.out.println("=====================回退第一次==========================");
        ArticleMemento memento = articleManager.getMemento();
        article.undoFromMemento(memento);
        System.out.println(article);
        System.out.println("=====================回退第二次==========================");
        article.undoFromMemento(articleManager.getMemento());
        System.out.println(article);
    }
}
