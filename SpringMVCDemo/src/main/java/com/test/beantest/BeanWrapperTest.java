package com.test.beantest;

import com.test.entity.Person;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class BeanWrapperTest {
    public static void main(String[] args) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(new Person());

        // 属性注入
        beanWrapper.setPropertyValue("name", "l1uSha");

        Person person = (Person) beanWrapper.getWrappedInstance();

        String name = (String) beanWrapper.getPropertyValue("name");
        System.out.println(name);
    }
}
