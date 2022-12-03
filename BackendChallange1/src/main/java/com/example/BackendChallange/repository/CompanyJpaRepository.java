package com.example.BackendChallange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BackendChallange.model.Company;

public interface CompanyJpaRepository extends JpaRepository<Company, Integer>{

	
}
