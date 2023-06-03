package com.example.businesscloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.entity.AbstractDomainEntity;
import lombok.Data;

@Data
@TableName("business")
public class Business extends AbstractDomainEntity {
    @TableId(value = "businessId",type = IdType.AUTO)
    private Long businessId;

    @TableField(value = "PASSWORD")
    private String password;

    @TableField(value = "businessName")
    private String businessName;

    @TableField(value = "businessAddress")
    private String businessAddress;

    @TableField(value = "businessExplain")
    private String businessExplain;

    @TableField(value = "startPrice")
    private Double startPrice;

    @TableField(value = "deliveryPrice")
    private Double deliveryPrice;

    private String avatal;
    private String backgroundimg;

}
