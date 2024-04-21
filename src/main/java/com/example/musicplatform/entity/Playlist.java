package com.example.musicplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.mysql.cj.xdevapi.JsonArray;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("list")
public class Playlist {
    private int list_id;
    private int item_list_id;
    private int user_id;
    private String playlist_name;
    private JsonArray song_list;
    private String playlist_type;
    private String playlist_description;
    private String playlist_cover;
    private Timestamp create_time;
}
