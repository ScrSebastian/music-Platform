package com.example.musicplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicplatform.entity.Playlist;
import com.example.musicplatform.entity.Userlibrary;
import com.example.musicplatform.mapper.PlaylistMapper;
import com.example.musicplatform.mapper.UserlibraryMapper;
import com.example.musicplatform.service.PlaylistService;
import com.example.musicplatform.service.UserlibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserlibraryServiceImpl extends ServiceImpl<UserlibraryMapper, Userlibrary> implements UserlibraryService {

    @Autowired
    private UserlibraryMapper userlibraryMapper;

    @Override
    public List<Userlibrary> listUserlibrary() {
        return userlibraryMapper.selectList(null);
    }

    @Override
    public Userlibrary getUserlibraryById(Long id) {
        return userlibraryMapper.selectById(id);
    }
}
