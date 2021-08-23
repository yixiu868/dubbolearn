package com.ww.consumer.service.impl;

import com.ww.consumer.service.UserProxyService;
import com.ww.model.User;
import com.ww.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xiaohua
 * @description TODO
 * @date 2021-8-22 22:53
 */
public class UserProxyServiceImpl implements UserProxyService {

    private static final Logger logger = LoggerFactory.getLogger(UserProxyServiceImpl.class);

    private UserService userService;

    @Override
    public User findUserById(Integer id) {
        logger.info("[userProxy]执行中...");
        return userService.findUserById(id);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
