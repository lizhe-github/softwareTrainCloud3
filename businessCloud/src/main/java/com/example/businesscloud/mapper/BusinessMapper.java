package com.example.businesscloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.businesscloud.entity.Business;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusinessMapper extends BaseMapper<Business> {
}
