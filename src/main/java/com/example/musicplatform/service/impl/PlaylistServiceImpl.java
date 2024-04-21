package com.example.musicplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicplatform.entity.Playlist;
import com.example.musicplatform.mapper.PlaylistMapper;
import com.example.musicplatform.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImpl extends ServiceImpl<PlaylistMapper,Playlist> implements PlaylistService {

    @Autowired
    private PlaylistMapper playlistMapper;

    @Override
    public List<Playlist> listPlaylists() {
        return playlistMapper.selectList(null);
    }

    @Override
    public Playlist getPlaylistById(Long id) {
        return playlistMapper.selectById(id);
    }
}
