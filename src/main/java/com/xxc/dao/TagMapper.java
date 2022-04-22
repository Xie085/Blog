package com.xxc.dao;

import com.xxc.bean.Tag;

import java.util.List;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:45
 * @since JDK8
 */
public interface TagMapper {
    List<Tag> getAllTag();
    Tag getTag(Integer id);
}
