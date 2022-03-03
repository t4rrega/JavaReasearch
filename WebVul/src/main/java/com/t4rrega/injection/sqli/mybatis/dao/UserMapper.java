package com.t4rrega.injection.sqli.mybatis.dao;

import com.t4rrega.injection.sqli.mybatis.bean.User;

public interface UserMapper {
    User getById(String id);

}
