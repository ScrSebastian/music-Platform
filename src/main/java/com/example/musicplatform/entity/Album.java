package com.example.musicplatform.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("album")
public class Album {
    private int album_id;
    private int item_album_id;
    private int play_count;
    private int sales;
    private int collection_count;
    private int share_count;
    private String cover_image;
    private String album_name;
    private String album_description;
    private String album_type;
    private Timestamp release_time;
}
