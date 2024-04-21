package com.example.musicplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicplatform.entity.User;
import com.example.musicplatform.entity.Userlibrary;
import com.example.musicplatform.mapper.UserMapper;
import com.example.musicplatform.mapper.UserlibraryMapper;
import com.example.musicplatform.service.UserService;
import com.example.musicplatform.service.UserlibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }
}
