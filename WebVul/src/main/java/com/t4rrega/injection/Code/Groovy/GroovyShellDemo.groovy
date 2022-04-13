package com.t4rrega.injection.Code.Groovy

class GroovyShellDemo {
    static void main(String[] args) {
        GroovyShell groovyShell = new GroovyShell();
        String cmd = "\"open -a Calculator.app\".execute().text"
        groovyShell.evaluate(cmd)

    }
}
