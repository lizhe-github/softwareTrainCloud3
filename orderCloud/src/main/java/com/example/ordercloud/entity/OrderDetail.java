package com.example.ordercloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.entity.AbstractDomainEntity;
import lombok.Data;

@Data
@TableName("orderdetail")
public class OrderDetail extends AbstractDomainEntity {

    @TableId(value = "detailId",type = IdType.AUTO)
    private Long detailId;

    @TableField(value = "foodId")
    private Long foodId;

    @TableField(value = "foodName")
    private String foodName;

    @TableField(value = "foodPrice")
    private double foodPrice;
    private double cash;
    private int num;

    @TableField(exist = false)
    private Order order;
}
