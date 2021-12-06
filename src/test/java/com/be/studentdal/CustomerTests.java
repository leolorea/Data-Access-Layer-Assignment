package com.be.studentdal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.be.studentdal.model.Customer;
import com.be.studentdal.repository.CustomerRepository;

@SpringBootTest
public class CustomerTests {
	
	@Autowired
	private CustomerRepository repository;
	
	@Test
	void saveCustumerTest() {
		Customer customer = new Customer();
		
		customer.setName("leo");
		customer.setEmail("leo@leo.com");
		repository.save(customer);
	}
	
	@Test 
	void findCustumerByIdTest() {
		
		Customer customer = repository.findById(1l).get();
		System.out.println(customer);
	}
	
	@Test
	void updateCustomerTest() {
		Customer customer = repository.findById(1l).get();
		customer.setName("Leonardo");
		repository.save(customer);
	}
	
	@Test
	void deleteCustomerTest() {
		Customer customer = repository.findById(3l).get();
		repository.delete(customer);
		
		
	}

}
