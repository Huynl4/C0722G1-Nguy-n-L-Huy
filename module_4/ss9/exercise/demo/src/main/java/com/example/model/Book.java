package com.example.model;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int count;

    @ManyToOne
    @JoinColumn(name = "oder_id",referencedColumnName = "id")
    private Oder oder;

    public Book() {
    }

    public Book(Long id, String name, int count, Oder oder) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.oder = oder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Oder getOder() {
        return oder;
    }

    public void setOder(Oder oder) {
        this.oder = oder;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
