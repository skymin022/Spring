package com.aloha.spring.service;

import com.aloha.spring.dto.User;

public interface UserService {

	// 회원가입
	public boolean insert(User user) throws Exception;
	// 로그인
	public User select(String id) throws Exception;
	// 회원정보 수정
	public boolean update(User user) throws Exception;
	// 회원 탈퇴
	public boolean delete(int no) throws Exception;
}