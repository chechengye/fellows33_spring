package com.weichuang.proxy;

import org.springframework.stereotype.Component;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("添加用户");
        int i= 1/0;
    }

    @Override
    public void updateUser() {
        System.out.println("修改用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }

    @Override
    public void findUser() {
        System.out.println("查询用户");
    }
}
