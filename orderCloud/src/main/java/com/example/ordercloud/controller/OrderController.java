package com.example.ordercloud.controller;

import com.example.common.controller.AbstractTypedController;
import com.example.ordercloud.entity.Order;
import com.example.ordercloud.service.IOrderService;
import com.example.common.util.QueryConditionUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "订单模块")
@RestController
@RequestMapping("/order")
public class OrderController extends AbstractTypedController<Order,Long> {

    @Resource
    private IOrderService orderService;



    public OrderController(IOrderService orderService1) {
        super.svcContext= orderService1;
        orderService=orderService1;
        QueryConditionUtil<Order> queryConditionUtil=new QueryConditionUtil<Order>();
        super.queryConditionUtil=queryConditionUtil;
    }

    @GetMapping("/test")
    public Object getTest(){
        return "hello ordercloud test";
    }
}
