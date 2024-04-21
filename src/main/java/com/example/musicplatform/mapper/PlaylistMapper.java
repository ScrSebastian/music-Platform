package com.example.musicplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.musicplatform.entity.Album;
import com.example.musicplatform.entity.Lyrics;
import com.example.musicplatform.entity.Playlist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PlaylistMapper extends BaseMapper<Playlist> {
//    List<Playlist> selectAll();
//    Playlist selectById(@Param("pid") Long pid);
//    void createlist(@Param("list")Playlist list);
//    void addToFavorites(@Param("uid") Long uid, @Param("item_list_id") Long item_list_id);
//    void deleteFromFavorite(@Param("uid") Long uid, @Param("item_list_id") Long item_list_id);
}
