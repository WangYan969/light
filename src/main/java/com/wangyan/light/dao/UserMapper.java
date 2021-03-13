package com.wangyan.light.dao;

import com.wangyan.light.model.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    UserBean getUser(int id);

    void deleteUser(String userName);
}
