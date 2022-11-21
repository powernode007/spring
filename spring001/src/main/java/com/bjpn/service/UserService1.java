package com.bjpn.service;


import com.bjpn.bean.User1;
import com.bjpn.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public  class UserService1 {
    /*按照类型注入  注解会自动去找UserDao类型的类 进行依赖注入
        前提 依赖类和被依赖类都要被spring容器管理
    * */
    /*@Autowired
    @Qualifier("userDaoImpl")*/
    /*他是jdk的依赖注入注解  它也是用类型注入*/
    @Resource(name="userDaoImpl")
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void showUerService(){
       // UserDao userDao = new UserDao();//从容器中获取userDao对象
        userDao.showUser();
    }



}
