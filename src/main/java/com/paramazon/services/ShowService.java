package com.paramazon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paramazon.entities.ShowEntity;
import com.paramazon.repositories.ShowRepository;

@Service
public class ShowService {

	@Autowired
	private ShowRepository repository;

	public List<ShowEntity> findAll() {
		List<ShowEntity> list = repository.findAll();
		return list;
	}

	public ShowEntity findById(Long id) {
		return repository.findById(id).get();
	}
	
	public ShowEntity save(ShowEntity obj) {
		return repository.save(obj);
	}
}
