package com.chaourad.localisation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaourad.localisation.entites.Garde;
import com.chaourad.localisation.entites.Pharmacie;
import com.chaourad.localisation.entites.PharmacieService;
import com.chaourad.localisation.entites.PharmacieServiceKey;

public interface GardePharRepository extends JpaRepository<PharmacieService, Integer> {
	PharmacieService findById(int id);
	List<PharmacieService> findByPharmacie(Pharmacie pharmacie);
List<PharmacieService> findById(PharmacieServiceKey id);
}
