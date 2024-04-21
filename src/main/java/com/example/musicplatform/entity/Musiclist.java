package com.example.musicplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("musiclist")
public class Musiclist {
    private int musiclist_id;
    private int list_id;
    private int music_id;
}
