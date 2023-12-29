package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ListOfNamesEntity;
import com.example.model.Detail;
import com.example.serviceImp.ListOfNamesServiceImp;

import jakarta.websocket.server.PathParam;

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
	
	@PutMapping(value = "/put/listofnames/")
	
	private ListOfNamesEntity putuserdetails(@RequestBody Detail items) {
		ListOfNamesEntity putdetails = imp.putdetails(items);
		return putdetails;
	}
	
	@PatchMapping(value="/path/listofnames/")
	
	private ListOfNamesEntity pathuserdetails(@RequestBody Detail items) {
		ListOfNamesEntity patchdetails = imp.patchdetails(items);
		return patchdetails;
	}
	
	@DeleteMapping(value="/delete/listofnames/")
	
	private ListOfNamesEntity deleteuserdetails(@RequestParam int id) {
		ListOfNamesEntity deletedetails = imp.deletedetails(id);
		return deletedetails;
	}
}
