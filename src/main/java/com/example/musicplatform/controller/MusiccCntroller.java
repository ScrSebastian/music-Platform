package com.example.musicplatform.controller;


import com.example.musicplatform.entity.Music;
import com.example.musicplatform.response.ErrorResponse;
import com.example.musicplatform.response.ResponseInfo;

import com.example.musicplatform.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusiccCntroller {
    @Autowired
    private MusicService musicService;

    @GetMapping("/listMusics")
    public ResponseInfo listMusics() {
        List<Music> Musics = musicService.listMusics();
        return ResponseInfo.success(Musics);
    }

    @GetMapping("/{pid}")
    public ResponseInfo getMusicById(@PathVariable("pid") Long pid) {
        if (pid == null) {
            return ResponseInfo.fail("参数为空");
        }
        Music music = musicService.getMusicById(pid);
        if (music != null) {
            return ResponseInfo.success(music);
        } else {
            return ResponseInfo.fail("你所查找的音乐不存在");
        }
    }
//    @Autowired
//    private MusicService musicService;
//
//
//    @GetMapping("")
//    public ResponseEntity<?> getAll(){
//        try{
//            return musicService.getAllMusics();
//        }catch (Exception e){
//            ErrorResponse errorResponse = new ErrorResponse();
//            errorResponse.setErr(201);
//            errorResponse.setMsg("Resource doesn't exist");
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
//        }
//    }
//
//    @PutMapping("/{uid}/{item_music_id}")
//    public ResponseEntity<?> addToFavorites(@PathVariable Long uid, @PathVariable Long item_music_id) {
//        return musicService.putIntoF(uid, item_music_id);
//    }
//
//    @DeleteMapping("/{uid}/{item_music_id}")
//    public ResponseEntity<?> deleteFromFavorite(@PathVariable Long uid, @PathVariable Long item_music_id) {
//        return musicService.deleteFromF(uid, item_music_id);
//    }
}
