package com.example.demo;

import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DockerApplication implements CommandLineRunner {
	
@Autowired
CompanyService service;
java.util.logging.Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		if(service.getAll().isEmpty()) {
			
			logger.log(Level.INFO, "Insertion d'un enregistrement dans la table company");
			service.add(new Company(new Long(1), "moneyCore", "La defense", "0758838977"));
		}
	}

}
