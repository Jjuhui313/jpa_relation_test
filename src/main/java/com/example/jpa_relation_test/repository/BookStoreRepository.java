package com.example.jpa_relation_test.repository;


import com.example.jpa_relation_test.entity.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoreRepository extends JpaRepository<BookStore, Long> {
}
