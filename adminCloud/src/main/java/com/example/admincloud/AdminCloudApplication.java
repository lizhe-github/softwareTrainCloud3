package com.example.admincloud;


import com.example.feignApi.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration.class,basePackages = "com.example.feignApi.client") //clients = UserClient.class,
@MapperScan(basePackages = {"com.example.admincloud.mapper"})
@EnableDiscoveryClient  //todo nacos 开启注册发现功能 必须的注解
@SpringBootApplication
public class AdminCloudApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(AdminCloudApplication.class, args);
    }
}
