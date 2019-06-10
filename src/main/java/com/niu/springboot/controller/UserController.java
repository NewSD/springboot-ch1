package com.niu.springboot.controller;

import com.niu.springboot.bean.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ami on 2019/6/10.
 */
@RestController
public class UserController {

    @Autowired
    Users users;

    @GetMapping("/users")
    public String users(){
        return users.toString();
    }

}
