package com.example.musicplatform.controller;


import com.example.musicplatform.entity.Playlist;
import com.example.musicplatform.response.ErrorResponse;
import com.example.musicplatform.response.ResponseInfo;

import com.example.musicplatform.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;

    @GetMapping("/listPlaylists")
    public ResponseInfo listPlaylists() {
        List<Playlist> playlists = playlistService.listPlaylists();
        return ResponseInfo.success(playlists);
    }

    @GetMapping("/{pid}")
    public ResponseInfo getPlaylistById(@PathVariable("pid") Long pid) {
        if (pid == null) {
            return ResponseInfo.fail("参数为空");
        }
        Playlist playlist = playlistService.getPlaylistById(pid);
        if (playlist != null) {
            return ResponseInfo.success(playlist);
        } else {
            return ResponseInfo.fail("你所查找的歌单不存在");
        }
    }

//    @Autowired
//    private PlaylistService playlistService;
//
//
//    @GetMapping("")
//    public ResponseEntity<?> getAll(){
//        try{
//            return playlistService.getAllplaylists();
//        }catch (Exception e){
//            ErrorResponse errorResponse = new ErrorResponse();
//            errorResponse.setErr(201);
//            errorResponse.setMsg("Resource doesn't exist");
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
//        }
//    }
//
//    @GetMapping("/{pid}")
//    public ResponseEntity<?> getListById(@PathVariable("pid") Long pid) {
//        Playlist playlist = playlistService.getlsitById(pid);
//        if (playlist != null) {
//            return ResponseEntity.ok(playlist);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping("/{lid}/{uid}/{name}")
//    public ResponseEntity<?> createList(@PathVariable("lid") Integer lid, @PathVariable("uid") Integer uid, @PathVariable("name") String name){
//        return playlistService.createList(lid,uid,name);
//    }
//
//    @PutMapping("/{uid}/{item_list_id}")
//    public ResponseEntity<?> addToFavorites(@PathVariable Long uid, @PathVariable Long item_list_id) {
//        return playlistService.putIntoF(uid, item_list_id);
//    }
//
//    @DeleteMapping("/{uid}/{item_list_id}")
//    public ResponseEntity<?> deleteFromFavorite(@PathVariable Long uid, @PathVariable Long item_list_id) {
//        return playlistService.deleteFromF(uid, item_list_id);
//    }
}
