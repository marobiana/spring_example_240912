package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {
	
	// input: id(int)
	// output: Review
	public Review selectReviewById(int id);
	
	// i: Review
	// o: void or int(성공한 행의 개수)-mybatis가 채워줌
	public int insertReview(Review review);
}




