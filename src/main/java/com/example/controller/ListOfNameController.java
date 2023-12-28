package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ListOfNamesEntity;
import com.example.model.Detail;
import com.example.serviceImp.ListOfNamesServiceImp;

@RestController
public class ListOfNameController {
	
	@Autowired
	ListOfNamesServiceImp imp;
	
	@GetMapping(value = "/get/listofnames/")
	private String getNames(@RequestParam int id) {
		String name = imp.getName(id);
		return name;
	}
	
	@PostMapping(value = "/post/listofnames/")
	
	private ListOfNamesEntity postuserdetails(@RequestBody Detail items) {
		ListOfNamesEntity postdetails = imp.postdetails(items);
		return postdetails;
	}
}
