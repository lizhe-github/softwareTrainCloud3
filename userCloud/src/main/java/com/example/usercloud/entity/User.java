package com.example.usercloud.entity;


import com.baomidou.mybatisplus.annotation.*;
import com.example.common.entity.AbstractDomainEntity;
import lombok.Data;

@Data
@TableName("user")
public class User extends AbstractDomainEntity {

    //type = IdType.AUTO表示跟随数据库主键自增，所以数据库的该字段必须要有auto inc  如果让mybatis plus雪花算法生成ID则不是这个类型
    @TableId(value = "userId",type = IdType.AUTO)  //value设置主角按字段名就不要笑傲TableField了
//    @TableField(value = "userId")
    private Long userId;


    private String username;
    @TableField(value = "PASSWORD")
    private String password;
    private String realname;
    private String addr;
    private String phone;
    private String postcode;

}
