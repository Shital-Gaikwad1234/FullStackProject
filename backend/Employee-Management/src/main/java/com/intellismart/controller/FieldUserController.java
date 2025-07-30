package com.intellismart.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intellismart.entity.FieldUser;
import com.intellismart.repository.FieldUserRepository;

@RestController
@RequestMapping("/api")
public class FieldUserController {

@Autowired
private FieldUserRepository fieldUserRepository;

@GetMapping("/fieldusers")
public List<FieldUser> getAllFieldUsers(){
	return fieldUserRepository.findAll();
}

//GetAllSubdivision
@GetMapping("/getAllSubdivision")
public List<String> getAllSubdivision(){
	return getAllFieldUsers().stream().map(FieldUser::getSubdivision).distinct().collect(Collectors.toList());
}


@GetMapping("/search")
public ResponseEntity<List<FieldUser>> searchByNameAndSubdivision(@RequestParam String name, @RequestParam String subdivision){
	
	if(name==null || name.trim().isEmpty() || subdivision==null || subdivision.trim().isEmpty()) {
		this.getAllFieldUsers();
	}
	
	List<FieldUser> foundUsers = fieldUserRepository.findByNameAndSubdivision(name, subdivision);
	
	if(foundUsers.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	else {
		return new ResponseEntity<>(foundUsers,HttpStatus.OK);
	}
}

}
