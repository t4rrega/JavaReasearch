package com.test.controller;


import com.test.entity.User;
import com.test.service.user.UserService;
import com.test.tools.Constants;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 */
@Controller
public class LoginController {

    //log4j
    private  static  final Logger logger= Logger.getLogger(LoginController.class);

    //service层
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String welcome() {
        return "login";
    }

    //提交登陆表单，实现登陆功能
    @RequestMapping(value = "/doLogin")
    public String doLogin(@RequestParam(value = "userCode") String userCode,
                          @RequestParam(value = "userPassword") String password,
                          HttpSession session,
                          HttpServletRequest request){
        logger.debug("enter LoginController =====>doLogin method");
        //和数据库中的用户信息进行校验
        User loginUser = this.userService.login(userCode, password);
        if(loginUser !=null){//说明用户存在
            //使用session容器，把该用户放进去
            session.setAttribute(Constants.USER_SESSION,loginUser);
            //页面的跳转
            return "redirect:/frame";
        }else {//用户不存在
            //使用request容器，返回一个提示信息
            request.setAttribute("error","用户名或者密码错误");
            //页面的跳转
            return "login";
        }

    }

    @RequestMapping("/frame")
    public String frame(){
        return "frame";
    }

}