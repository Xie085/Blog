package com.xxc.service;

import com.xxc.bean.Article;
import com.xxc.bean.ArticleTag;
import com.xxc.bean.Tag;
import com.xxc.dao.ArticleMapper;
import com.xxc.dao.ArticleTagMapper;
import com.xxc.dao.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    TagMapper tagMapper;

    public int addArticle(Article article) {
        //此时返回Article对象，再次将对应的标签也插入到标签库里t_article_tag
        Article article1 = article;
        articleMapper.addArticle(article1);
//        System.out.println("article = " + article1.getId());
        List<Tag> tagList = article1.getTagList();
        for (Tag tag : tagList) {
            articleTagMapper.addArticleTag(new ArticleTag(article1.getId(), tag.getId()));
        }
        return 1;
    }

    public Article getArticleById(Integer id) {
        Article article = articleMapper.getArticleById(id);
        List<Integer> tags = articleTagMapper.getArticleTags(id);
        List<Tag> tagsList = new ArrayList<>();
        for (Integer tag : tags) {
            tagsList.add(tagMapper.getTag(tag));
        }
        article.setTagList(tagsList);
        return article;
    }
}
