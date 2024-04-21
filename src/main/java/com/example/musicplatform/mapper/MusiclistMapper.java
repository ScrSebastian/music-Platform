package com.example.musicplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.musicplatform.entity.Album;
import com.example.musicplatform.entity.Lyrics;
import com.example.musicplatform.entity.Musiclist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusiclistMapper extends BaseMapper<Musiclist> {
//    List<Musiclist> selectAll();

}
