package com.example.ordercloud.controller;

import com.example.common.controller.AbstractTypedController;
import com.example.ordercloud.entity.OrderDetail;
import com.example.ordercloud.service.IOrderDetailService;
import com.example.common.util.QueryConditionUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "订单详情模块")
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController extends AbstractTypedController<OrderDetail,Long> {
    @Resource
    private IOrderDetailService orderDetailService;



    public OrderDetailController(IOrderDetailService orderDetailService1) {
        super.svcContext= orderDetailService1;
        orderDetailService=orderDetailService1;
        QueryConditionUtil<OrderDetail> queryConditionUtil=new QueryConditionUtil<OrderDetail>();
        super.queryConditionUtil=queryConditionUtil;
    }

    @GetMapping("/test")
    public Object getTest(){
        return "hello orderDetailcloud test";
    }
}
