package com.bjpn.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//增强类   交叉业务类
@Component
//这是切面
@Aspect
public class ChainActive {
    //定义一个公开的无返回值的 无参的无方法体的函数  这就是切点名称
    @Pointcut("execution(* com.bjpn.aop.Hero.Q(..))")
    public void qBefore(){}
    //设置了切面方法的通知方式
    @Before("qBefore()")
    public void sayHi(){
        System.out.println("老马夫人真好");
    }
    @Pointcut("execution(* com.bjpn.aop..R(..))")
    public void rAfter(){}
    @After("rAfter()")
    public void sayBye(){
        System.out.println("溜了溜了");
    }

    @Pointcut("execution(* com.bjpn.aop.Hero.W(..))")
    public void wBefore(){}
    //设置了切面方法的通知方式
    @Before("wBefore()")
    public void sayChong(){
        System.out.println("我将带头冲锋");
    }
    @Pointcut("execution(* com.bjpn.aop.Hero.E(..))")
    public void eBefore(){}
    //设置了切面方法的通知方式
    @Before("eBefore()")
    public void sayZhuan(){
        System.out.println("爱的魔力转圈圈");
    }
}
