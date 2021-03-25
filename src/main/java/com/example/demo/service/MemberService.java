package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.Member;

@Service
public class MemberService {
	@Autowired
	public MemberDao memberDao;
	
	public List<Member> getAllMember() throws Exception{
		return memberDao.getAllMember();
	}
}
