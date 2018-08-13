package com.zs.controller;

import com.zs.entity.Language;
import com.zs.service.impl.FilmServiceImpl;
import com.zs.service.impl.LanguageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Insert extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        String  languageId = req.getParameter("name");

        com.zs.entity.Film film = new com.zs.entity.Film();
        film.setTitle(title);
        film.setDescription(description);
        film.setLanguageId(Integer.parseInt(languageId));

        LanguageServiceImpl languageService = new LanguageServiceImpl();
        FilmServiceImpl filmService = new FilmServiceImpl();
        int rs = filmService.insert(film);
        if(rs != -1){
            req.getRequestDispatcher("/film").forward(req,resp);
        }
    }
}
