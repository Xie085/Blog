package com.xxc.service;

import com.xxc.bean.Article;
import com.xxc.bean.ArticleTag;
import com.xxc.dao.ArticleMapper;
import com.xxc.dao.ArticleTagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:50
 * @since JDK8
 */
@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    ArticleTagMapper articleTagMapper;

    public int addArticle(Article article) {
        //此时返回Article对象，再次将对应的标签也插入到标签库里t_article_tag
        Article article1 = articleMapper.addArticle(article);
//        List<Integer> tagList = article1.getTagList();
//        for (Integer integer : tagList) {
//            articleTagMapper.addArticleTag(new ArticleTag(article1.getId(), integer));
//        }
        return 1;
    }

    public Article getArticleById(Integer id) {
        return articleMapper.getArticleById(id);
    }
}
