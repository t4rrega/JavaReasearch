package com.t4rrega.injection.sqli.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementSqli {
    public static void main(String[] args) throws Exception {
//        PreparedStatementSqli.UnsafeIn("1,2) or 1=1#");
        PreparedStatementSqli.SafeSelect("admin' or 1=1 #", "unknown");
    }

    public static void SafeSelect(String username, String password) throws Exception {
        Connection connection = JdbcSqli.connector();

        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getObject("id") + ", username=" + resultSet.getObject("username") + ", password=" + resultSet.getObject("password"));
        }

        preparedStatement.close();
        connection.close();
    }

    public static void UnsafeSplicing(String username, String password) throws Exception {
        Connection connection = JdbcSqli.connector();

        String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
        System.out.println(sql);

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getObject("id") + ", username=" + resultSet.getObject("username") + ", password=" + resultSet.getObject("password"));
        }

        preparedStatement.close();
        connection.close();
    }

    public static void UnsafeIn(String id) throws Exception {
        Connection connection = JdbcSqli.connector();

        String Id = id;
        String sql = "delete from user where id in(" + Id + ")";
        System.out.println(sql);

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.execute();

        preparedStatement.close();
        connection.close();
    }

    public static void UnsafeOrderBy(String username, String password) throws Exception {
        Connection connection = JdbcSqli.connector();

        String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
        System.out.println(sql);

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getObject("id") + ", username=" + resultSet.getObject("username") + ", password=" + resultSet.getObject("password"));
        }

        preparedStatement.close();
        connection.close();
    }
}
