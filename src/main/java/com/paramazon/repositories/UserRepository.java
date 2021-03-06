package com.paramazon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paramazon.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
