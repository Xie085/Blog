package com.xxc.dao;

import com.xxc.bean.User;

/**
 * @author xiangcheng
 * @version 2022/4/18 12:58
 * @since JDK8
 */
public interface UserMapper {
    User getUserById(Integer id);
}
