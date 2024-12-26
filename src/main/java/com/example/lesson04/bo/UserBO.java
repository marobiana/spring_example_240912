package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.domain.User;
import com.example.lesson04.mapper.UserMapper;

@Service
public class UserBO {
	
	@Autowired
	private UserMapper userMapper;

	public void addUser(String name, String yyyymmdd,
			String email, String introduce) {
		
		userMapper.insertUser(name, yyyymmdd, email, introduce);
	}
	
	public User getLatestUser() {
		return userMapper.selectLatestUser();
	}
	
	// i: name
	// o: boolean 중복 true, 중복 아님 false
	public boolean isDuplicateByName(String name) {
		return userMapper.isDuplicateByName(name);
	}
}






