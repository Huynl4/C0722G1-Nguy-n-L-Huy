package com.example.demo.service;


import com.example.demo.model.Song;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ISongService {
   Iterable<Song> findAll(Pageable pageable);
   void save(Song song);
   Optional<Song> findById(Long id);
   void remove(Long id);
}
