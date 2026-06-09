package com.studentmanagement.controller;

import com.studentmanagement.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("login.jsp").forward(req,res);
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
            else{
                res.sendRedirect("index.jsp");
            }
        }
        catch (SQLException | ClassNotFoundException | IOException e) {
            System.out.println("fail");
            res.sendRedirect("index.jsp");
        }
    }
}
