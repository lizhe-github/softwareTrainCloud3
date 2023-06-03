package com.example.admincloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.entity.AbstractDomainEntity;
import lombok.Data;

@Data
@TableName("admin")
public class Admin extends AbstractDomainEntity {


    @TableId(value = "adminId",type = IdType.AUTO)
    private Long adminId;

    @TableField(value = "adminName")
    private String adminName;

    @TableField(value = "PASSWORD")
    private String password;
}
