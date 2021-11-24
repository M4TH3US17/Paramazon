package com.paramazon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paramazon.entities.SingerEntity;

public interface SingerRepository extends JpaRepository<SingerEntity, Long>{

}
