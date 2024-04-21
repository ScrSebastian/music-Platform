package com.example.musicplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("lyrics")
public class Lyrics {
    private int music_id;
    private String uploader;
    private String text_content;
}
