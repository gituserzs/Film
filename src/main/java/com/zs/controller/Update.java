package com.zs.controller;

import com.zs.entity.Film;
import com.zs.service.impl.FilmServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Update extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FilmServiceImpl filmService = new FilmServiceImpl();
        int filmId = Integer.parseInt(req.getParameter("filmId"));
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        int languageId = Integer.parseInt(req.getParameter("name"));
        com.zs.entity.Film film = new Film();
        film.setFilmId(filmId);
        film.setTitle(title);
        film.setDescription(description);
        film.setLanguageId(languageId);
        int rs = filmService.update(film);
        if(rs != -1){
            req.getRequestDispatcher("/film").forward(req,resp);
        }
    }
}
