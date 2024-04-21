package com.example.musicplatform.service;
import com.example.musicplatform.entity.Playlist;


import java.util.List;


public interface PlaylistService {


    List<Playlist> listPlaylists();

    Playlist getPlaylistById(Long id);

//    public ResponseEntity<?> getAllplaylists(){
//        List<Playlist> playlists = playlistmapper.selectAll();
//        int total = playlists.size();
//        ApiResponse<Playlist> response = new ApiResponse<>();
//        response.setData(playlists);
//        response.setTotal(total);
//        return ResponseEntity.ok(response);
//    }
//
//    public Playlist getlsitById(Long pid){
//        Playlist playlist = playlistmapper.selectById(pid);
//        return playlist;
//    }
//
//    public ResponseEntity<?> createList(Integer lid, Integer uid, String name){
//        Playlist list = new Playlist();
//        list.setItem_list_id(lid);
//        list.setUser_id(uid);
//        list.setPlaylist_name(name);
//        try {
//            playlistmapper.createlist(list);
//            return ResponseEntity.ok("Playlist has been created successfully.");
//        }catch (Exception e){
//            ErrorResponse errorResponse = new ErrorResponse();
//            errorResponse.setErr(500);
//            errorResponse.setMsg("Failed to create a playlist.");
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
//        }
//    }
//
//    public ResponseEntity<?> putIntoF(Long uid, Long item_list_id) {
//        try {
//            playlistmapper.addToFavorites(uid, item_list_id);
//            return ResponseEntity.ok("Playlist added to favorites successfully.");
//        } catch (Exception e) {
//            ErrorResponse errorResponse = new ErrorResponse();
//            errorResponse.setErr(500);
//            errorResponse.setMsg("Failed to add playlist to favorites.");
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
//        }
//    }
//
//    public ResponseEntity<?> deleteFromF(Long uid, Long item_list_id) {
//        try {
//            playlistmapper.deleteFromFavorite(uid, item_list_id);
//            return ResponseEntity.ok("Playlist has been deleted successfully.");
//        } catch (Exception e) {
//            ErrorResponse errorResponse = new ErrorResponse();
//            errorResponse.setErr(500);
//            errorResponse.setMsg("Failed to delete playlist to favorites.");
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
//        }
//    }
}
