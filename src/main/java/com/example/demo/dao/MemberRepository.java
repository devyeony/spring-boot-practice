package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	
}
