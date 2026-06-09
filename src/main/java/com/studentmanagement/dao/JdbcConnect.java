package com.studentmanagement.dao;

import java.sql.*;

public class JdbcConnect {
    private final static String url = "jdbc:mysql://localhost:3306/students";
    private final static String user = "root";
    private final static String pass = "123456";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,user,pass);
    }
}