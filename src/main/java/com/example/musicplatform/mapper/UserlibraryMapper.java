package com.example.musicplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.musicplatform.entity.Album;
import com.example.musicplatform.entity.Lyrics;
import com.example.musicplatform.entity.Userlibrary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserlibraryMapper extends BaseMapper<Userlibrary> {
//    List<Userlibrary> selectAll();

}
