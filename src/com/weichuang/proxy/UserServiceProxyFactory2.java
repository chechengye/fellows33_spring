package com.weichuang.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 */
public class UserServiceProxyFactory2 implements MethodInterceptor{


    public UserService getUserService(){
        Enhancer en = new Enhancer(); //生成动态代理对象的对象
        en.setSuperclass(UserServiceImpl.class);//指定被代理类
        en.setCallback(this);//做增强
        UserService us = (UserService)en.create(); //创建代理对象
        return us;
    }


    @Override
    public Object intercept(Object proxyObj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");
        methodProxy.invokeSuper(proxyObj , args);
        System.out.println("关闭事务");
        return null;
    }
}
