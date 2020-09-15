package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Company;
import com.example.demo.repository.ICompanyRep;
@Service
public class CompanyService implements ICompanyService {
	@Autowired
	ICompanyRep rep;
	
	public List<Company> getAll(){
		return rep.findAll();
	}
	
	
	public Company add(Company company){
		return rep.save(company);
	}


	@Override
	public void update(Company company) {
	Optional<Company> c = rep.findById(company.getIdCompany());
	if (c.isPresent()) {
		rep.save(company);
	}
		
		
	}


	@Override
	public void delete(Long id) {
		Company c =new Company();
		c.setIdCompany(id);
		rep.delete(c);
	
	}


}
