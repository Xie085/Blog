package com.xxc.service;

import com.xxc.bean.Article;
import com.xxc.bean.ArticleTag;
import com.xxc.bean.Tag;
import com.xxc.dao.ArticleMapper;
import com.xxc.dao.ArticleTagMapper;
import com.xxc.dao.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
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
        List<Tag> tags1 = articleTagMapper.getTagByArticleId(id);
        article.setTagList(tags1);
        return article;
    }

    public List<Article> getAllArticles(){
        List<Article> allArticle = articleMapper.getAllArticle();
        List<Article> articles = dataHandler(allArticle);
        return articles;
    }

    //按照类别获取所有文章信息
    public List<Article> getArticlesByCategory(Integer id){
        List<Article> articles = articleMapper.getAllArticleByCategoryId(id);
        List<Article> articles1 = dataHandler(articles);
        return articles1;
    }

    //统一业务逻辑
    private List<Article> dataHandler(List<Article> articles){
        if (articles == null ||articles.size() < 1){
            return articles;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        for (Article article : articles) {
            article.setTime(dateFormat.format(article.getCreateTime()));
            List<Tag> tag = articleTagMapper.getTagByArticleId(article.getId());
            article.setTagList(tag);
        }
        return articles;
    }
}
