package com.be.studentdal.repository;

import org.springframework.data.repository.CrudRepository;

import com.be.studentdal.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
