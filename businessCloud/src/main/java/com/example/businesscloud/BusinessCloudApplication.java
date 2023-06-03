package com.example.businesscloud;


import com.example.feignApi.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration.class,basePackages = "com.example.feignApi.client") //clients = UserClient.class,
@MapperScan(basePackages = {"com.example.businesscloud.mapper"})
@EnableDiscoveryClient  //todo nacos 开启注册发现功能 必须的注解
@SpringBootApplication
public class BusinessCloudApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(BusinessCloudApplication.class, args);
    }
}
