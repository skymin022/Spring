package com.aloha.pagehelper.service;

import java.util.List;

import com.aloha.pagehelper.domain.Pagination;
import com.aloha.pagehelper.domain.Posts;
import com.github.pagehelper.PageInfo;

public interface PostService {
    // 목록
    public List<Posts> list() throws Exception;
    // 페이징 목록
    public List<Posts> page(Pagination Pagination) throws Exception;
    // 🟡 pagehelper를 이용한 페이징 처리
    public PageInfo<Posts> page(int page, int size) throws Exception;
    // 조회
    public Posts select(Integer no) throws Exception;
    // 등록
    public boolean insert(Posts no) throws Exception;
    // 수정
    public boolean update(Posts no) throws Exception;
    // 삭제
    public boolean delete(Integer no) throws Exception;
}
