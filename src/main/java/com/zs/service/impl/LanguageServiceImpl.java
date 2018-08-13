package com.zs.service.impl;

import com.zs.dao.LanguageDao;
import com.zs.dao.impl.LanguageDaoImpl;
import com.zs.entity.Language;
import com.zs.service.LanguageService;
import com.zs.util.jdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LanguageServiceImpl implements LanguageService {
    @Override
    public List<Language> get() throws SQLException {
        LanguageDaoImpl languageDao = new LanguageDaoImpl();
        ResultSet resultSet = languageDao.get(jdbcUtil.getConnection());
        List<Language> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(new Language(resultSet.getString("name"),resultSet.getInt("language_id")));
        }
        return list;
    }
}
