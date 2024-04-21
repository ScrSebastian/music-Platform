package com.example.musicplatform.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface LoginService {
    UserDetails loadUserByUsername(String username);
}
