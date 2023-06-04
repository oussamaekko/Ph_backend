package com.chaourad.localisation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaourad.localisation.dao.IDao;
import com.chaourad.localisation.entites.Ville;
import com.chaourad.localisation.entites.Zone;
import com.chaourad.localisation.repository.VilleRepository;
import com.chaourad.localisation.repository.ZoneRepository;

@Service
public class ZoneService  implements IDao<Zone> {

	@Autowired
	private ZoneRepository zoneRepository;

	@Override
	public void save(Zone o) {
		zoneRepository.save(o);
	}

	@Override
	public Zone findById(int id) {
		// TODO Auto-generated method stub
		return zoneRepository.findById(id);
	}

	@Override
	public void delete(Zone o) {
		zoneRepository.delete(o);

	}

	@Override
	public void update(Zone o) {
		zoneRepository.save(o);

	}

	@Override
	public List<Zone> findAll() {
		
		return zoneRepository.findAll();
	}

	public long count() {
		// TODO Auto-generated method stub
		return zoneRepository.count();
	}

}
