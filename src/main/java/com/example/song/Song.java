package com.example.song;

class Song{
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;
    
    Song(int songId, String songName, String lyricist, String singer, String musicDirector){
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public int getSongId(){ //getter for SongId
        return this.songId;
    }
    public void setSongId(int songId){
        this.songId = songId;
    }
    public String getSongName(){ //getter for SongName
        return this.songName;
    }
    public void setSongName(String songName){
        this.songName = songName;
    }
    public String getLyricist(){ //getter for Lyricist
        return this.lyricist;
    }
    public void setLyricist(String lyricist){
        this.lyricist = lyricist;
    }
    public String getSinger(){  //getter for Singer
        return this.singer;
    }
    public void setSinger(String singer){
        this.singer = singer;
    }
    public String getMusicDirector(){  //getter for Music Director
        return this.musicDirector;
    }
    public void setMusicDirector(String musicDirector){
        this.musicDirector = musicDirector;
    }
}