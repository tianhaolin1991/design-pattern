package com.designPattern.abstractFactory.factory;

import com.designPattern.abstractFactory.production.article.Article;
import com.designPattern.abstractFactory.production.video.Video;

/**一个课程由一个Video和一个Article组成
 * @author:tianhaolin
 * @version:1.0
 */
public interface CourseFactory {

    Video getVideo();

    Article getArticle();
}
