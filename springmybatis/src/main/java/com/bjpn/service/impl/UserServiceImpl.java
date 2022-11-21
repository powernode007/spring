package com.bjpn.service.impl;

import com.bjpn.bean.User;
import com.bjpn.mapper.UserMapper;
import com.bjpn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Transactional在类上  写在service类上  当前类中的所有方法都会被引入事务
//默认的事务传播行为是：REQUIRED
//@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    //在方法上引入注解  表明当前方法的事务传播行为
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<User> findAllUserService() {
        List<User> user1List = userMapper.getAllUser();
        for(User user : user1List){
            System.out.println("UserServiceImpl中的user = " + user);
        }
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public boolean userDelService(int userId) {
        boolean b = userMapper.delUserById(userId);
        return b;
    }
}
