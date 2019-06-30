package com.weichuang.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/weichuang/jdbc/applicationContext.xml")
public class JdbcTest {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jt;
    @Test
    public void testJdbc2(){
        String sql = "insert into user values(null , ? , ?)";
        jt.update(sql , "wangwu", "wangwu@163.com");
    }

    @Test
    public void testJdbc3(){
        String sql = "update user set username = ? where id = ?";
        jt.update(sql , "吴亦凡", 3);
    }

    @Test
    public void testJdbc4(){
        String sql = "delete from user where id = ?";
        jt.update(sql ,  3);
    }

    @Test
    public void testJdbc(){
        try {
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
          /*  dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql:///fellows33_spring");
            dataSource.setUser("root");
            dataSource.setPassword("root");
*/
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            String sql = "select * from user";
            List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {

                @Override
                public User mapRow(ResultSet rs, int i) throws SQLException {
                    User u = new User();
                    u.setId(rs.getInt("id"));
                    u.setUsername(rs.getString("username"));
                    u.setEmail(rs.getString("email"));
                    return u;
                }
            });

            for (User u : userList){
                System.out.println(u);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
