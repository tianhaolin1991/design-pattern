package com.designPattern.create.abstractFactory.factory;

import com.designPattern.create.abstractFactory.production.article.Article;
import com.designPattern.create.abstractFactory.production.article.PythonArticle;
import com.designPattern.create.abstractFactory.production.video.PythonVideo;
import com.designPattern.create.abstractFactory.production.video.Video;

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
