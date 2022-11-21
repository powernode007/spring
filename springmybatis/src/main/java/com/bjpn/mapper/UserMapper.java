package com.bjpn.mapper;

import com.bjpn.bean.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();
    boolean  delUserById(int userId);
}
