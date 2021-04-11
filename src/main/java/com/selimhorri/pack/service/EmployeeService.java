package com.selimhorri.pack.service;

import java.util.List;

import com.selimhorri.pack.entity.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	Employee findById(final Integer id);
	Employee save(final Employee employee);
	Employee update(final Employee employee);
	void deleteById(final Integer id);
	
}
