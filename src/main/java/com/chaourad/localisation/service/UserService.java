package com.chaourad.localisation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaourad.localisation.dao.IDao;
import com.chaourad.localisation.entites.User;
import com.chaourad.localisation.entites.Zone;
import com.chaourad.localisation.repository.UserRepository;
import com.chaourad.localisation.repository.ZoneRepository;
@Service
public class UserService implements IDao<User> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(User o) {
		userRepository.save(o);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void delete(User o) {
		userRepository.delete(o);

	}

	@Override
	public void update(User o) {
		userRepository.save(o);

	}

	@Override
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

	public long count() {
		// TODO Auto-generated method stub
		return userRepository.count();
	}

}
