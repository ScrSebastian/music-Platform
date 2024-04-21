package com.example.musicplatform.controller;

import io.jsonwebtoken.Claims;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ResourceController {

    @GetMapping("/protected-resource")
    public String protectedResource(HttpServletRequest request) {
        // 从请求属性中获取Claims信息
        Claims claims = (Claims) request.getAttribute("claims");
        String username = claims.getSubject();
        return "Hello, " + username + "! This is a protected resource.";
    }
}

