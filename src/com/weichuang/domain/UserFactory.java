package com.weichuang.domain;

public class UserFactory {

    /**
     * 静态工厂创建
     * @return
     */
    public static User createUser(){
        return new User();
    }

    /**
     * 实例工厂创建
     * @return
     */
    public User createUser2(){
        return new User();
    }
}
