package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.UserService;
import com.dubbo.entity.UserDao;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @SuppressWarnings("serial")
    private List<UserDao> users = new ArrayList<UserDao>(){{
        add(new UserDao(1L, "熊大", "123"));
        add(new UserDao(2L, "熊二", "234"));
        add(new UserDao(3L, "熊三", "456"));
    }};

    @Override
    public UserDao findById(@NotBlank Long id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().get();
    }

    @Override
    public List<UserDao> listUser() {
        return users;
    }
}
