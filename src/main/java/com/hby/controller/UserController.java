package com.hby.controller;


import com.hby.entity.User;
import com.hby.service.IUserService;
import com.hby.dto.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    public IUserService userService;

    //增删改查写一写

    //根据id查询
    @GetMapping("/{id}")
    public Result queryByID(@PathVariable("id") Long id){


        return userService.queryUserByID(id);
    }

    //修改信息
    @PutMapping
    public Result updateUser(User user){


        return userService.updateUser(user);
    }

}
