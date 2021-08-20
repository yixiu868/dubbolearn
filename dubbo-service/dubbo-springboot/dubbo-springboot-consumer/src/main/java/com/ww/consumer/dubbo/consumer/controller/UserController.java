package com.ww.consumer.dubbo.consumer.controller;

import com.ww.model.User;
import com.ww.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiaohua
 * @description TODO
 * @date 2021-8-20 15:37
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @DubboReference
    private UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public String query() {
        logger.info("[消费者]调用接口");
        User user = userService.findUserById(1);
        logger.info("[消费者]接收到接口返回信息{}", user);
        return user.toString();
    }
}
