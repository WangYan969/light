package com.wangyan.light;

import com.wangyan.light.model.UserBean;
import com.wangyan.light.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LightApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
//        userService.login(1);
        userService.delete("wangyan");
        System.out.println("登录成功");
    }

}
