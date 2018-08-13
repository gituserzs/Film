package com.zs.service;

import com.zs.entity.Film;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface FilmService {
    List<Film> get() throws SQLException;
    Film get(int filmId) throws SQLException;
    int insert(Film film);
    int delete(int filmId);
    int update(Film film);
}
