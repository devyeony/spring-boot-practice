package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberMapper;
import com.example.demo.dao.MemberRepository;
import com.example.demo.dto.Member;

@Service
public class MemberService {
	@Autowired
	public MemberMapper memberMapper;
	
	@Autowired
	public MemberRepository memberRepository;
	
	public List<Member> getAllMemberByMyBatis() throws Exception{
		return memberMapper.getAllMember();
	}
	
	public List<Member> getAllMemberByJpa() throws Exception{
		return memberRepository.findAll();
	}
}
