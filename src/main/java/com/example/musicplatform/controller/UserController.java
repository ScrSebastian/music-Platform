package com.example.musicplatform.controller;


import com.example.musicplatform.entity.User;
import com.example.musicplatform.response.ResponseInfo;

import com.example.musicplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/listUsers")
    public ResponseInfo listUsers() {
        List<User> users = userService.listUsers();
        return ResponseInfo.success(users);
    }

    @GetMapping("/{pid}")
    public ResponseInfo getUserById(@PathVariable("pid") Long pid) {
        if (pid == null) {
            return ResponseInfo.fail("参数为空");
        }
        User user = userService.getUserById(pid);
        if (user != null) {
            return ResponseInfo.success(user);
        } else {
            return ResponseInfo.fail("你所查找的用户不存在");
        }
    }
}
