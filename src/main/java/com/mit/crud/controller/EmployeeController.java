package com.mit.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mit.crud.model.Employee;
import com.mit.crud.respositories.EmployeeRespository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRespository empRepo;
	
	@GetMapping("/")
	public List<Employee> getAllEmp() {
		 List<Employee> emp = empRepo.findAll();
		return emp;
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmpById(@PathVariable long id) {
		Optional<Employee> emp = empRepo.findById(id);
		return emp;
	}
	
	@PostMapping("/")
	public Employee createEmp(@RequestBody Employee emp) {
		Employee saveEmp = empRepo.save(emp);
		return saveEmp;
	}
	
}
