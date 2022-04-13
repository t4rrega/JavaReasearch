package com.t4rrega.injection.Code.Groovy;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Groovy2 {
    public static void main(String[] args) throws Exception{
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("groovy");
        System.out.println(scriptEngine.eval("\"whoami\".execute().text"));
    }
}