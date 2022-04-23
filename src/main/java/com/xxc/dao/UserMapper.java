package com.xxc.dao;

import com.xxc.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiangcheng
 * @version 2022/4/18 12:58
 * @since JDK8
 */
public interface UserMapper {
    User getUserById(Integer id);
    User getUserByNameAndPassword(@Param("userName") String userName,@Param("password") String password);
}
