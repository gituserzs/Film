package com.zs.service.impl;

import com.zs.dao.impl.FilmDaoImpl;
import com.zs.entity.Film;
import com.zs.service.FilmService;
import com.zs.util.jdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmServiceImpl implements FilmService {
    @Override
    public List<Film> get() throws SQLException {
        FilmDaoImpl filmDao = new FilmDaoImpl();
        ResultSet resultSet = filmDao.get(jdbcUtil.getConnection());
        List<Film> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(new Film(resultSet.getInt("film_id"),
                    resultSet.getString("title"),
                    resultSet.getString("description"),
                    resultSet.getString("name")));
        }
        return list;
    }

    @Override
    public Film get(int filmId) throws SQLException {
        FilmDaoImpl filmDao = new FilmDaoImpl();
        ResultSet resultSet = filmDao.get(jdbcUtil.getConnection(), filmId);
        Film film = new Film();
        if(resultSet.next()) {
            film.setFilmId(resultSet.getInt("film_id"));
            film.setTitle(resultSet.getString("title"));
            film.setDescription(resultSet.getString("description"));
            film.setName(resultSet.getString("name"));
            return film;
        }
        return null;
    }

    @Override
    public int insert(Film film) {
        FilmDaoImpl filmDao = new FilmDaoImpl();
        int rs = filmDao.insert(jdbcUtil.getConnection(), film);
        return rs;
    }

    @Override
    public int delete(int filmId) {
        FilmDaoImpl filmDao = new FilmDaoImpl();
        int rs = filmDao.delete(jdbcUtil.getConnection(), filmId);
        return rs;
    }

    @Override
    public int update(Film film) {
        FilmDaoImpl filmDao = new FilmDaoImpl();
        int rs = filmDao.update(jdbcUtil.getConnection(), film);
        return rs;
    }
}
