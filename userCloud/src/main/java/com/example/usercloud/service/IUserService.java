package com.example.usercloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.entity.noPersist.ResponseResult;
import com.example.usercloud.entity.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUserService extends IService<User> {

    public ResponseResult<User> login(User user);
}
