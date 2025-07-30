package com.intellismart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intellismart.entity.ConsumerIndex;

@Repository
public interface ConsumerIndexRepository extends JpaRepository<ConsumerIndex, Integer> {

}
