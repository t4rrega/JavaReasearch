package com.test.entity;
public class EvilBean {
    public EvilBean() {
        System.out.println("EvilBean constructor...");
    }
    public String name;
    public CommonBean commonBean;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommonBean getCommonBean() {
        return commonBean;
    }

    public void setCommonBean(CommonBean commonBean) {
        this.commonBean = commonBean;
    }
}
