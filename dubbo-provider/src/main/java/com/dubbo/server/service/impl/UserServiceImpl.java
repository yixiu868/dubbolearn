package com.dubbo.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.UserService;
import com.dubbo.entity.UserModel;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @SuppressWarnings("serial")
    private List<UserModel> users = new ArrayList<UserModel>(){{
        add(new UserModel(1L, "熊大", "123"));
        add(new UserModel(2L, "熊二", "234"));
        add(new UserModel(3L, "熊三", "456"));
    }};

    @Override
    public UserModel findById(@NotBlank Long id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().get();
    }

    @Override
    public List<UserModel> listUser() {
        return users;
    }
}
