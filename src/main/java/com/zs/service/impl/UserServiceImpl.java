package com.zs.service.impl;

import com.zs.dao.UserDao;
import com.zs.dao.impl.UserDaoImpl;
import com.zs.entity.User;
import com.zs.service.UserService;
import com.zs.util.jdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public boolean get(User user) {
        UserDao userDao = new UserDaoImpl();
        ResultSet resultSet = userDao.get(jdbcUtil.getConnection(), user);
        try {
            if (resultSet.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
