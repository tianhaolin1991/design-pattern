package com.designPattern.abstractFactory.factory;

import com.designPattern.abstractFactory.production.article.Article;
import com.designPattern.abstractFactory.production.article.JavaArticle;
import com.designPattern.abstractFactory.production.article.PythonArticle;
import com.designPattern.abstractFactory.production.video.JavaVideo;
import com.designPattern.abstractFactory.production.video.PythonVideo;
import com.designPattern.abstractFactory.production.video.Video;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
