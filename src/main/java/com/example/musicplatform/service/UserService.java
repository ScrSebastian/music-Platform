package com.example.musicplatform.service;

import com.example.musicplatform.entity.User;


import java.util.List;

public interface UserService {
    List<User> listUsers();

    User getUserById(Long id);
}
