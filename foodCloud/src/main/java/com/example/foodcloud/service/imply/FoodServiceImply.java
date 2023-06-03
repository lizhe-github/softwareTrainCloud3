package com.example.foodcloud.service.imply;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.foodcloud.entity.Food;
import com.example.foodcloud.mapper.FoodMapper;
import com.example.foodcloud.service.IFoodService;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImply extends ServiceImpl<FoodMapper, Food> implements IFoodService {
}
