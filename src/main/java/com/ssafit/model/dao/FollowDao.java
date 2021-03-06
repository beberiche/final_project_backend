package com.ssafit.model.dao;

import java.util.List;

import com.ssafit.model.dto.Follow;

public interface FollowDao {
	// Follow 등록
	void insertFollow(Follow follow);

	// Follow 삭제
	boolean deleteFollw(int no);

	// Follow 조회
	List<Follow> selectList(String userId);
}
