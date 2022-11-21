package com.bjpn.Test;

import com.bjpn.bean.User1;
import com.bjpn.service.UserService1;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemo1 {
    @Test
    public void testService(){
        //需要创建UserService对象
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        UserService1 userService1 = (UserService1) beans.getBean("us");
        userService1.showUerService();
    }
    @Test
    public void testUser1(){
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring1.xml");
        /*User user = (User)beans.getBean("ux");*/
        User1 user1 = (User1)beans.getBean("user");
        System.out.println(user1);
    }
    @Test
    public void testUser2(){
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring1.xml");
        UserService1 userService1 = (UserService1)beans.getBean("userService");
        userService1.showUerService();
    }
}
