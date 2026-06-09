package com.studentmanagement.dao;


import java.sql.*;

public class JdbcConnect {
    private static Connection connect;
    static void createConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String pass = "123456";

        Class.forName("com.mysql.cj.jdbc.Driver");
        connect = DriverManager.getConnection(url,user,pass);

        System.out.println("Created connect object Successfull");
    }
    static Statement getStatement() throws SQLException {
        System.out.println("Created statement successfully");
        return connect.createStatement();
    }

    static PreparedStatement getPreparedStatement(String sql) throws SQLException {
        System.out.println("Created prepared statement successfully");
        return connect.prepareStatement(sql);
    }

    static void closeConnection() throws SQLException {
        connect.close();
    }

}
