package com.xxc.dao;


import com.xxc.bean.Article;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:25
 * @since JDK8
 */
public interface ArticleMapper {
    Article addArticle(Article article);
    Article getArticleById(Integer id);
}
