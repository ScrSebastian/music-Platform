package com.example.musicplatform.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicplatform.entity.Album;
import com.example.musicplatform.mapper.AlbumMapper;
import com.example.musicplatform.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper,Album> implements AlbumService {

    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public List<Album> listAlbums() {
        return albumMapper.selectList(null);
    }

    @Override
    public Album getAlbumById(Long pid) {
        return albumMapper.selectById(pid);
    }

    @Override
    public boolean addToFavorites(Long pid, Long item_album_id) {
        if(albumMapper.addToFavorites(pid,item_album_id)){
            return true;
        }else return false;
    }

    @Override
    public boolean deleteFromFavorite(Long pid, Long item_album_id) {
        if(albumMapper.deleteFromFavorite(pid,item_album_id)){
            return true;
        }else return false;
    }

    //    public ResponseEntity<?> getAllAlbums() {
//            List<Album> albums = albumMapper.selectAll();
//            int total = albums.size();
//            ApiResponse<Album> response = new ApiResponse<>();
//            response.setData(albums);
//            response.setTotal(total);
//            return ResponseEntity.ok(response);
//    }
//
//    public Album getAlbumById(Long pid) {
//        return albumMapper.selectById(pid);
//    }
//
//    public ResponseEntity<?> putIntoF(Long uid, Long item_album_id) {
//        try {
//            albumMapper.addToFavorites(uid, item_album_id);
//            return ResponseEntity.ok("Album added to favorites successfully.");
//        } catch (Exception e) {
//            ErrorResponse errorResponse = new ErrorResponse();
//            errorResponse.setErr(500);
//            errorResponse.setMsg("Failed to add album to favorites.");
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
//        }
//    }
//
//    public ResponseEntity<?> deleteFromF(Long uid, Long item_album_id) {
//        try {
//            albumMapper.deleteFromFavorite(uid, item_album_id);
//            return ResponseEntity.ok("Album has been deleted successfully.");
//        } catch (Exception e) {
//            ErrorResponse errorResponse = new ErrorResponse();
//            errorResponse.setErr(500);
//            errorResponse.setMsg("Failed to delete album to favorites.");
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
//        }
//    }
}
