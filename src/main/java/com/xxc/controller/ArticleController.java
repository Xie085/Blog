package com.xxc.controller;

import com.xxc.bean.Article;
import com.xxc.bean.Category;
import com.xxc.bean.Result;
import com.xxc.bean.Tag;
import com.xxc.service.ArticleService;
import com.xxc.service.CategoryService;
import com.xxc.service.TagService;
import com.xxc.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:30
 * @since JDK8
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    TagService tagService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    ArticleService articleService;

    @RequestMapping("/add")
    public String add(Model model) {
        List<Tag> tagList = tagService.getAllTag();
        List<Category> categoryList = categoryService.getAllCategory();
        model.addAttribute("tagList", tagList);
        model.addAttribute("categoryList", categoryList);
        return "article/add_article";
    }

    @RequestMapping("/addContent")
    @ResponseBody
    public Result addContent(String param, String content, String description) throws UnsupportedEncodingException {
        String param1 = URLDecoder.decode(param, "utf-8");
        String content1 = URLDecoder.decode(content, "utf-8");
        String description1 = URLDecoder.decode(description, "utf-8");
        Article article = JsonUtil.fromJson(param1, Article.class);
        article.setContent(content1);
        article.setDescription(description1);
        article.setStatue(0);
        article.setCreateTime(new Date());
        article.setAuthor("零时用户");
//        System.out.println("article = " + article);
        int i = articleService.addArticle(article);
        if (i > 0) {
            return new Result("success", "处理成功");
        }
        return new Result("fail", "插入失败");
    }

    @RequestMapping("/{id}")
    public ModelAndView detail(@PathVariable("id")Integer id, ModelAndView model){
        Article article = articleService.getArticleById(id);
        model.addObject("article",article);
        model.setViewName("article/article_detail");
//        System.out.println("article = " + article);
        return model;
    }
}
