package com.weichuang.transfer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/weichuang/transfer/applicationContext.xml")
public class TransferTest {

    @Resource(name = "accountService")
    private AccountService accountService;
    @Test
    public void testTransfer(){
        accountService.transfer(1 , 2, 100);
    }
}
