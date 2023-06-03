package com.example.usercloud.entity.noPersist;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "pattern")  //2.6springboot最好需要加spring-boot-configuration-processor依赖
public class TestEntityProperties {

    private String dateformat;
    private String name;
    private String id;
}
