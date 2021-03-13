package com.wangyan.light.serviceImpl;

import com.wangyan.light.dao.UserMapper;
import com.wangyan.light.model.UserBean;
import com.wangyan.light.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean login(int id) {
        return userMapper.getUser(id);
    }

    @Override
    public void delete(String userName) {
        userMapper.deleteUser(userName);
    }

}
