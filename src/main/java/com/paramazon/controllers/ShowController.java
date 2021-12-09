package com.paramazon.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paramazon.entities.ShowEntity;
import com.paramazon.services.ShowService;

@RestController
@RequestMapping(value = "/shows")
public class ShowController {

	@Autowired
	private ShowService service;
	
	@GetMapping
	public ResponseEntity<List<ShowEntity>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ShowEntity> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<ShowEntity> save (@Valid @RequestBody ShowEntity obj){
		return ResponseEntity.ok().body(service.save(obj));
	}
}
