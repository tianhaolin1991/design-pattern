package com.designPattern.create.abstractFactory.factory;

import com.designPattern.create.abstractFactory.production.article.Article;
import com.designPattern.create.abstractFactory.production.article.JavaArticle;
import com.designPattern.create.abstractFactory.production.video.JavaVideo;
import com.designPattern.create.abstractFactory.production.video.Video;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
