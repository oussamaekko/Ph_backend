package com.chaourad.localisation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaourad.localisation.entites.Garde;

public interface GardeRepository extends JpaRepository<Garde, Integer>{
	Garde findById(int id);
}
