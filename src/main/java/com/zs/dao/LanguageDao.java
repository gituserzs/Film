package com.zs.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public interface LanguageDao {
    ResultSet get(Connection con);
}
