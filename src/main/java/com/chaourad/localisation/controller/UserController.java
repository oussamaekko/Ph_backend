package com.chaourad.localisation.controller;

import java.util.ArrayList;
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
import com.chaourad.localisation.entites.User;
import com.chaourad.localisation.repository.RoleRepository;
import com.chaourad.localisation.repository.UserRepository;
import com.chaourad.localisation.service.UserService;

import org.springframework.stereotype.Service;
@RestController
@RequestMapping("/api/user")
@CrossOrigin("http://localhost:3000")
@Service
public class UserController {

	
	@Autowired
	private UserService userrepository;


	@Autowired
	private RoleRepository roleRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody User user) {
		userrepository.save(user);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		User s = userrepository.findById(Integer.parseInt(id));
		userrepository.delete(s);
	}

	@GetMapping("/all")
	public List<User> findAll() {
		return userrepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return userrepository.count();
	}

}