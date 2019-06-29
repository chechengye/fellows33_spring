package com.weichuang.test;

import com.weichuang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickStartTest {

    @Test
    public void testFn(){
       // User user = new User();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User)applicationContext.getBean("user");
        user.setName("张三");
        System.out.println(user);
    }
}
