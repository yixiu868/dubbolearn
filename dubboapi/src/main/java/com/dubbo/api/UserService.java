package com.dubbo.api;

import com.dubbo.entity.UserModel;

import javax.validation.constraints.NotBlank;
import java.util.List;

public interface UserService {

    UserModel findById(@NotBlank Long id);

    List<UserModel> listUser();
}
