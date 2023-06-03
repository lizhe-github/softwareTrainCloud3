package com.example.ordercloud.service.imply;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ordercloud.entity.OrderDetail;
import com.example.ordercloud.mapper.OrderDetailMapper;
import com.example.ordercloud.service.IOrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImply extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {
}
