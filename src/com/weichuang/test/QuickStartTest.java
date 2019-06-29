package com.weichuang.test;

import com.weichuang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickStartTest {

    @Test
    public void testFn(){
       // User user = new User();
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User)applicationContext.getBean("user3");
        System.out.println(user);
    }

    @Test
    public void testFn2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:com/weichuang/set_zr/applicationContext.xml");
        User user = (User)applicationContext.getBean("user");
        System.out.println(user);
    }
}
