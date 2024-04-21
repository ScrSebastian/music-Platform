package com.example.musicplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicplatform.entity.Musiclist;
import com.example.musicplatform.mapper.MusiclistMapper;
import com.example.musicplatform.service.MusiclistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusiclistServiceImpl extends ServiceImpl<MusiclistMapper, Musiclist> implements MusiclistService {

    @Autowired
    private MusiclistMapper musiclistMapper;

    @Override
    public List<Musiclist> listMusiclist() {
        return musiclistMapper.selectList(null);
    }

    @Override
    public Musiclist getMusiclistById(Long id) {
        return musiclistMapper.selectById(id);
    }
}
