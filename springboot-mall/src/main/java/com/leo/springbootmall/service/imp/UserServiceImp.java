package com.leo.springbootmall.service.imp;

import com.leo.springbootmall.dao.UserDao;
import com.leo.springbootmall.dto.UserRegisterRequest;
import com.leo.springbootmall.model.User;
import com.leo.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User gerUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
