package com.example.musicplatform.controller;

import com.example.musicplatform.entity.Album;
import com.example.musicplatform.response.ErrorResponse;
import com.example.musicplatform.response.ResponseInfo;
import com.example.musicplatform.service.AlbumService;
import com.example.musicplatform.service.impl.AlbumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/listAlbums")
    public ResponseInfo listAlbums() {
        List<Album> albums = albumService.listAlbums();
        return ResponseInfo.success(albums);
    }

    @GetMapping("/{pid}")
    public ResponseInfo getAlbumById(@PathVariable("pid") Long pid) {
        if (pid == null) {
            return ResponseInfo.fail("参数为空");
        }
        Album album = albumService.getAlbumById(pid);
        if (album != null) {
            return ResponseInfo.success(album);
        } else {
            return ResponseInfo.fail("你所查找的专辑不存在");
        }
    }
//这两个基本也是按照上面的方式去实现
    @PutMapping("/{uid}/{item_album_id}")
    public ResponseInfo addToFavorites(@PathVariable Long uid, @PathVariable Long item_album_id) {
        if (uid == null || item_album_id == null){
            return ResponseInfo.fail("参数为空");
        }
        if(albumService.addToFavorites(uid,item_album_id)){
            return ResponseInfo.success("添加成功");
        }else {
            return ResponseInfo.fail("添加失败");
        }
    }

    @DeleteMapping("/{uid}/{item_album_id}")
    public ResponseInfo deleteFromFavorite(@PathVariable Long uid, @PathVariable Long item_album_id) {
        if (uid == null || item_album_id == null){
            return ResponseInfo.fail("参数为空");
        }
        if(albumService.deleteFromFavorite(uid,item_album_id)){
            return ResponseInfo.success("删除成功");
        }else {
            return ResponseInfo.fail("删除失败");
        }
    }
}
