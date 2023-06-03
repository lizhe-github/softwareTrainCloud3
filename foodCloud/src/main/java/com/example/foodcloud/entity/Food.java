package com.example.foodcloud.entity;


import com.baomidou.mybatisplus.annotation.*;
import com.example.common.entity.AbstractDomainEntity;
import lombok.Data;

@Data
@TableName("food")
public class Food extends AbstractDomainEntity {



    @TableId(value = "foodId",type = IdType.AUTO)
    private Long foodId;

    @TableField(value = "foodName")
    private String foodName;

    @TableField(value = "foodExplain")
    private String foodExplain;

    @TableField(value = "foodPrice")
    private Double foodPrice;

    @TableField(value = "businessId")
    private Long businessId;

    private String avatal;



}
