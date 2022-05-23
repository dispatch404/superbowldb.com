package com.superbowldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superbowldb.model.Superbowl;

@Repository
public interface SuperbowlRepository extends JpaRepository<Superbowl, Integer>{

} 
