package com.gem.demo.service;


import com.gem.demo.dao.UserMapper;
import com.gem.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList(){
        return userMapper.userList();
    }
}
