package com.example.musicplatform.controller;


import com.example.musicplatform.entity.Artist;
import com.example.musicplatform.response.ResponseInfo;
import com.example.musicplatform.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping("/listArtists")
    public ResponseInfo listartists() {
        List<Artist> artists = artistService.listArtists();
        return ResponseInfo.success(artists);
    }

    @GetMapping("/{pid}")
    public ResponseInfo getAlbumById(@PathVariable("pid") Long pid) {
        if (pid == null) {
            return ResponseInfo.fail("参数为空");
        }
        Artist artist = artistService.getArtistById(pid);
        if (artist != null) {
            return ResponseInfo.success(artist);
        } else {
            return ResponseInfo.fail("你所查找的歌手不存在");
        }
    }
}
