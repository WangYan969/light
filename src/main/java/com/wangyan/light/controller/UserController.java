package com.wangyan.light.controller;

import com.wangyan.light.model.UserBean;
import com.wangyan.light.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public UserBean getUser(int id){
        return userService.login(id);
    }

    @GetMapping("/deleteuser")
    public void deleteuser(String username){
        userService.delete(username);
    }

}
