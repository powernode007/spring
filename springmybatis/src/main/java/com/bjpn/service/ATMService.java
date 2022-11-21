package com.bjpn.service;

public interface ATMService {
    //存钱
    boolean saveMoneyService(String atmCode,double saveMoney);
    //取钱
    boolean drawWithMoneyService(String atmCode,double drawWithMoney);
    //转账
    boolean transferMoneyService(String atmCode,String transferCode,double transferMoney);
}
