package com.t4rrega.injection.sqli.jdbc;

import java.sql.*;

public class JdbcSqli {
    public static void main(String[] args) throws Exception {
//        JdbcSqli.select("admin' #", "admin123");
        JdbcSqli.select("admin' OR 1=1#", "123456");
    }

    public static void select(String username, String password) throws Exception {
        Connection connection = JdbcSqli.connector();
        Statement statement = connection.createStatement();

        String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getObject("id") + ", username=" + resultSet.getObject("username") + ", password=" + resultSet.getObject("password"));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }

    public static Connection connector() throws Exception {
        final String url = "jdbc:mysql://localhost:3306/testsqli?useUnicode=true&characterEncoding=UTF-8&useSSL=true";
        final String mysqlusername = "root";
        final String mysqlpassword = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, mysqlusername, mysqlpassword);

        return connection;
    }
}
