package com.example.song;


import java.util.*;

public interface SongRepository{
    ArrayList<Song> getSongs(); //to Get all songs
    Song addSong(Song song); //to add a song
    Song getSongById(int songId); //to Get specific song
    Song updateSong(int songId, Song song); //to update song
    void deleteSong(int songId); // to delete a song
}

