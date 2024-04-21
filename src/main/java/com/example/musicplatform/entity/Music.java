package com.example.musicplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("music")
public class Music {
    private int music_id;
    private int item_music_id;
    private int file_path;
    private int artist_id;
    private int album_id;
    private int liked;
    private int played;
    private int download;
    private int favourite;
    private int share;
    private String title;
    private String level;
}
