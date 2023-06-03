package com.example.usercloud.controller;

import com.example.common.controller.AbstractTypedController;
import com.example.common.entity.noPersist.ResponseResult;
import com.example.usercloud.entity.User;

import com.example.usercloud.entity.noPersist.TestEntityProperties;
import com.example.usercloud.service.IUserService;

import com.example.common.util.QueryConditionUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "用户模块")
@RestController
@RequestMapping("/user")
public class UserController extends AbstractTypedController<User,Long> {


    @Resource
    private IUserService userService;

    @Resource
    private TestEntityProperties testEntityProperties;



    public UserController(IUserService userService1) {
        super.svcContext= userService1;
        userService=userService1;
        QueryConditionUtil<User> queryConditionUtil=new QueryConditionUtil<User>();
        super.queryConditionUtil=queryConditionUtil;
    }

    @Operation(summary = "测试接口")
    @GetMapping("/test")
    public Object getTest(){
        System.out.println(testEntityProperties);
        return "hello usercloud test";
    }

    @Operation(summary = "用户登录")
    @PostMapping("/login")
    public ResponseResult<User> login(@RequestBody User user){
        ResponseResult<User> login = userService.login(user);
        return login;
    }

}
