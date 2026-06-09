package com.studentmanagement.controller;

import com.studentmanagement.dao.UserDao;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class Login{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
        res.sendRedirect("login.jsp");
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("name");
        String pass = req.getParameter("pass");

        try{
            if(UserDao.login(username,pass)){
                HttpSession session = req.getSession();
                session.setAttribute("name",username);

                res.sendRedirect("dashboard.jsp");
            }
        }
        catch (SQLException | ClassNotFoundException | IOException e) {
            res.sendRedirect("index.jsp");
        }
    }
}
