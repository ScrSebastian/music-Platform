package com.example.musicplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.musicplatform.entity.Album;
import com.example.musicplatform.entity.Lyrics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyricsMapper extends BaseMapper<Lyrics> {

}
