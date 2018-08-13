package com.zs.dao.impl;

import com.zs.dao.FilmDao;
import com.zs.entity.Film;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmDaoImpl implements FilmDao {
    private void close(Connection con){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public ResultSet get(Connection con) {
        String sql = "SELECT f.film_id,f.title,f.description,l.name " +
                "FROM sakila.film f ,sakila.language l " +
                "WHERE f.language_id = l.language_id;";
        PreparedStatement ps ;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public ResultSet get(Connection con, int filmId) {
        String sql = "SELECT f.film_id,f.title,f.description,l.name " +
                "FROM sakila.film f ,sakila.language l " +
                "WHERE f.language_id = l.language_id AND f.film_id = ?;";
        PreparedStatement ps ;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,filmId);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insert(Connection con,Film film) {
        String sql = "insert into film(title,description,language_id) values(?,?,?)";
        PreparedStatement ps ;
        int rs = -1;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,film.getTitle());
            ps.setString(2,film.getDescription());
            ps.setInt(3,film.getLanguageId());
            rs = ps.executeUpdate();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int delete(Connection con, int filmId) {
        String sql = "delete from film where film_id = ?";
        PreparedStatement ps;
        int rs = -1;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,filmId);
            rs = ps.executeUpdate();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public int update(Connection con,Film film){
        String sql = "UPDATE film SET title=?,description=?,language_id=? where film_id = ?";
        PreparedStatement ps;
        int rs = -1;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,film.getTitle());
            ps.setString(2,film.getDescription());
            ps.setInt(3,film.getLanguageId());
            ps.setInt(4,film.getFilmId());
            rs = ps.executeUpdate();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
