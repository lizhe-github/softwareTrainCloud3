package com.example.foodcloud.configuration;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.example.common.handler.AutoEntityFieldHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.example.mapper"})
public class MybatisPlusConfiguration {

    @Bean
    public MetaObjectHandler createMetaObjectHandler(){
        return new AutoEntityFieldHandler();
    }
}
