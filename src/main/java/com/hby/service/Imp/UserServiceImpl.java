package com.hby.service.Imp;


import com.hby.entity.User;
import com.hby.mapper.UserMapper;
import com.hby.service.IUserService;
import com.hby.dto.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public Result queryUserByID(Long id) {

        //eq("id",id)  第一个是数据库的列名，第二个是参数  select * from tb_users where id = ?
        User user = (User)query().eq("id",id).one();

        return Result.ok(user);
    }

    @Override
    @Transactional
    public Result updateUser(User user) {



        return null;
    }
}
