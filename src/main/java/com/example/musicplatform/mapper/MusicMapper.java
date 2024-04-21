package com.example.musicplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.musicplatform.entity.Album;
import com.example.musicplatform.entity.Lyrics;
import com.example.musicplatform.entity.Music;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MusicMapper extends BaseMapper<Music> {
//    List<Music> selectAll();
//    void addToFavorites(@Param("uid") Long uid, @Param("item_music_id") Long item_music_id);
//    void deleteFromFavorite(@Param("uid") Long uid, @Param("item_music_id") Long item_music_id);
}
