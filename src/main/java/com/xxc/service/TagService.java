package com.xxc.service;

import com.xxc.bean.Tag;
import com.xxc.dao.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:51
 * @since JDK8
 */
@Service
public class TagService {
    @Autowired
    TagMapper tagMapper;

    public List<Tag> getAllTag(){
        return tagMapper.getAllTag();
    }
}
