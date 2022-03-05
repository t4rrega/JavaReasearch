package com.test.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JsonController {
    @RequestMapping(value = "/postjson", method = RequestMethod.GET)
    public String postJson(HttpServletRequest request) { return "postjson";}

    @RequestMapping(value = "/readjson", method = RequestMethod.POST)
    public String readJson(HttpServletRequest request) {
        String jsonStr = request.getParameter("jsonStr");
        System.out.println(jsonStr);

        Object obj = JSON.parseObject(jsonStr);
        System.out.println(obj);

        return "readjson";
    }

}
