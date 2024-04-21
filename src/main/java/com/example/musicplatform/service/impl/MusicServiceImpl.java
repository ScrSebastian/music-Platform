package com.example.musicplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicplatform.entity.Music;
import com.example.musicplatform.mapper.MusicMapper;
import com.example.musicplatform.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl extends ServiceImpl<MusicMapper, Music> implements MusicService{

    @Autowired
    private MusicMapper musicMapper;

    @Override
    public List<Music> listMusics() {
        return musicMapper.selectList(null);
    }

    @Override
    public Music getMusicById(Long id) {
        return musicMapper.selectById(id);
    }
}
