package com.chaourad.localisation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaourad.localisation.entites.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findById(int id);
	User findByEmail(String email);
}