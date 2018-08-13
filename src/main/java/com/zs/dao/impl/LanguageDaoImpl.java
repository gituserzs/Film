package com.zs.dao.impl;

import com.zs.dao.LanguageDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LanguageDaoImpl implements LanguageDao {
    @Override
    public ResultSet get(Connection con) {
        String sql = "select language_id,name from language";
        PreparedStatement ps;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
