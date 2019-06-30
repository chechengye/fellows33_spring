package com.weichuang.test;

import com.weichuang.annotation.Person;
import com.weichuang.domain.User;
import com.weichuang.proxy.UserService;
import com.weichuang.proxy.UserServiceImpl;
import com.weichuang.proxy.UserServiceProxyFactory;
import com.weichuang.proxy.UserServiceProxyFactory2;
import com.weichuang.util.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class QuickStartTest {

    @Autowired
    private Person person;

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

    @Test
    public void testFn6(){
        System.out.println(person);
    }
    @Test
    public void testFn7(){
        /*UserService us = new UserServiceImpl(); //被代理对象
        UserServiceProxyFactory userServiceProxyFactory = new UserServiceProxyFactory(us); //代理工厂
        UserService usProxy = userServiceProxyFactory.getUserService(); //返回的是代理后的对象，代理对象
        usProxy.addUser();
        System.out.println(usProxy instanceof UserServiceImpl);*/
    }

    @Test
    public void testFn8(){
        UserServiceProxyFactory2 userServiceProxyFactory = new UserServiceProxyFactory2(); //代理工厂
        UserService usProxy = userServiceProxyFactory.getUserService(); //返回的是代理后的对象，代理对象
        usProxy.addUser();
        System.out.println(usProxy instanceof UserServiceImpl);
    }
}
