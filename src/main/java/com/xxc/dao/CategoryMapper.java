package com.xxc.dao;

import com.xxc.bean.Category;

import java.util.List;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:48
 * @since JDK8
 */
public interface CategoryMapper {
    List<Category> getAllCategory();

    Category getCategoryById(Integer id);
}
