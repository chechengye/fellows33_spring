package com.weichuang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceProxyFactory implements InvocationHandler{

    private UserService us;

    public UserServiceProxyFactory(UserService us){
        this.us = us;
    }
    public UserService getUserService(){
        return (UserService)Proxy.newProxyInstance(UserServiceProxyFactory.class.getClassLoader() , us.getClass().getInterfaces() ,this );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启事务");
        Object invoke = method.invoke(us, args);
        System.out.println("关闭事务");
        return invoke;
    }
}
