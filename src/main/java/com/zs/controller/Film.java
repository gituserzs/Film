package com.zs.controller;

import com.zs.service.impl.FilmServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Film extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FilmServiceImpl filmService = new FilmServiceImpl();
        try {
            List<com.zs.entity.Film> films = filmService.get();
            req.setAttribute("films",films);
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/film.jsp");
            rd.forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
