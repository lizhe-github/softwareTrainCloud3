package com.example.servcieTest;

import com.example.usercloud.entity.User;
import com.example.usercloud.service.IUserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Resource
    private IUserService userServiceImply;
    @Test
    public void testInsert(){
        User user=new User();
        user.setUserId(null);
        user.setAddr("云南");
        user.setPhone("12356");
        user.setPostcode("post123");
        user.setPassword("123");
        user.setUsername("nick3");
        user.setRealname("李华");
        boolean save = userServiceImply.save(user);
        System.out.printf(String.valueOf(save));
    }
}
