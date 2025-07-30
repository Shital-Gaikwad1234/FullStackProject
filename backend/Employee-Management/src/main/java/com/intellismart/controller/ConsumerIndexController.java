package com.intellismart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellismart.entity.ConsumerIndex;
import com.intellismart.repository.ConsumerIndexRepository;

@RestController
@RequestMapping("/api")
public class ConsumerIndexController {

	@Autowired
	private ConsumerIndexRepository consumerIndexRepository;
	
	@GetMapping("/getAllCI")
	public List<ConsumerIndex> getAllCIList(){
		return consumerIndexRepository.findAll();
	}
	
	//Count the number of CI
	@GetMapping("/countCI")
	public ResponseEntity<Long> getConsumerCount(){
		long countCI=consumerIndexRepository.count();
		return new ResponseEntity<>(countCI,HttpStatus.OK);
	}
}
