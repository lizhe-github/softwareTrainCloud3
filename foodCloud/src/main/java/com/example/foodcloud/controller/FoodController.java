package com.example.foodcloud.controller;

import com.example.common.controller.AbstractTypedController;
import com.example.foodcloud.entity.Food;

import com.example.foodcloud.service.IFoodService;

import com.example.common.util.QueryConditionUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@Tag(name = "食品模块")
@RestController
@RequestMapping("/food")
public class FoodController extends AbstractTypedController<Food,Long> {


    @Resource
    private IFoodService foodService;



    public FoodController(IFoodService foodService1) {
        super.svcContext= foodService1;
        foodService=foodService1;
        QueryConditionUtil<Food> queryConditionUtil=new QueryConditionUtil<Food>();
        super.queryConditionUtil=queryConditionUtil;
    }

    @GetMapping("/test")
    public Object getTest(){
        return "hello foodcloud test";
    }

}
