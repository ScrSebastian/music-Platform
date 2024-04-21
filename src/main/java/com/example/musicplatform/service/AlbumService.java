package com.example.musicplatform.service;


import com.example.musicplatform.entity.Album;

import java.util.List;

public interface AlbumService {

    List<Album> listAlbums();

    Album getAlbumById(Long pid);

    boolean addToFavorites(Long pid, Long item_album_id);

    boolean deleteFromFavorite(Long pid, Long item_album_id);

}
