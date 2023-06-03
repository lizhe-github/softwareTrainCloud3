package com.example.ordercloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ordercloud.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {
}
