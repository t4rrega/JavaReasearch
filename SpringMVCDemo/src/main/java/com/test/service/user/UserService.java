package com.test.service.user;

import com.test.entity.User;

public interface UserService {
    User login(String userCode, String password);
}

