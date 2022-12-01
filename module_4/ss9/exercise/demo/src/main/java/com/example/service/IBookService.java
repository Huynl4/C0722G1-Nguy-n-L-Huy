package com.example.service;

import com.example.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> findAll();

    void save(Book book);

    Book findById(Long id);

    void remove(Book book);
}
