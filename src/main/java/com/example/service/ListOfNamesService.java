package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.ListOfNamesEntity;
import com.example.model.Detail;

@Service
public interface ListOfNamesService {
	
	String getName(int id);
	
	ListOfNamesEntity postdetails(Detail items);
}
