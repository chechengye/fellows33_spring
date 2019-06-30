package com.weichuang.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDao {

    @Autowired
    private JdbcTemplate jt;
    //加钱方法
    public void addMoney(int id , double money){
        String sql = "update user set money = money + ? where id = ?";
        jt.update(sql , money , id);
    }

    //减钱方法
    public void reduceMoney(int id , double money){
        String sql = "update user set money = money - ? where id = ?";
        jt.update(sql , money , id);
    }

}
