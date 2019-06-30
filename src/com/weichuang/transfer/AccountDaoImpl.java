package com.weichuang.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao{
    @Autowired
    private JdbcTemplate jt;
    @Override
    public void addMoney(int id, double money) {
        String sql = "update user set money = money + ? where id = ?";
        jt.update(sql , money , id);
    }

    @Override
    public void reduceMoney(int id, double money) {
        String sql = "update user set money = money - ? where id = ?";
        jt.update(sql , money , id);
    }
}
