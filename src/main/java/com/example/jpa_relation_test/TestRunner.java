package com.example.jpa_relation_test;


import com.example.jpa_relation_test.repository.BookRepository;
import com.example.jpa_relation_test.repository.BookStoreRepository;
import com.example.jpa_relation_test.repository.MemberRepository;
import com.example.jpa_relation_test.repository.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@RequiredArgsConstructor
public class TestRunner implements ApplicationRunner {

    private final BookRepository bookRepository;
    private final BookStoreRepository bookStoreRepository;
    private final MemberRepository memberRepository;
    private final PurchaseRepository purchaseRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
