package com.chaourad.localisation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaourad.localisation.dao.IDao;
import com.chaourad.localisation.entites.PharmacieService;
import com.chaourad.localisation.entites.User;
import com.chaourad.localisation.repository.GardePharRepository;
import com.chaourad.localisation.repository.UserRepository;
@Service
public class PharmacieServiceService implements IDao<PharmacieService> {

	@Autowired
	private GardePharRepository gardePharRepository;

	@Override
	public void save(PharmacieService o) {
		gardePharRepository.save(o);
	}

	@Override
	public PharmacieService findById(int id) {
		// TODO Auto-generated method stub
		return gardePharRepository.findById(id);
	}

	@Override
	public void delete(PharmacieService o) {
		gardePharRepository.delete(o);

	}

	@Override
	public void update(PharmacieService o) {
		gardePharRepository.save(o);

	}

	@Override
	public List<PharmacieService> findAll() {
		
		return gardePharRepository.findAll();
	}

	public long count() {
		// TODO Auto-generated method stub
		return gardePharRepository.count();
	}

}
