package com.intellismart.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intellismart.entity.FieldUser;
import com.intellismart.entity.MeterInstallation;

@Repository
public interface MeterInstallationRepository extends JpaRepository<MeterInstallation,Integer> {
	
	
	
}
