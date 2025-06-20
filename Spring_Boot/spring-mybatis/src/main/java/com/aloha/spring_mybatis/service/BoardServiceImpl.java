package com.aloha.spring_mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.spring_mybatis.dto.Board;
import com.aloha.spring_mybatis.mapper.BoardMapper;

@Service    // 서비스 역할의 스프링 빈
public class BoardServiceImpl implements BoardService {
    
    @Autowired
    private BoardMapper boardMapper;

    /**
     * 게시글 목록 조회
     */
    @Override
    public List<Board> list() throws Exception {
        // TODO : boardMapper 로 list() 호출
        /*
         *        ➡ List<Board> boardList 로 받아옴
         *        ➡ return boardList
         */
        List<Board> boardList = boardMapper.list();
        return boardList;
    }

    /**
     * 게시글 조회
     * - no 매개변수로 게시글 번호를 전달받아서
     *   데이터베이스에 조회 요청
     */
    @Override
    public Board select(int no) throws Exception {
        // TODO : boardMapper 로 select(no) 호출
        /*
         *        ➡ Board board 로 받아옴
         *        ➡ return board
         */
        Board board = boardMapper.select(no);
        return board;        
    }

    /**
     * 게시글 등록
     */
    @Override
    public boolean insert(Board board) throws Exception {
        // TODO : boardMapper 로 insert(Board) 호출
        /*
        *        ➡ int result 로 데이터 처리 행(개수) 받아옴
        *        ➡ return result
        */
        int result = boardMapper.insert(board);
        return result > 0;
    }

    /**
     * 게시글 수정
     */
    @Override
    public boolean update(Board board) throws Exception {
        // TODO : boardMapper 로 update(Board) 호출
        /*
         *        ➡ int result 로 데이터 처리 행(개수) 받아옴
         *        ➡ return result
         */
        int result = boardMapper.update(board);
        return result > 0;
    }

    /**
     * 게시글 삭제
     */
    @Override
    public boolean delete(int no) throws Exception {
        // TODO : boardMapper 로 delete(no) 호출
        /*
         *        ➡ int result 로 데이터 처리 행(개수) 받아옴
         *        ➡ return result
         */
        int result = boardMapper.delete(no);
        return result > 0;
    }


}
