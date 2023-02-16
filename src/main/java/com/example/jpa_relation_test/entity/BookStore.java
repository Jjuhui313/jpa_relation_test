package com.example.jpa_relation_test.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


// /com/exmple/jpa_relation_test/entity/BookStore
@Entity
@Getter
@Setter
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "bookStore")
    private List<Book> books = new ArrayList<>();

    @OneToMany(mappedBy = "book_Store_id")
    private List<Member> memberList = new ArrayList<>();

}

