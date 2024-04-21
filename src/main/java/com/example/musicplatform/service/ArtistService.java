package com.example.musicplatform.service;


import com.example.musicplatform.entity.Artist;

import java.util.List;

public interface ArtistService {
    List<Artist> listArtists();

    Artist getArtistById(Long id);
}
