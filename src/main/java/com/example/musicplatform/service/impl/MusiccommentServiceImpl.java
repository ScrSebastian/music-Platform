package com.example.musicplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicplatform.entity.Musiccomment;
import com.example.musicplatform.mapper.MusiccommentMapper;
import com.example.musicplatform.service.MusiccommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MusiccommentServiceImpl extends ServiceImpl<MusiccommentMapper, Musiccomment> implements MusiccommentService {

    @Autowired
    private MusiccommentMapper musiccommentMapper;

    @Override
    public List<Musiccomment> listComment() {
        return musiccommentMapper.selectList(null);
    }

    @Override
    public Musiccomment getCommentById(Long id) {
        return musiccommentMapper.selectById(id);
    }
}
