package com.iclimit.blog.system.controller;

import com.iclimit.blog.common.domain.User;
import com.iclimit.blog.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by limit on 2018/08/29.
 * @author limit
 * user的控制器
 */
@RestController("/user")
public class UserController{

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void registerUser(@RequestBody User user){

        userService.addUser(user);
    }

    @GetMapping("/all")
    public String getUser(){
       return userService.getUser().getId().toString();
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello blog";
    }
}
