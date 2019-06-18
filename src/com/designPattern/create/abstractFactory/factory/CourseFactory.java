package com.designPattern.create.abstractFactory.factory;

import com.designPattern.create.abstractFactory.production.article.Article;
import com.designPattern.create.abstractFactory.production.video.Video;

/**一个课程由一个Video和一个Article组成
 * @author:tianhaolin
 * @version:1.0
 */
public interface CourseFactory {

    Video getVideo();

    Article getArticle();
}
