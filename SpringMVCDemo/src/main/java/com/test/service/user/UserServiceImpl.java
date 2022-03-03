package com.test.service.user;


import com.test.controller.LoginController;
import com.test.dao.user.UserMapper;
import com.test.entity.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

    //log4j
    private  static  final Logger logger1= Logger.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;


    //登陆
    @Override
    public User login(String userCode, String password) {

        logger1.debug("enter UserServiceImpl  =====>login method  param: userCode="+userCode
                +" password= "+password);
        User user = userMapper.getUserByUserCode(userCode);
        logger1.debug("enter UserServiceImpl  =====>login method  " +
                "return: user=:user.id"+user.getId()+
                "  user.userCode="+user.getUserCode()+
                " user.userName="+user.getUserName());

        if(user!=null && !user.getUserPassword().equals(password)){
            //当用户存在，但是密码不一致，赋值为null
            user=null;
        }
        return user;
    }
}

