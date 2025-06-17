package com.aloha.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aloha.spring.dto.User;

@Mapper
public interface UserMapper {

	// 회원가입
	public int insert(User user) throws Exception;
	// 로그인
	public User select(String id) throws Exception;
	// 회원정보 수정
	public int update(User user) throws Exception;
	// 회원 탈퇴
	public int delete(int no) throws Exception;
	
}
