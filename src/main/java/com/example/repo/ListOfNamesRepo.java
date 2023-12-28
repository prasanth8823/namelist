package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.ListOfNamesEntity;

public interface ListOfNamesRepo extends JpaRepository<ListOfNamesEntity, Integer> {
	
}
