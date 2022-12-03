package com.example.BackendChallange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BackendChallange.model.Employee;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer>{

	
	
}
