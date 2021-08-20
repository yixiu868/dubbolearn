package com.ww.provider.service.impl;

import com.ww.model.User;
import com.ww.service.UserService;

/**
 * @author xiaohua
 * @description 服务提供者实现具体
 * @date 2021-8-20 12:26
 */
public class UserServiceImpl implements UserService {

    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setUsername("张三");
        user.setTel("111");
        user.setAddress("北京");
        user.setPassword("123");
        user.setId(1);

        System.out.println("服务提供者返回user:" + user);

        return user;
    }
}
