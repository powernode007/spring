package com.bjpn.service;

import com.bjpn.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAllUserService();
    boolean userDelService(int userId);
}
