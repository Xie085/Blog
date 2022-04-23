package com.xxc.dao;

import com.xxc.bean.ArticleTag;
import com.xxc.bean.Tag;

import java.util.List;

/**
 * @author xiangcheng
 * @version 2022/4/21 16:01
 * @since JDK8
 */
public interface ArticleTagMapper {
    int addArticleTag(ArticleTag articleTag);
    List<Integer> getArticleTags(Integer articleId);
    List<Tag> getTagByArticleId(Integer articleId);
}
