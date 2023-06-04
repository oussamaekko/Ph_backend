package com.chaourad.localisation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaourad.localisation.entites.Garde;
import com.chaourad.localisation.entites.Pharmacie;
import com.chaourad.localisation.entites.PharmacieService;
import com.chaourad.localisation.entites.PharmacieServiceKey;
import com.chaourad.localisation.entites.Ville;
import com.chaourad.localisation.entites.Zone;
import com.chaourad.localisation.repository.GardePharRepository;
import com.chaourad.localisation.repository.GardeRepository;
import com.chaourad.localisation.repository.PharmicieRepository;
import com.chaourad.localisation.repository.VilleRepository;
import com.chaourad.localisation.repository.ZoneRepository;
import com.chaourad.localisation.service.GardeService;
import com.chaourad.localisation.service.PharmacieServ;
import com.chaourad.localisation.service.VilleService;
import com.chaourad.localisation.service.ZoneService;

@RestController
@RequestMapping("/api/pharmacies")
@CrossOrigin("http://localhost:3000")
public class PharmacieController {

	@Autowired
	private PharmacieServ pharmacierepository;
	
	@Autowired
	private  VilleService villeRepop;
	
	@Autowired
	private  ZoneService zoneRepository;
	@Autowired
	private GardeService gerdeRepository;
	
	
	

	@PostMapping("/save")
	public void save(@RequestBody Pharmacie Garde) {
		pharmacierepository.save(Garde);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Pharmacie s = pharmacierepository.findById(Integer.parseInt(id));
		pharmacierepository.delete(s);
	}

	@GetMapping("")
	public List<Pharmacie> findAll() {
		return pharmacierepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return pharmacierepository.count();
	}
	/*
	 * 
	 * @GetMapping("/ville/{id1}/zones/{id2}") 
	 * public List<Pharmacie>findByPharmacieByZone(@PathVariable String id1 , @PathVariable String id2) {
	 * Ville ville = villerepository.findById(Integer.parseInt(id1)); Zone zone =
	 * zoneRepository.findById(Integer.parseInt(id2)); return zone.getPharmacies();
	 * }
	 */
	@GetMapping("/id/{id}")
	public Pharmacie findByPharmacie(@PathVariable int id) {
		Pharmacie s = pharmacierepository.findById(id);
		
		return s;
	}
	

	
	//SELECT c.date_debut , c.date_fin FROM `pharmacie` p , pharmacie_service c WHERE c.pharmacie=p.id AND p.id=1;
}