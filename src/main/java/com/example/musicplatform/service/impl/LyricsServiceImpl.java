package com.example.musicplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicplatform.entity.Lyrics;
import com.example.musicplatform.mapper.LyricsMapper;
import com.example.musicplatform.service.LyricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LyricsServiceImpl extends ServiceImpl<LyricsMapper, Lyrics> implements LyricsService {

    @Autowired
    private LyricsMapper lyricsMapper;

    @Override
    public List<Lyrics> listLyrics() {
        return lyricsMapper.selectList(null);
    }

    @Override
    public Lyrics getLyricsById(Long id) {
        return lyricsMapper.selectById(id);
    }
}
