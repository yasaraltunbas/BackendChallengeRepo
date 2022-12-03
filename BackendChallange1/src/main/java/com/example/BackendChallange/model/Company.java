package com.example.BackendChallange.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {

	@Id
	
	private int id;
	private String companyName;
	


	public int getId() {
		return id;
	}
	
	

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

	public Company(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
		
	}

	public Company() {
		super();
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + "]";
	}
	
	

	
}
