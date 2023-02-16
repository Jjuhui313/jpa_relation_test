package com.example.jpa_relation_test.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private long quentity;

    @ManyToOne
    @JoinColumn(name = "BOOKSTORE_ID")
    private BookStore bookStore;

    @OneToMany(mappedBy = "book")
    private List<Purchase> purchases = new ArrayList<>();

}

