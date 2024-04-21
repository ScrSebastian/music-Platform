package com.example.musicplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("user")
public class User {
    private int uid;
    private int user_level;
    private String real_name_verification_info;
    private String phone_number;
    private String avatar;
    private String nickname;
    private String history_record;
    private String comment_history_record;
    private Timestamp last_login_time;
}
