package com.selimhorri.pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.pack.model.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	
}
