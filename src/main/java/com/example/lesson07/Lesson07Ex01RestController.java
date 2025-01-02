package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07/ex01")
@RestController
public class Lesson07Ex01RestController {

	@Autowired
	private StudentBO studentBO;
	
	// C: create
	@GetMapping("/create")
	public StudentEntity create() {
		String name = "신보람";
		String phoneNumber = "010-1223-5877";
		String email = "sbr@kakao.com";
		String dreamJob = "디자이너";
		
		return studentBO.addStudent(name, phoneNumber, email, dreamJob);
	}
	
	// U: update
	@GetMapping("/update")
	public StudentEntity update(
			@RequestParam("id") int id) {
		// id가 5번인 dreamJob 변경
		return studentBO.updateStudentDreamJobById(id, "대통령");
	}
	
	@GetMapping("/delete")
	public String delete() {
		// id가 5번인 데이터 삭제
		studentBO.deleteStudentById(5);
		return "삭제 완료";
	}
}





