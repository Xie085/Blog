package com.xxc;

import com.xxc.bean.Article;
import com.xxc.bean.User;
import com.xxc.dao.UserMapper;
import com.xxc.service.ArticleService;
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
        ArticleService bean = ctx.getBean(ArticleService.class);
        Article user = bean.getArticleById(15);
        System.out.println("user = " + user);
    }

    @Test
    public void test02(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-core.xml");
        ArticleService bean = ctx.getBean(ArticleService.class);
        Article articleById = bean.getArticleById(15);
        System.out.println("user = " + articleById);
    }
}
