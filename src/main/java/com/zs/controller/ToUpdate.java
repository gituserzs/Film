package com.zs.controller;

import com.zs.entity.Film;
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
import java.util.logging.Handler;

public class ToUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FilmServiceImpl filmService = new FilmServiceImpl();
        LanguageServiceImpl languageService = new LanguageServiceImpl();
        int film_id = Integer.parseInt(req.getParameter("filmId"));
        Film film = null;
        try {
            film = filmService.get(film_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("film",film);
        List<Language> languages = null;
        try {
            languages = languageService.get();
            req.setAttribute("languages",languages);
            req.getRequestDispatcher("/WEB-INF/update.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
