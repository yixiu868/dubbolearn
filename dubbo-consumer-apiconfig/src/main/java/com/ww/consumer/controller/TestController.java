package com.ww.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public User getUser(@RequestParam("id") Integer id) {
        System.out.println("执行了test001, id = " + id);
        User user = userService.findUserById(id);
        return user;
    }
}
