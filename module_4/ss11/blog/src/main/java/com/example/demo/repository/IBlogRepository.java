package com.example.demo.repository;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findBlogByCategoryContaining(Pageable pageable, String name);

    Page<Blog> findByCategoryId(Pageable pageable, int id);

    Page<Blog> findByAuthorContaining(String name, Pageable pageable);
}
