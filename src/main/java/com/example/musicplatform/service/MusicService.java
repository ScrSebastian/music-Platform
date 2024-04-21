package com.example.musicplatform.service;
import com.example.musicplatform.entity.Music;
import java.util.List;


public interface MusicService {

    List<Music> listMusics();

    Music getMusicById(Long id);

//    public ResponseEntity<?> getAllMusics() {
//        List<Music> musics = musicmapper.selectAll();
//        int total = musics.size();
//        ApiResponse<Music> response = new ApiResponse<>();
//        response.setData(musics);
//        response.setTotal(total);
//        return ResponseEntity.ok(response);
//    }
//
//    public ResponseEntity<?> putIntoF(Long uid, Long item_music_id) {
//        try {
//            musicmapper.addToFavorites(uid, item_music_id);
//            return ResponseEntity.ok("Music added to favorites successfully.");
//        } catch (Exception e) {
//            ErrorResponse errorResponse = new ErrorResponse();
//            errorResponse.setErr(500);
//            errorResponse.setMsg("Failed to add music to favorites.");
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
//        }
//    }
//
//    public ResponseEntity<?> deleteFromF(Long uid, Long item_music_id) {
//        try {
//            musicmapper.deleteFromFavorite(uid, item_music_id);
//            return ResponseEntity.ok("Music has been deleted successfully.");
//        } catch (Exception e) {
//            ErrorResponse errorResponse = new ErrorResponse();
//            errorResponse.setErr(500);
//            errorResponse.setMsg("Failed to delete music to favorites.");
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
//        }
//    }
}
