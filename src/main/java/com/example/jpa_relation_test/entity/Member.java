package com.example.jpa_relation_test.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
	private String address;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String phoneNumber;

//    @ManyToOne
//    @JoinColumn(name = "BOOKSTORE_ID")
//    private BookStore bookStore;

    @OneToMany(mappedBy = "member")
    private List<Purchase> purchases = new ArrayList<>();

}
