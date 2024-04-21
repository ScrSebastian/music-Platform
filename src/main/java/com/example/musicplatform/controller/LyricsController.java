package com.example.musicplatform.controller;


import com.example.musicplatform.entity.Lyrics;
import com.example.musicplatform.response.ResponseInfo;

import com.example.musicplatform.service.LyricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lyrics")
public class LyricsController {
    @Autowired
    private LyricsService lyricsService;

    @GetMapping("/listLyrics")
    public ResponseInfo listLyrics() {
        List<Lyrics> lyrics = lyricsService.listLyrics();
        return ResponseInfo.success(lyrics);
    }

    @GetMapping("/{pid}")
    public ResponseInfo getLyricsById(@PathVariable("pid") Long pid) {
        if (pid == null) {
            return ResponseInfo.fail("参数为空");
        }
        Lyrics lyrics = lyricsService.getLyricsById(pid);
        if (lyrics != null) {
            return ResponseInfo.success(lyrics);
        } else {
            return ResponseInfo.fail("你所查找的歌词不存在");
        }
    }
}
