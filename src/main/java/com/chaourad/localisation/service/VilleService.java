package com.chaourad.localisation.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaourad.localisation.dao.IDao;
import com.chaourad.localisation.entites.Pharmacie;
import com.chaourad.localisation.entites.Ville;
import com.chaourad.localisation.repository.VilleRepository;
@Service
public class VilleService implements IDao<Ville> {

	@Autowired
	private VilleRepository villeRepository;

	@Override
	public void save(Ville o) {
		villeRepository.save(o);
	}

	@Override
	public Ville findById(int id) {
		// TODO Auto-generated method stub
		return villeRepository.findById(id);
	}

	@Override
	public void delete(Ville o) {
		villeRepository.delete(o);

	}

	@Override
	public void update(Ville o) {
		villeRepository.save(o);

	}

	@Override
	public List<Ville> findAll() {
		
		return villeRepository.findAll();
	}

	public Collection<Pharmacie> findByNom3(String ville, String zone, String periode) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return villeRepository.count();
	}

}
