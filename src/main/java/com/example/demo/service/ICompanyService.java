package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Company;

public interface ICompanyService {

	public List<Company>  getAll();
	public Company add(Company company); 
	public void update(Company company); 
	public void delete(Long id); 
}
