package com.xxc.dao;


import com.xxc.bean.Article;

import java.util.List;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:25
 * @since JDK8
 */
public interface ArticleMapper {
    int addArticle(Article article);
    Article getArticleById(Integer id);
    List<Article> getAllArticleByCategoryId(Integer categoryId);
    List<Article> getAllArticle();
}
