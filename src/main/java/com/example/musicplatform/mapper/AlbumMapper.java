package com.example.musicplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.musicplatform.entity.Album;
import org.apache.ibatis.annotations.*;

//驼峰命名
@Mapper
public interface AlbumMapper extends BaseMapper<Album> {
//    List<Album> selectAll();
//    Album selectById(@Param("pid") Long pid);
    @Insert("INSERT INTO userlibrary (uid, item_album_id, item_type, add_time) VALUES (#{uid}, #{item_album_id}, \"album\", current_timestamp)")
    boolean addToFavorites(@Param("uid") Long uid, @Param("item_album_id") Long item_album_id);
    @Delete("DELETE FROM userlibrary WHERE uid = #{uid} AND item_album_id = #{item_album_id}")
    boolean deleteFromFavorite(@Param("uid") Long uid, @Param("item_album_id") Long item_album_id);
}
