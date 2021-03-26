package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Member;

@Repository
@Mapper
public interface MemberMapper {
	public List<Member> getAllMember() throws Exception;
}
