package com.chaourad.localisation.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.chaourad.localisation.entites.Pharmacie;
import com.chaourad.localisation.entites.Ville;

public interface VilleRepository extends JpaRepository<Ville,Integer>{

	Ville findById(int id);
	
	@Query("SELECT p FROM Ville v JOIN v.zones z JOIN z.pharmacies p JOIN p.pharmacieServices gp JOIN gp.garde g  WHERE g.type=:garde AND v.nom = :ville AND z.nom=:zone")
	 Collection<Pharmacie> findByNom3(@Param("ville") String ville, @Param("zone") String zone, @Param("garde") String garde);
}
