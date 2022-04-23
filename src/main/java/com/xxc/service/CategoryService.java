package com.xxc.service;

import com.xxc.bean.Article;
import com.xxc.bean.Category;
import com.xxc.dao.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:54
 * @since JDK8
 */
@Service
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> getAllCategory(){
        return categoryMapper.getAllCategory();
    }

    public Category getCategory(Integer id){
        return categoryMapper.getCategoryById(id);
    }

}
