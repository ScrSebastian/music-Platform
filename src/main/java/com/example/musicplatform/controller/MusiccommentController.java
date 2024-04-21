package com.example.musicplatform.controller;


import com.example.musicplatform.entity.Musiccomment;
import com.example.musicplatform.response.ResponseInfo;

import com.example.musicplatform.service.MusiccommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class MusiccommentController {

    @Autowired
    private MusiccommentService musiccommentService;

    @GetMapping("/listMusics")
    public ResponseInfo listComments() {
        List<Musiccomment> comments = musiccommentService.listComment();
        return ResponseInfo.success(comments);
    }

    @GetMapping("/{pid}")
    public ResponseInfo getCommentById(@PathVariable("pid") Long pid) {
        if (pid == null) {
            return ResponseInfo.fail("参数为空");
        }
        Musiccomment comment = musiccommentService.getCommentById(pid);
        if (comment != null) {
            return ResponseInfo.success(comment);
        } else {
            return ResponseInfo.fail("你所查找的评论不存在");
        }
    }
}
