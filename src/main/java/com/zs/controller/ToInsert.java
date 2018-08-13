package com.zs.controller;

import com.zs.entity.Language;
import com.zs.service.impl.LanguageServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToInsert extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LanguageServiceImpl languageService = new LanguageServiceImpl();
        try {
            List<Language> languages = languageService.get();
            req.setAttribute("languages",languages);
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/insert.jsp");
            rd.forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
