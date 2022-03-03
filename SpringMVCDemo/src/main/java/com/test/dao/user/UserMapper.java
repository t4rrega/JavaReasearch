package com.test.dao.user;

import com.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/*
* */
@Mapper
public interface UserMapper {

    //根据用户名获得用户
    public User getUserByUserCode(@Param("userCode") String userCode);

}
