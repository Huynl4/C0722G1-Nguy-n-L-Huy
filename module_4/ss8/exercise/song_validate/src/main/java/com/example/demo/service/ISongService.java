package com.example.demo.service;


import com.example.demo.model.Song;

import java.util.Optional;

public interface ISongService  {
   Iterable<Song> findAll();
   void save(Song song);
   Optional<Song> findById(Long id);
   void remove(Long id);
}
