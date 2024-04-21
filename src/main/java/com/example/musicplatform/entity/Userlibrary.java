package com.example.musicplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("userlibrary")
public class Userlibrary {
    private int id;
    private int uid;
    private int item_music_id;
    private int item_list_id;
    private int item_album_id;
    private String item_type;
    private Timestamp add_time;
}
