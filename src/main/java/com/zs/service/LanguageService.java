package com.zs.service;

import com.zs.entity.Language;

import java.sql.SQLException;
import java.util.List;

public interface LanguageService {
    List<Language> get() throws SQLException;
}
