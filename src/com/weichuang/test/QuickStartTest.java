package com.weichuang.test;

import com.weichuang.annotation.Person;
import com.weichuang.domain.User;
import com.weichuang.util.Connection;
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

    @Test
    public void testFn3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:com/weichuang/set_zr/applicationContext.xml");
        User user = (User)applicationContext.getBean("user2");
        System.out.println(user);
    }

    @Test
    public void testFn4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:com/weichuang/set_zr/applicationContext.xml");
        Connection connection = (Connection)applicationContext.getBean("connection");
        System.out.println(connection);
    }

    @Test
    public void testFn5(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person person = (Person)applicationContext.getBean("person1");
        applicationContext.close();
    }
}
