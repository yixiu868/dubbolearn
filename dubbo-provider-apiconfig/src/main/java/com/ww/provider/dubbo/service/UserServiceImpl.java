package com.ww.provider.dubbo.service;

import org.apache.dubbo.config.annotation.Service;

import com.ww.model.User;
import com.ww.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("chy");
        return user;
    }

}
