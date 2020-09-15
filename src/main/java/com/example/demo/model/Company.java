package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCompany;
	private String nomCompany;
	private String adresseCompany;
	private String numeroCompany;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(Long idCompany, String nomCompany, String adresseCompany, String numeroCompany) {
		super();
		this.idCompany = idCompany;
		this.nomCompany = nomCompany;
		this.adresseCompany = adresseCompany;
		this.numeroCompany = numeroCompany;
	}
	public Long getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(Long idCompany) {
		this.idCompany = idCompany;
	}
	public String getNomCompany() {
		return nomCompany;
	}
	public void setNomCompany(String nomCompany) {
		this.nomCompany = nomCompany;
	}
	public String getAdresseCompany() {
		return adresseCompany;
	}
	public void setAdresseCompany(String adresseCompany) {
		this.adresseCompany = adresseCompany;
	}
	public String getNumeroCompany() {
		return numeroCompany;
	}
	public void setNumeroCompany(String numeroCompany) {
		this.numeroCompany = numeroCompany;
	}

}
