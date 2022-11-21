package com.bjpn.service.impl;

import com.bjpn.mapper.ATMMapper;
import com.bjpn.service.ATMService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ATMServiceImpl implements ATMService {
    @Autowired
    ATMMapper atmMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor =Exception.class )
    public boolean saveMoneyService(String atmCode, double saveMoney) {

        return atmMapper.saveMoney(atmCode, saveMoney);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor =Exception.class )
    public boolean drawWithMoneyService(String atmCode, double drawWithMoney) {
        return atmMapper.drawWithMoney(atmCode, drawWithMoney);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor =Exception.class )
    @Override
    public boolean transferMoneyService(String atmCode, String transferCode, double transferMoney) {
        /*boolean  b = atmMapper.saveMoney(atmCode, transferMoney);
        boolean b1 = atmMapper.drawWithMoney(transferCode, transferMoney);*/
        boolean b =drawWithMoneyService(transferCode,transferMoney);
        boolean b1 = saveMoneyService(atmCode,transferMoney);
        if(b && b1){
            return true;
        }else{
            return false;
        }

    }
}
