package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IGeneraService<T> {
   List<T> findAll();

    Optional<T> findById(int id);

    void save(T t);

    void remove(int id);

}
