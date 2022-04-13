package com.test.controller;

import com.test.entity.EvilBean;
import org.apache.maven.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public void index(EvilBean evilBean, Model model) {
        System.out.println("============");
        System.out.println(evilBean);
        System.out.println("============");
    }
}
