package com.example.rentcar.practice.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.rentcar.practice.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	
	List<Employee> showAllEmployees();
	
	Employee findEmployee(int id);
	
	List<Employee> findEmployeeByName(String name);
}
