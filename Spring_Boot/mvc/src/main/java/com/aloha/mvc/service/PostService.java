package com.aloha.mvc.service;

import java.util.List;

import com.aloha.mvc.dto.Posts;

public interface PostService {
        // 목록
    public List<Posts> list() throws Exception;
    // 조회
    public Posts select(Integer no) throws Exception;
    // 등록
    public boolean insert(Posts no) throws Exception;
    // 수정
    public boolean update(Posts no) throws Exception;
    // 삭제
    public boolean delete(Integer no) throws Exception;
}
