package com.example.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class AbstractDomainEntity {
    @TableField(value = "createdDate",fill = FieldFill.INSERT)
    protected Date createdDate;
    @TableField(value = "lastModifiedDate",fill = FieldFill.INSERT_UPDATE)
    private Date lastModifiedDate;

}
