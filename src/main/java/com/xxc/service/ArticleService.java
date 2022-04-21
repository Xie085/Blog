package com.xxc.service;

import com.xxc.dao.CategoryMapper;
import com.xxc.dao.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:50
 * @since JDK8
 */
@Service
public class ArticleService {
    @Autowired
    TagService tagService;
    @Autowired
    CategoryService categoryService;


}
