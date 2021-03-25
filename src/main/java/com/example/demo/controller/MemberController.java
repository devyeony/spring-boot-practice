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
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/")
    public String sampleHome() {
        return "Hello Spring Boot!";
    }
	
	@GetMapping("/all")
	public List<Member> all() throws Exception { //query String으로 county를 받도록 설정
		return memberService.getAllMember();
	}
	
	@GetMapping("/test")
	public String test() {
		return "안녕";
	}
}
