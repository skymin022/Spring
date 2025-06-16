package com.aloha.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aloha.spring.dto.Board;

@Repository
public class BoardDAO {

	public List<Board> list() { 
		List<Board> boardList = new ArrayList<Board>();
		boardList.add(new Board("b01", "제목1", "작성자1","내용1"));
		boardList.add(new Board("b02", "제목2", "작성자2","내용2"));
		boardList.add(new Board("b03", "제목3", "작성자3","내용3"));
		return boardList;
	}
	
	public Board select(int no) { 
		Board board = new Board("b01", "제목1", "작성자1","내용1");
		return board;
	}
	
	public int insert(Board board ) { 
		int result = 0;
		return result;
	}
	
	public int update(Board board ) { 
		int result = 0;
		return result;
	}
	
	public int delete(int no ) { 
		int result = 0;
		return result;
	}
	
}
