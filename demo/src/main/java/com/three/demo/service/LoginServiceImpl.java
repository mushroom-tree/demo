package com.three.demo.service;

import com.three.demo.dao.UserDao;
import com.three.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    UserDao userDao;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public int login(String userName,String password){
        if(logger.isDebugEnabled()){
            logger.info("To modify role(name={}) to role(name={})");
        }


        User user = userDao.selectUser(userName,password);
        return user == null ? 0 : 1;
    }
}
