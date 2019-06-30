package com.weichuang.aop;

import com.weichuang.proxy.UserService;
import com.weichuang.proxy.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/weichuang/aop/applicationContext.xml")
public class TestAop {

    @Resource(name = "userService")
    private UserService userService;
    @Test
    public void testFn(){
        userService.updateUser();
    }
}
