package com.example.serviceImp;

import java.util.Optional;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.ListOfNamesEntity;
import com.example.model.Detail;
import com.example.repo.ListOfNamesRepo;
import com.example.service.ListOfNamesService;

import jakarta.persistence.EntityNotFoundException;


@Component
public class ListOfNamesServiceImp implements ListOfNamesService {

	@Autowired
	ListOfNamesRepo repo;
	
	@Override
	public String getName(int id) {
		
		Optional<ListOfNamesEntity> findById = repo.findById(id);
		
		if(!findById.isEmpty()) {
			ListOfNamesEntity listOfNamesEntity = findById.get();
			String user_name = listOfNamesEntity.getUser_name();
			return user_name ;
			
		}else {
			throw new EntityNotFoundException("id not found");
		}
	}

	@Override
	public ListOfNamesEntity postdetails(Detail items) {
		Optional<ListOfNamesEntity> findById = repo.findById(items.getUser_id());
		
		if(findById.isEmpty()) {
			ListOfNamesEntity entity = new ListOfNamesEntity();
			
			
			entity.setUser_id(items.getUser_id());
			entity.setUser_name(items.getUser_name());
			
			ListOfNamesEntity save = repo.save(entity);
			return save;
		}else {
			throw new IllegalArgumentException("id is present");
		}
		
	}
}
