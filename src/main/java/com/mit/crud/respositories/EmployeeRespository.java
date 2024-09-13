package com.mit.crud.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.crud.model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Long>{

}
