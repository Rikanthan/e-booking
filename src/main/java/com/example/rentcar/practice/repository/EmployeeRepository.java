package com.example.rentcar.practice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.rentcar.practice.model.Employee;


public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
	@Query("{name:'?0'}")
	List<Employee> findByName(String name);
}
