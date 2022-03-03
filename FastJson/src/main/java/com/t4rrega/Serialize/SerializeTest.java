package com.t4rrega.Serialize;

import com.alibaba.fastjson.JSON;


public class SerializeTest {
    public static void main(String[] args) {
        String jsonstring ="{\"@type\":\"com.t4rrega.bean.Person\",\"name\":\"t4rrega\",\"age\":80}";
        JSON.parseObject(jsonstring);
    }
}
