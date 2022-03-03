package com.t4rrega.injection.sqli.mybatis;

import com.t4rrega.injection.sqli.mybatis.bean.User;
import com.t4rrega.injection.sqli.mybatis.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;

public class MyBatisSqli {
    public static void main(String[] args) {

//        MyBatisSqli.getById("1 and 1=2 union select Host,User,1,authentication_string from mysql.user limit 1");
        MyBatisSqli.getById("1");

    }


    public static void getById(String id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getById(id);
        System.out.println("id: " + user.getId()  + ", username: " + user.getuserName() + ", password :" + user.getPassword());
        sqlSession.close();
    }
}
