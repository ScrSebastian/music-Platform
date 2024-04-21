package com.example.musicplatform.controller;


import com.example.musicplatform.entity.Userlibrary;
import com.example.musicplatform.response.ResponseInfo;

import com.example.musicplatform.service.UserlibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/UserLibrary")
public class UserlibraryController {
    @Autowired
    private UserlibraryService userlibraryService;

    @GetMapping("/listUserLibrarys")
    public ResponseInfo listUsersLibrary() {
        List<Userlibrary> userslibrary = userlibraryService.listUserlibrary();
        return ResponseInfo.success(userslibrary);
    }

    @GetMapping("/{pid}")
    public ResponseInfo getUsersLibraryById(@PathVariable("pid") Long pid) {
        if (pid == null) {
            return ResponseInfo.fail("参数为空");
        }
        Userlibrary userlibrary = userlibraryService.getUserlibraryById(pid);
        if (userlibrary != null) {
            return ResponseInfo.success(userlibrary);
        } else {
            return ResponseInfo.fail("你所查找的用户收藏不存在");
        }
    }
}
