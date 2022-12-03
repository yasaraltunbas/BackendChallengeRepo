package com.example.BackendChallange.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BackendChallange.dto.OrderRequest;
import com.example.BackendChallange.model.Company;
import com.example.BackendChallange.model.Employee;
import com.example.BackendChallange.repository.CompanyJpaRepository;
import com.example.BackendChallange.repository.EmployeeJpaRepository;

@RestController

public class Controller {
	@Autowired
	private CompanyJpaRepository companyJpaRepository;
	@Autowired
	private EmployeeJpaRepository employeeJpaRepository;

	
	
	@GetMapping("/getAllCompany")
	public List<Company> getAll() {
		return this.companyJpaRepository.findAll();
	}
	@GetMapping("/{companyId}")
	public List<Employee> getAllEmployeesByCompanyId(int companyId){
		
		List<Employee> employees = employeeJpaRepository.findAll();
		return employees.stream().filter(x->x.getCompanyId()==companyId).toList();
	}
	
	@PostMapping("/add")
	public Employee addOneEmployeeToCompany(@RequestBody OrderRequest request) {
		return employeeJpaRepository.save(request.getEmployee());

	}
	
	
	
	@PutMapping("/{employeeId}")
		public Employee updateOneEmployee(@PathVariable int employeeId, @RequestBody Employee newEmployee)
		{
			Optional<Employee> employee = employeeJpaRepository.findById(employeeId);
			if(employee.isPresent()) {
				Employee foundEmployee = employee.get();
				foundEmployee.setEmployeeName(newEmployee.getEmployeeName());
				foundEmployee.setEmployeeSurname(newEmployee.getEmployeeSurname());
				foundEmployee.setEmployeeYear(newEmployee.getEmployeeYear());
				foundEmployee.setCompanyId(newEmployee.getCompanyId());
				employeeJpaRepository.save(foundEmployee);
				return foundEmployee;
			}

			else
				return null;
		}
		
	
	@DeleteMapping("/{employeeId}")
	
	public void deleteOneEmployee(@PathVariable int employeeId) {
		
		Optional<Employee> employee = employeeJpaRepository.findById(employeeId);
		if(employee.isPresent()) {
			Employee foundEmployee = employee.get();
			
			employeeJpaRepository.deleteById(employeeId);
	
	}
		}

}
