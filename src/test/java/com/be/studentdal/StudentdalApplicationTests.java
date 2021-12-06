package com.be.studentdal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.be.studentdal.model.Student;
import com.be.studentdal.repository.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository repository;
	

	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("leo");
		student.setFee(10.98);
		student.setCourse("Java");
		repository.save(student);
	}
	
	@Test
	void testFindStudentById() {
		Student student = repository.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student = repository.findById(1l).get();
		student.setFee(40.32);
		repository.save(student);
	}
	
	@Test
	void testDeleteStudent() {
		Student student = repository.findById(1l).get();
		repository.delete(student);
	}
	

}
