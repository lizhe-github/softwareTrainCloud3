package com.example.admincloud.controller;

import com.example.common.controller.AbstractTypedController;
import com.example.admincloud.entity.Admin;
import com.example.admincloud.service.IAdminService;
import com.example.common.util.QueryConditionUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "管理员模块")
@RestController
@RequestMapping("/admin")
public class AdminController extends AbstractTypedController<Admin,Long> {

    @Resource
    private IAdminService adminService;

    public AdminController(IAdminService adminService1) {
        this.svcContext= adminService1;
        adminService=adminService1;
        QueryConditionUtil<Admin> queryConditionUtil=new QueryConditionUtil<Admin>();
        super.queryConditionUtil=queryConditionUtil;
    }
    @GetMapping("/test")
    public Object getTest(){
        return "hello admincloud test";
    }
}
