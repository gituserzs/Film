package com.zs.controller;

import com.zs.service.impl.FilmServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Delete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int filmId = Integer.parseInt(req.getParameter("filmId"));
        FilmServiceImpl filmService = new FilmServiceImpl();
        int rs = filmService.delete(filmId);
        if(rs != -1){
            req.getRequestDispatcher("/film").forward(req,resp);
        }
    }
}
