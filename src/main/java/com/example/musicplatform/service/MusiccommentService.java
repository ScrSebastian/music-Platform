package com.example.musicplatform.service;

import com.example.musicplatform.entity.Album;
import com.example.musicplatform.entity.Musiccomment;

import java.util.List;

public interface MusiccommentService {

    List<Musiccomment> listComment();

    Musiccomment getCommentById(Long id);
}
