package com.bjpn.dao.impl;

import com.bjpn.dao.UserDao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void showUser(){
        System.out.println("这是userDaoImpl中showUser方法----这是实现类1");
    }
}
