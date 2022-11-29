package com.example.demo.service;

import com.example.demo.model.Song;

import java.util.List;

public interface ISongService {
    void save(Song song);

    List<Song> findAll();
}
