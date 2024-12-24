package com.example.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson06/ex01")
@Controller
public class Lesson06Ex01Controller {

	// 회원가입 화면
	@GetMapping("/add-user-view")
	public String addUserView() {
		return "lesson06/lesson06AddUser";
	}
	
	// AJAX의 요청
	// 회원가입 진행
	@ResponseBody   
	@PostMapping("/sign-up")
	public String signUp(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("email") String email,
			@RequestParam(value = "introduce", required = false) String introduce) {
		
		// db insert
		
		// 응답
		return "성공";
	}
	
	// 완료 화면
}
