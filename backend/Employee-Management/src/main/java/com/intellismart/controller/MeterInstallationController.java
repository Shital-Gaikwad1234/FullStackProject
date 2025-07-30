package com.intellismart.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.intellismart.entity.MeterInstallation;
import com.intellismart.repository.MeterInstallationRepository;

@RestController
@RequestMapping("/api")
public class MeterInstallationController {

	@Autowired
	private MeterInstallationRepository meterInstallationRepository;
	
	@GetMapping("/getAllMI")
	public List<MeterInstallation> getAllMIList(){
		return meterInstallationRepository.findAll();
	}
	
	//Count the total number of MI
	@GetMapping("/countMI")
	public ResponseEntity<Long>getCountMI(){
		long countMI=meterInstallationRepository.count();
		return new ResponseEntity<Long>(countMI,HttpStatus.OK);
	}
	
}
