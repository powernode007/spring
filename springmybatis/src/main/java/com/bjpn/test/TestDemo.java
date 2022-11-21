package com.bjpn.test;


import com.bjpn.bean.User;
import com.bjpn.mapper.UserMapper;
import com.bjpn.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestDemo {
    @Test
    public void testSelectUser(){
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = (UserMapper)beans.getBean("userMapper");//mapper接口的实现类
        List<User> user1List = userMapper.getAllUser();
        for(User user : user1List){
            System.out.println(user);
        }
    }
    @Test
    public void testSelectUserService(){
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService =(UserService)beans.getBean("userServiceImpl");
        userService.findAllUserService();
    }
    @Test
    public void testDelUserService(){
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService =(UserService)beans.getBean("userServiceImpl");
        boolean b = userService.userDelService(8);
        if(b){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
    }

}
