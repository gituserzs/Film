package com.zs.dao;

import com.zs.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;

public interface UserDao {
    ResultSet get(Connection con ,User user);
}
