package com.be.studentdal.repository;

import org.springframework.data.repository.CrudRepository;

import com.be.studentdal.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
