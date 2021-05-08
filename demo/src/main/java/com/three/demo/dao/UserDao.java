package com.three.demo.dao;

import com.three.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * dao层
 */
@Repository
public interface UserDao {
    User selectUser(@Param("userName")String userName, @Param("password")String password);
}
