package com.paramazon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paramazon.entities.SingerEntity;
import com.paramazon.repositories.SingerRepository;

@Service
public class SingerService {

	@Autowired
	private SingerRepository repository;
	
	public List<SingerEntity> findAll(){
		return repository.findAll();
	}
	
	public SingerEntity findById(Long id) {
		return repository.findById(id).get();
	}
	
	public SingerEntity save(SingerEntity obj) {
		return repository.save(obj);
	}
}
