package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameSong;


    private String singer;


    private String music;

    public Song() {
    }

    public Song(Long id, @NotEmpty(message = "Tên bài hát không được trống") @Size(min = 1, max = 800) String nameSong, @NotEmpty(message = "Tên ca sĩ không được để trống") @Size(min = 1, max = 300) String singer, @NotEmpty(message = "Thể loại nhạc không được để trống") @Size(max = 300) String music) {
        this.id = id;
        this.nameSong = nameSong;
        this.singer = singer;
        this.music = music;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}
