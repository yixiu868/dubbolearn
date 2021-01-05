package com.ww.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ww.model.User;
import com.ww.service.UserService;

@Controller
@RequestMapping("/test")
public class TestController {

    @Reference
    private UserService userService;
    
    
    @RequestMapping("/test001")
    @ResponseBody
    public User getUser() {
        System.out.println("执行了test001");
        User user = userService.findUserById(1);
        return user;
    }
}
