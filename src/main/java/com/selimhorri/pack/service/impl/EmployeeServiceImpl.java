package com.selimhorri.pack.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.selimhorri.pack.entity.Employee;
import com.selimhorri.pack.repo.EmployeeRepository;
import com.selimhorri.pack.service.EmployeeService;

@ApplicationScoped
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Inject
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		return this.employeeRepository.findAll();
	}
	
	@Override
	public Employee findById(Integer id) {
		return this.employeeRepository.findById(id).orElseThrow(() -> new NoSuchElementException(""));
	}
	
	@Override
	public Employee save(Employee employee) {
		return this.employeeRepository.save(employee);
	}
	
	@Override
	public Employee update(Employee employee) {
		return this.employeeRepository.save(employee);
	}
	
	@Override
	public void deleteById(Integer id) {
		this.employeeRepository.deleteById(id);
	}
	
	
	
}






