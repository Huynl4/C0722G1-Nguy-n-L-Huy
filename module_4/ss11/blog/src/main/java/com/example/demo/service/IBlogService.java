package com.example.demo.service;


import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService extends IService<Blog> {
    Page<Blog> findBlogByCategoryContaining(Pageable pageable, String name);
    Page<Blog> findByCategoryId(Pageable pageable,int id);
    Page<Blog> findByAuthorContaining(String name, Pageable pageable);
}
