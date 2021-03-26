package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@RestController
@RequestMapping("member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/myBatis/all")
	public List<Member> allByMyBatis() throws Exception { 
		return memberService.getAllMemberByMyBatis();
	}
	
	@GetMapping("/jpa/all")
	public List<Member> allByJpa() throws Exception { 
		return memberService.getAllMemberByJpa();
	}
}
