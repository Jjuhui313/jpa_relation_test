package com.example.jpa_relation_test.repository;


import com.example.jpa_relation_test.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
