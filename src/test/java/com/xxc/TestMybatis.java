package com.xxc;

import com.xxc.bean.User;
import com.xxc.dao.UserMapper;
import com.xxc.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiangcheng
 * @version 2022/4/18 13:00
 * @since JDK8
 */
//@RunWith(value = SpringJUnit4ClassRunner.class)
//@SpringJUnitConfig(locations = {"classpath:spring-core.xml"})
public class TestMybatis {
//    @Autowired
//    UserMapper userMapper;

    @Test
    public void test01(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-core.xml");
        UserService bean = ctx.getBean(UserService.class);
        User user = bean.getUser(1);
        System.out.println("user = " + user);
    }

//    @Test
//    public void test02(){
//        User user = userMapper.getUserById(1);
//        System.out.println("user = " + user);
//    }
}
