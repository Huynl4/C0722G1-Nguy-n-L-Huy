package com.example.demo.reposiory;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
//    Page<Blog> search(String search, Pageable pageable);
//
//    @Query(value = "select * from blog b where b.title like ")
//    Page<Blog> search(@Param("title") String title, Pageable pageable);

    Page<Blog> findAllByTitleContaining(Pageable pageable, String name);
}
