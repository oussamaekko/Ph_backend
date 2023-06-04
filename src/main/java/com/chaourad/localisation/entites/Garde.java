package com.chaourad.localisation.entites;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Garde {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	@JsonIgnore
	@OneToMany(mappedBy = "garde" , fetch = FetchType.EAGER)

	private List<PharmacieService> pharmacieServices;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<PharmacieService> getPharmacieServices() {
		return pharmacieServices;
	}

	public void setPharmacieServices(List<PharmacieService> pharmacieServices) {
		this.pharmacieServices = pharmacieServices;
	}

	
}
