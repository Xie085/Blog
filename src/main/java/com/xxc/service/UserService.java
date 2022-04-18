package com.xxc.service;

import com.xxc.bean.User;
import com.xxc.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiangcheng
 * @version 2022/4/18 13:07
 * @since JDK8
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUser(Integer id){
        if (id < 0){
            return null;
        }
        return userMapper.getUserById(id);
    }
}
