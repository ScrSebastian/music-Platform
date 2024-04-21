package com.example.musicplatform.service;



import com.example.musicplatform.entity.Userlibrary;

import java.util.List;

public interface UserlibraryService {

    List<Userlibrary> listUserlibrary();

    Userlibrary getUserlibraryById(Long id);
}
