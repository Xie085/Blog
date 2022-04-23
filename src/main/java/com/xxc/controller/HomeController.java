package com.xxc.controller;

import com.xxc.bean.Article;
import com.xxc.bean.Category;
import com.xxc.bean.Tag;
import com.xxc.service.ArticleService;
import com.xxc.service.CategoryService;
import com.xxc.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xiangcheng
 * @version 2022/4/23 13:53
 * @since JDK8
 */
@Controller
public class HomeController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private TagService tagService;
    @Autowired
    private ArticleService articleService;


    @RequestMapping("/")
    public String index(Model model){
        List<Category> category = categoryService.getAllCategory();
        List<Tag> tags = tagService.getAllTag();
        model.addAttribute("categoryList",category);
        model.addAttribute("tagList",tags);

        return "home/index";
    }

    @RequestMapping("/loadPageAll")
    public String loadPageAll(Model model){
        List<Article> articles = articleService.getAllArticles();
        model.addAttribute("articleList",articles);

        return "home/articlepager";
    }

    @RequestMapping("/loadPage/{id}")
    public String loadPage(@PathVariable("id")Integer id,Model model){
        Category category1 = categoryService.getCategory(id);
        model.addAttribute("ca",category1);

        List<Category> category = categoryService.getAllCategory();
        List<Tag> tags = tagService.getAllTag();
        model.addAttribute("categoryList",category);
        model.addAttribute("tagList",tags);
        return "home/articlepager1";
    }

    @RequestMapping("/loadPage1/{id}")
    public String loadPage1(@PathVariable("id")Integer id,Model model){
        List<Article> articles = articleService.getArticlesByCategory(id);
        model.addAttribute("articleList",articles);

        return "home/articlepager";
    }
}
