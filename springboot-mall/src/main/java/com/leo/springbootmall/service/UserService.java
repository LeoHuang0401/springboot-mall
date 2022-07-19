package com.leo.springbootmall.service;


import com.leo.springbootmall.dto.UserLoginRequest;
import com.leo.springbootmall.dto.UserRegisterRequest;
import com.leo.springbootmall.model.User;

public interface UserService {

    User gerUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
