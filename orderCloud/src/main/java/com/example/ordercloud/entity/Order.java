package com.example.ordercloud.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.entity.AbstractDomainEntity;
import lombok.Data;

@Data
@TableName("orders")
/**
 * 订单表这个和其它表具有 一对多干系,这里暂时先不管,后面可以的话在改一下设计,这里先不管下订单这部分了
 */
public class Order extends AbstractDomainEntity {

    @TableId(value = "orderId",type = IdType.AUTO)
    private Long orderId;

    @TableField(value = "userId")
    private Long userId;

    @TableField(value = "businessId")
    private Long businessId;

    @TableField(value = "businessName")
    private String businessName;

    private String addr;
    private String receivename;
    private String phone;
    private double totalcash;

    @TableField(value = "statu")
    private int status;
}
