package com.example.ordercloud.service.imply;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ordercloud.entity.Order;
import com.example.ordercloud.mapper.OrderMapper;
import com.example.ordercloud.service.IOrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImply extends ServiceImpl<OrderMapper, Order> implements IOrderService {
}
