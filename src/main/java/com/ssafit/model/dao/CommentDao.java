package com.ssafit.model.dao;

import java.util.List;

import com.ssafit.model.dto.Comment;

public interface CommentDao {
	// comment 작성
	void InsertComment(Comment comment);
	// comment 삭제
	boolean deleteComment(int CommentNo);
	// comment 수정
	boolean deleteComment(Comment comment);
	// comment 조회
	// 전체 조회
	List<Comment> selectList(String YotubeId);
	// 상세 보기
	Comment seletOne(int CommentNo);
}
