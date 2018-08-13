package com.zs.controller;

import com.zs.dao.UserDao;
import com.zs.dao.impl.UserDaoImpl;
import com.zs.entity.User;
import com.zs.service.impl.UserServiceImpl;
import com.zs.util.jdbcUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        User user = new User();
        user.setFirstName(userName);
        HttpSession session = req.getSession();
        UserServiceImpl userService = new UserServiceImpl();
        if(userService.get(user)){
            session.setAttribute("user",user);
            RequestDispatcher rd = req.getRequestDispatcher("/film");
            rd.forward(req,resp);
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/error.jsp");
            rd.forward(req,resp);
        }
    }
}
