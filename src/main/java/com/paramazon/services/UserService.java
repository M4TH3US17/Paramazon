package com.paramazon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paramazon.entities.UserEntity;
import com.paramazon.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<UserEntity> findAll(){
		return repository.findAll();
	}
	
	public UserEntity findById(Long id){
		return repository.findById(id).get();
	}
	
	public UserEntity insert(UserEntity obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
