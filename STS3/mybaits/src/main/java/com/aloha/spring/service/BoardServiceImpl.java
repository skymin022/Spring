package com.aloha.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.spring.dto.Board;
import com.aloha.spring.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	// 로거
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<Board> list() throws Exception {
		List<Board> list = boardMapper.list();
		logger.info("게시글 목록을 조회합니다... ");
		return list;
	}

	@Override
	public Board select(int no) throws Exception {
		Board board = boardMapper.select(no);
		logger.info("게시글 조회합니다... ");
		return board;
	}

	@Override
	public boolean insert(Board board) throws Exception {
		int result = boardMapper.insert(board);
		logger.info("게시글 등록 합니다... ");
		if (result > 0) 
			return true;
		return false;
	}

	@Override
	public boolean update(Board board) throws Exception {
		int result = boardMapper.update(board);
		logger.info("게시글 수정 합니다... ");
		if (result > 0) 
			return true;
		return false;
	}

	@Override
	public boolean delete(int no) throws Exception {
		int result = boardMapper.delete(no);
		logger.info("게시글 삭제 합니다... ");
		if (result > 0) 
			return true;
		return false;
	}

	
}
