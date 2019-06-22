package com.designPattern.behavior.memeto;

public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
        this.imgs = article.getImgs();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }
}

