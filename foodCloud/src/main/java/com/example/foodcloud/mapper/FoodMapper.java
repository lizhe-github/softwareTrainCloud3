package com.example.foodcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.foodcloud.entity.Food;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface FoodMapper extends BaseMapper<Food> {
}
