package com.chaourad.localisation.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaourad.localisation.entites.Pharmacie;
import com.chaourad.localisation.entites.PharmacieService;
import com.chaourad.localisation.entites.PharmacieServiceKey;
import com.chaourad.localisation.entites.Ville;
import com.chaourad.localisation.entites.Zone;
import com.chaourad.localisation.repository.GardePharRepository;
import com.chaourad.localisation.service.GardeService;
import com.chaourad.localisation.service.PharmacieServiceService;
import com.chaourad.localisation.service.VilleService;
import com.chaourad.localisation.service.ZoneService;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.*;
@RestController
@RequestMapping("/api/gardepharmacie")
@CrossOrigin("http://localhost:3000")
public class GardePharmacieController {

	@Autowired
	private PharmacieServiceService gerdeRepository;
	@Autowired
	private VilleService villeService;
	@Autowired
	private ZoneService zoneRepository;
	@Autowired 
	private GardeService gardeService;

	@PostMapping("/save")
	public void save(@RequestBody PharmacieService gardePharmacie) {
		gerdeRepository.save(gardePharmacie);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		PharmacieService s = gerdeRepository.findById(Integer.parseInt(id));
		gerdeRepository.delete(s);
	}

	@GetMapping("")
	public List<PharmacieService> findAll() {
		return gerdeRepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return gerdeRepository.count();
	}
	/*
	 * 
	 * @GetMapping("/ville/{id1}/zones/{id2}") public List<Pharmacie>
	 * findByPharmacieByZone(@PathVariable String id1 , @PathVariable String id2) {
	 * Ville ville = villerepository.findById(Integer.parseInt(id1)); Zone zone =
	 * zoneRepository.findById(Integer.parseInt(id2)); return zone.getPharmacies();
	 * }
	 */

	@GetMapping("/zone/{zone}/garde/{garde}")
	public PharmacieService findByPharmacie(@PathVariable int zone ,@PathVariable int garde ) {
		PharmacieService s = gerdeRepository.findById(zone);
		return s;
	}
	

}