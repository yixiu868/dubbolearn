package com.ww.provider.dubbo.provider.impl;

import com.ww.model.User;
import com.ww.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaohua
 * @description 提供者接口实现
 * @date 2021-8-20 15:24
 */
@DubboService
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User findUserById(Integer id) {
        logger.info("[提供者]进入调用方法...");
        User user = new User();
        user.setId(1);
        user.setPassword("123");
        user.setAddress("北京");
        user.setTel("010");
        user.setUsername("李四");

        try {
            logger.info("[提供者]开始睡眠了...");
            TimeUnit.SECONDS.sleep(10);
            logger.info("[提供者]睡眠结束了...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
