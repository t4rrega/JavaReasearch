package com.test.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {
    @ResponseBody
    @RequestMapping(value = "/bean", method = RequestMethod.POST)
    public Object hello(@RequestParam("code")String code) throws Exception {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        System.out.println(code);
        Object object = JSON.parse(code);
        return code + "->JSON.parseObject()->" + object;
    }
}