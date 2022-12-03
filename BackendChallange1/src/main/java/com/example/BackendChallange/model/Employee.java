package com.example.BackendChallange.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeSurname;
	private int employeeYear;
	
	private int companyId;
	
	public Employee(int employeeId, String employeeName, String employeeSurname, int employeeYear, int companyId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.employeeYear = employeeYear;
		this.companyId = companyId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSurname() {
		return employeeSurname;
	}
	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}
	public int getEmployeeYear() {
		return employeeYear;
	}
	public void setEmployeeYear(int employeeYear) {
		this.employeeYear = employeeYear;
	}
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSurname="
				+ employeeSurname + ", employeeYear=" + employeeYear + "]";
	}
	
	
	
	
}
