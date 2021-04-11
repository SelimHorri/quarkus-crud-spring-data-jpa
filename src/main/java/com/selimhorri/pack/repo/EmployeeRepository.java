package com.selimhorri.pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.pack.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	
}
