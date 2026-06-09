package com.studentmanagement.controller;

import com.studentmanagement.dao.UserDao;
import com.studentmanagement.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/signup")
public class SignUp extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("signup.jsp").forward(req,res);
    }

    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("uname");
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String department = req.getParameter("dept");
        String password = req.getParameter("pass");

        User user = new User();
        user.setUsername(username);
        user.setName(name);
        user.setAge(age);
        user.setDeptartment(department);
        user.setPassword(password);

        try {
            UserDao.register(user);
        } catch (SQLException | ClassNotFoundException e) {

            req.getRequestDispatcher("index.jsp").forward(req,res);
        }
    }
}
