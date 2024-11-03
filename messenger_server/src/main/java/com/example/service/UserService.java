package com.example.service;

import com.example.dto.UserLoginDTO;
import com.example.entity.User;

public interface UserService {

    /**
     * 用户登录
     * @param userLoginDTO
     * @return
     */
    User login(UserLoginDTO userLoginDTO);
}
