package com.example.musicplatform.service;


import com.example.musicplatform.entity.Lyrics;

import java.util.List;

public interface LyricsService {

    List<Lyrics> listLyrics();

    Lyrics getLyricsById(Long id);
}
