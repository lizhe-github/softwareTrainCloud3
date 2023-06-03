package com.example.usercloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.usercloud.entity.User;


public interface UserMapper extends BaseMapper<User> {

    public User selectOneByUsernameUser(String username);
}
