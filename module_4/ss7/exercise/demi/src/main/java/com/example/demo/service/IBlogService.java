package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface IBlogService extends IGeneraService<Blog> {
    Page<Blog> search(String search, Pageable pageable);

    Page<Blog> findAll(Pageable pageable);

//    Page<Blog> findAll(Sort name);
}
