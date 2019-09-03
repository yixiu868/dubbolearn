package com.dubbo.api;

import com.dubbo.entity.UserDao;

import javax.validation.constraints.NotBlank;
import java.util.List;

public interface UserService {

    UserDao findById(@NotBlank Long id);

    List<UserDao> listUser();
}
