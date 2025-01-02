package com.example.lesson07.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lesson07.entity.StudentEntity;

// 제네릭 : <엔티티, pk의 타입>
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	// 순수한 JPA vs Spring Data JPA
	//public StudentEntity save(StudentEntity se); // insert(id가 0) or update(id 0보다 크면)
	//public Optional<StudentEntity> findById(int id);
	//public void delete(StudentEntity se);
}
