package com.example.musicplatform.controller;


import com.example.musicplatform.entity.Musiclist;
import com.example.musicplatform.response.ResponseInfo;
import com.example.musicplatform.service.MusiclistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/musiclist")
public class MusiclistController {
    @Autowired
    private MusiclistService musiclistService;

    @GetMapping("/listMusiclist")
    public ResponseInfo listMusicLists() {
        List<Musiclist> lists = musiclistService.listMusiclist();
        return ResponseInfo.success(lists);
    }

    @GetMapping("/{pid}")
    public ResponseInfo getMusicListById(@PathVariable("pid") Long pid) {
        if (pid == null) {
            return ResponseInfo.fail("参数为空");
        }
        Musiclist list = musiclistService.getMusiclistById(pid);
        if (list != null) {
            return ResponseInfo.success(list);
        } else {
            return ResponseInfo.fail("你所查找的歌单不存在");
        }
    }
}
