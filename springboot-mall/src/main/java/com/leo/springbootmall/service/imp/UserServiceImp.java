package com.leo.springbootmall.service.imp;

import com.leo.springbootmall.dao.UserDao;
import com.leo.springbootmall.dto.UserLoginRequest;
import com.leo.springbootmall.dto.UserRegisterRequest;
import com.leo.springbootmall.model.User;
import com.leo.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImp implements UserService {


    private final static Logger log = LoggerFactory.getLogger(UserServiceImp.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User gerUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        //檢查註冊的 email
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());

        if (user != null){
            log.warn("該 email {} 已經被註冊" , userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //使用MD5 生成密碼的雜湊值
        String hashedPassword  = DigestUtils.md5DigestAsHex(userRegisterRequest.getPassword().getBytes());
        userRegisterRequest.setPassword(hashedPassword);

        //創建帳號
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User login(UserLoginRequest userLoginRequest) {
        User user = userDao.getUserByEmail(userLoginRequest.getEmail());

        //檢查user 是否存在
        if (user == null) {
            log.warn("該email {} 尚未註冊", userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //使用MD5 生成密碼的雜湊值
        String hasedPassword = DigestUtils.md5DigestAsHex(userLoginRequest.getPassword().getBytes());


        //比較密碼
        if (user.getPassword().equals(hasedPassword)){
            return user;
        }else {
            log.warn("email的密碼 不正確",userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

    }
}
