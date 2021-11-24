package com.paramazon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paramazon.entities.ShowEntity;

public interface ShowRepository extends JpaRepository<ShowEntity, Long> {

}
