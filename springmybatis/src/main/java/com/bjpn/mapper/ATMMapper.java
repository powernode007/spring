package com.bjpn.mapper;


import org.apache.ibatis.annotations.Param;

public interface ATMMapper {
    //存钱
    boolean saveMoney(@Param("atmCode") String atmCode, @Param("saveMoney") double saveMoney);
    //取钱
    boolean drawWithMoney(@Param("atmCode") String atmCode, @Param("drawWithMoney") double drawWithMoney);

}
