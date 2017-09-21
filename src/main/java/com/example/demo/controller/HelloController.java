package com.example.demo.controller;

import com.example.demo.entiy.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @PostMapping("/he")
    public String say(@RequestParam("id") Integer id){
        return "获取的id:"+id;
    }

    public UserInfo getUserInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setUserName("小白");
        userInfo.setUserAge(10);
        userInfo.toString();

        return userInfo;
    }
}
