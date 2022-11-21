package com.bjpn.Test;

import com.bjpn.bean.User1;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemo {
    @Test
    public void testUser(){
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        //User user = (User)beans.getBean("u");
        User1 user1 = beans.getBean(User1.class);//对象创建的权利在spring容器中 我们只是通过容器 获取对象
        //IOC:控制反转  对象创建的权利交给别人  我们只是使用
        user1.setUname("大郎");
        System.out.println(user1);
    }
    @Test
    public void testUser1(){
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        User1 user1 = (User1)beans.getBean("u1");
       // User user = beans.getBean(User.class);//对象创建的权利在spring容器中 我们只是通过容器 获取对象
        //IOC:控制反转  对象创建的权利交给别人  我们只是使用
        //user.setUname("大郎");
        System.out.println(user1);
    }
    @Test
    public void testUser2(){
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        User1 user1 = (User1)beans.getBean("u2");
        //IOC:控制反转  对象创建的权利交给别人  我们只是使用
        System.out.println(user1);
    }
}
