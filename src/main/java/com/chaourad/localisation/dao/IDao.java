package com.chaourad.localisation.dao;

import java.util.List;

public interface IDao<T> {
	void save(T o);
	T findById(int id);
	void delete(T o);
	void update(T o);
	List<T> findAll();

}
