package com.example.musicplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicplatform.entity.Artist;
import com.example.musicplatform.mapper.ArtistMapper;
import com.example.musicplatform.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl extends ServiceImpl<ArtistMapper, Artist> implements ArtistService{
    @Autowired
    private ArtistMapper artistMapper;


    @Override
    public List<Artist> listArtists() {
        return artistMapper.selectList(null);
    }

    @Override
    public Artist getArtistById(Long id) {
        return artistMapper.selectById(id);
    }
}
