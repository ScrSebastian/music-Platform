package com.example.musicplatform.service.impl;

import com.example.musicplatform.service.LoginService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;



@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 此处应该查询数据库获取用户信息，这里仅作演示
        return User.builder()
                .username("username")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();
    }
}
