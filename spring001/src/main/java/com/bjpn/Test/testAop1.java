package com.bjpn.Test;


import com.bjpn.aop.Hero;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAop1 {
    //注解插入切面
    @Test
    public void testHero() {
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("springaop1.xml");
        Hero hero = (Hero) beans.getBean("hero");

        hero.Q();
        hero.W();
        hero.E();
        hero.R();

    }

    //配置文件插入切面
    @Test
    public void testHero1() {
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("springaop.xml");
        Hero hero = (Hero) beans.getBean("h");

       hero.Q();
       hero.W();
       hero.E();
       hero.R();


    }
}
