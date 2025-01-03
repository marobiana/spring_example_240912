package com.example.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.lesson07.entity.StudentEntity;

// 제네릭 : <엔티티, pk의 타입>
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	// 순수한 JPA vs Spring Data JPA
	//public StudentEntity save(StudentEntity se); // insert(id가 0) or update(id 0보다 크면)
	//public Optional<StudentEntity> findById(int id);
	//public void delete(StudentEntity se);
	//public List<StudentEntity> findAll();
	
	// ex02 select  - JPQL을 만들어내는 메소드명 규칙
	public List<StudentEntity> findAllByOrderByIdDesc();
	public List<StudentEntity> findTop3ByOrderByIdDesc();
	public List<StudentEntity> findByName(String name111343);
	public List<StudentEntity> findByNameIn(List<String> names);
	public List<StudentEntity> findByNameAndDreamJob(String name22, String dreamJob1);
	public List<StudentEntity> findByEmailContains(String keyword);
	public List<StudentEntity> findByNameStartingWith(String keyword);
	public List<StudentEntity> findByIdBetween(int startId, int endId);
	
	// ex02/2   JPQL 엔티티 조회 => SQL query문 아님에 주의
	//@Query(value = "select s from StudentEntity s where s.dreamJob = :dreamJob")
	//public List<StudentEntity> findByDreamJob(@Param("dreamJob") String dreamJob);
	
	// ex02/2   native query => SQL에 직접 조회(Mysql)
	@Query(value = "select * from `new_student` where `dreamJob` = :dreamJob", nativeQuery = true)
	public List<StudentEntity> findByDreamJob(@Param("dreamJob") String dreamJob);
}








