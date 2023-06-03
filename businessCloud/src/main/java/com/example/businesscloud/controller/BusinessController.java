package com.example.businesscloud.controller;

import com.example.businesscloud.entity.Business;
import com.example.businesscloud.service.IBusinessService;
import com.example.common.controller.AbstractTypedController;
import com.example.common.util.QueryConditionUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "商家模块")
@RestController
@RequestMapping("/business")
public class BusinessController extends AbstractTypedController<Business,Long> {

    @Resource
    private IBusinessService businessService;

    public BusinessController(IBusinessService businessService1) {
        this.svcContext= businessService1;
        businessService=businessService1;
        QueryConditionUtil<Business> queryConditionUtil=new QueryConditionUtil<Business>();
        super.queryConditionUtil=queryConditionUtil;
    }
    @GetMapping("/test")
    public Object getTest(){
        return "hello businesscloud test";
    }

}
