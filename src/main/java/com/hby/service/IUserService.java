package com.hby.service;

import com.hby.dto.Result;
import com.hby.entity.User;

public interface IUserService {
    Result queryUserByID(Long id);

    Result updateUser(User user);
}
