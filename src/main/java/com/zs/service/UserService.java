package com.zs.service;

import com.zs.entity.User;

import java.sql.Connection;

public interface UserService {
    boolean get(User user);
}
