package com.example.common.handler;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
mybatis plus自动填充 设置自动填充实体字段创建和更新时间
 */
public class AutoEntityFieldHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
//        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();  //这个时间类型要和字段类型相同
        this.strictInsertFill(metaObject, "createdDate", Date.class, date);
        this.strictInsertFill(metaObject, "lastModifiedDate", Date.class, date);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
//        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        this.strictUpdateFill(metaObject, "lastModifiedDate", Date.class, date);
    }
}
