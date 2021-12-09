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

import com.paramazon.entities.SingerEntity;
import com.paramazon.services.SingerService;

@RestController
@RequestMapping(value = "/singers")
public class SingerController {

	@Autowired
	private SingerService service;
	
	@GetMapping
	public ResponseEntity<List<SingerEntity>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<SingerEntity> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<SingerEntity> save(@Valid @RequestBody SingerEntity obj){
		return ResponseEntity.ok().body(obj);
	}
}