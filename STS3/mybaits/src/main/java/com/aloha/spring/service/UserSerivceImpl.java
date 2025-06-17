package com.aloha.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.spring.dto.User;
import com.aloha.spring.mapper.UserMapper;

@Service
public class UserSerivceImpl implements UserService {

	// 로거
	private static final Logger logger = LoggerFactory.getLogger(UserSerivceImpl.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean insert(User user) throws Exception {
		logger.info("회원가입 중...");
		return userMapper.insert(user) > 0;
	}
	
	@Override
	public User select(String id) throws Exception {
		User user = userMapper.select(id);
		logger.info("로그인 시도중...");
		return user;
	}

	@Override
	public boolean update(User user) throws Exception {
		int result = userMapper.update(user);
		logger.info("회원정보 수정중 ...");
		if( result > 0)
			return true;
		return false;
	}

	@Override
	public boolean delete(int no) throws Exception {
		int result = userMapper.delete(no);
		logger.info("회원 탈퇴 시도 중...");
		if ( result > 0)
			return true;
		return false;
	}


}
