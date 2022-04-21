package com.xxc.controller;

import com.xxc.bean.Category;
import com.xxc.bean.Tag;
import com.xxc.service.CategoryService;
import com.xxc.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/add")
    public String add(Model model){
        List<Tag> tagList = tagService.getAllTag();
        List<Category> categoryList = categoryService.getAllCategory();
        model.addAttribute("tagList",tagList);
        model.addAttribute("categoryList",categoryList);
        return "article/add_article";
    }
}
