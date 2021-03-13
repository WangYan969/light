package com.wangyan.light.service;

import com.wangyan.light.model.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    UserBean login( int id);

    void delete( String userName);
}
