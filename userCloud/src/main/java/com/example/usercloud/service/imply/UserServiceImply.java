package com.example.usercloud.service.imply;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.entity.noPersist.ResponseResult;
import com.example.usercloud.entity.User;
import com.example.usercloud.mapper.UserMapper;
import com.example.usercloud.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImply extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public ResponseResult<User> login(User user) {
        User user1 = userMapper.selectOneByUsernameUser(user.getUsername());
        if (user1.getPassword().equals(user.getPassword())){
            return new ResponseResult<User>(200,"登录成功",user1);
        }
        return new ResponseResult<User>(400,"登录失败",null);
    }
}
