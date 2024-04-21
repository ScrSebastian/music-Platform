package com.example.musicplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("artist")
public class Artist {
    private int artist_id;
    private int popularity;
    private int top_50_list_id;
    private String name;
    private String image;
    private String tags;
    private String introduction;

}
