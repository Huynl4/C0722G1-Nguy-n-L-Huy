package com.example.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Oder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int codeBook;

    @OneToMany()
    Set<Book> bookSet;

    public Oder() {
    }

    public Oder(int borrowCode, Book book) {
    }

    public Oder(Long id, int codeBook, Set<Book> bookSet) {
        this.id = id;
        this.codeBook = codeBook;

        this.bookSet = bookSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(int codeBook) {
        this.codeBook = codeBook;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }
}
