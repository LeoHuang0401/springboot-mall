package com.leo.springbootmall.dao;


import com.leo.springbootmall.dto.UserRegisterRequest;
import com.leo.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
