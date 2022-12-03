package com.example.BackendChallange.dto;

import com.example.BackendChallange.model.Company;
import com.example.BackendChallange.model.Employee;

public class OrderRequest {

	
	private Employee employee;

	public OrderRequest(Employee employee) {
		super();
		this.employee = employee;
	}

	public OrderRequest() {
		super();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "OrderRequest [employee=" + employee + "]";
	}
	
}
