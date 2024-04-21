package com.example.musicplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("musiccomment")
public class Musiccomment {
    private int comment_id;
    private int user_id;
    private int music_id;
    private int reference_comment_id;
    private int thumbs_up_count;
    private int thumbs_down_count;
    private String comment_content;
    private Timestamp comment_time;

}
