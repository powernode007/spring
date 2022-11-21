package com.bjpn.aop;

import org.springframework.stereotype.Component;

//目标类   主业务类
@Component
public class Hero {
    public void Q(){
        System.out.println("Q沉默打击");
    }
    public void W(){
        System.out.println("W护盾");
    }
    public void E(){
        System.out.println("E 大风车");
    }
    public void R(){
        System.out.println("R 大保健");
    }

}
