package com.gem.demo.control;


import com.gem.demo.entity.User;
import com.gem.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControl {

    @Autowired
    private UserService service;

    @RequestMapping("/userIfors")
    public List<User> getaAllUser(){
        //无jsp，将返回值以json的形式在页面显示
        return service.userList();
    }
}
