package com.example.musicplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("login_info")
public class Login_info {
    private int id;
    private String username;
    private String password;

}
