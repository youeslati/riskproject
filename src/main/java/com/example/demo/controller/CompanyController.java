package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	
	@Autowired
	CompanyService service;
	@GetMapping("/get")
	public List<Company> getliste(){
		return service.getAll();
				
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		 service.delete(id);
		return "delete completed";
				
	}
	
	@PostMapping("/add")
	public Company delete(@RequestBody Company company ){
		return service.add(company);
				
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Company company ){
		 service.update(company);
				
	}
}
