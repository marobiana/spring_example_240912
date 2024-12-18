package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.domain.Student;
import com.example.lesson04.mapper.StudentMapper;

@Service
public class StudentBO {

	@Autowired
	private StudentMapper studentMapper;
	
	// i: 파라미터4개 => Student
	// o: X 
	public void addStudent(Student student1111) {
		studentMapper.insertStudent(student1111);
	}
	
	public Student getStudentById(int id) {
		return studentMapper.selectStudentById(id);
	}
}
