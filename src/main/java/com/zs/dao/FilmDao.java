package com.zs.dao;

import com.zs.entity.Film;

import java.sql.Connection;
import java.sql.ResultSet;

public interface FilmDao {
    ResultSet get(Connection con);

    ResultSet get(Connection con,int filmId);

    int insert(Connection con,Film film);

    int delete(Connection con, int filmId);

    int update(Connection con,Film film);
}
