package com.example.mapperTest;

import com.example.usercloud.entity.User;
import com.example.usercloud.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        User user=new User();
        user.setUserId(null);
        user.setAddr("云南");
        user.setPhone("12356");
        user.setPostcode("post123");
        user.setPassword("123");
        user.setUsername("nick2");
        user.setRealname("李华");
        int insert = userMapper.insert(user);
        System.out.printf(String.valueOf(insert));
    }
}
