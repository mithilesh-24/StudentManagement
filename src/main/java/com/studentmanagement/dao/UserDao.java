package com.studentmanagement.dao;

import com.studentmanagement.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public static void register(User user) throws SQLException, ClassNotFoundException {
        String sql = "Insert Into student(username,name,age,department,password) values(?,?,?,?,?)";

            Connection connect = JdbcConnect.getConnection();
            PreparedStatement ps = connect.prepareStatement(sql);

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getName());
            ps.setInt(3,user.getAge());
            ps.setString(4,user.getDeptartment());
            ps.setString(5,user.getPassword());

            ps.executeUpdate(sql);
    }

    public static boolean login(String username,String pass) throws SQLException, ClassNotFoundException {
        Connection connect = JdbcConnect.getConnection();
        String sql = "SELECT * FROM user where username = ? AND password = ?";
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,pass);

        ResultSet rs = ps.executeQuery();

        return rs.next();
    }
}
