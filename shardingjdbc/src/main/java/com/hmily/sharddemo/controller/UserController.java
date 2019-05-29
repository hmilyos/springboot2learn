package com.hmily.sharddemo.controller;

import com.google.gson.Gson;
import com.hmily.sharddemo.domain.UserEntity;
import com.hmily.sharddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Date 2019/5/29 8:40
 **/
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    private int id = 4;

    @GetMapping("save")
    public String saveUser() {
        UserEntity user = new UserEntity(null, "张三" + (++id), 20 + id);
        userService.save(user);
        return "success";
    }

    @GetMapping("getUser")
    public String getUsers() {
        List<UserEntity> users = userService.findAll();
        return new Gson().toJson(users);
    }

    @GetMapping("get")
    public UserEntity getOne(int id){
        UserEntity user = userService.getOne(id);
        return user;
    }
}
