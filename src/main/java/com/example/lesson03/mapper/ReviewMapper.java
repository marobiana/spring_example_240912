package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {
	
	// input: id(int)
	// output: Review
	public Review selectReviewById(int id);
	
	// i: Review
	// o: void or int(성공한 행의 개수)-mybatis가 채워줌
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			// 하나의 맵으로 구성해서 xml로 넘긴다
			@Param("storeId") int storeId11314431, 
			@Param("menu") String menu234234,
			@Param("userName1111111") String userName234, 
			@Param("point") Double point23, 
			@Param("review") String review555);
	
	public int updateReviewById(
			@Param("id") int id, 
			@Param("review") String review);
	
	public int deleteReviewById(int id);
}




