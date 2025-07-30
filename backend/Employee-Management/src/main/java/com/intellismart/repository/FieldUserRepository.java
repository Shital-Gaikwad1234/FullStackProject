package com.intellismart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intellismart.entity.FieldUser;

@Repository
public interface FieldUserRepository extends JpaRepository<FieldUser, Integer> {

    	List<FieldUser> findByNameAndSubdivision(String name, String subdivision);
}
