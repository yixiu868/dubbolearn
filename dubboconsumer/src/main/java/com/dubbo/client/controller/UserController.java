package com.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.UserService;
import com.dubbo.entity.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/findById/{id}")
    public UserModel findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping("/listUser")
    public List<UserModel> listUser() {

        if (null == userService) {
            System.out.println("userService实例为空");
        }

        return userService.listUser();
    }
}
