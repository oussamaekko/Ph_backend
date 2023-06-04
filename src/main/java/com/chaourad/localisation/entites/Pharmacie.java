package com.chaourad.localisation.entites;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Pharmacie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String nom;
	private String adresse;
	private double laltitude;
	private double longitude;
	private String photo;
/*	@OneToMany(mappedBy = "pharmacie")
	private  List<Photo> photo;
	@ManyToOne
	private Zone zone;
	
	@OneToMany(mappedBy = "pharmacie", fetch = FetchType.EAGER)
	List<User> user;
	

	@JsonIgnore
	@OneToMany(mappedBy = "pharmacie" , fetch = FetchType.EAGER)
	private List<PharmacieService> pharmacieServices;

	*/
	@ManyToOne
	private Zone zone;

	@OneToMany(mappedBy = "pharmacie", fetch = FetchType.EAGER)
	List<User> user;



	@OneToMany(mappedBy = "pharmacie", fetch = FetchType.EAGER)
	private List<PharmacieService > pharmacieServices;

	
	public List<PharmacieService> getPharmacieServices() {
		return pharmacieServices;
	}

	public void setPharmacieServices(List<PharmacieService> pharmacieServices) {
		this.pharmacieServices = pharmacieServices;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getLaltitude() {
		return laltitude;
	}

	public void setLaltitude(double laltitude) {
		this.laltitude = laltitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Pharmacie() {
		super();
	}

	

}
