package com.example.musicplatform.service;


import com.example.musicplatform.entity.Musiclist;

import java.util.List;

public interface MusiclistService {

    List<Musiclist> listMusiclist();

    Musiclist getMusiclistById(Long id);
}
