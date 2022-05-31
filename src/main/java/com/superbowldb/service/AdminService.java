package com.superbowldb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superbowldb.repository.SuperbowlRepository;

@Service
public class AdminService {
	private final SuperbowlRepository superbowlRepository;
	
	@Autowired
	AdminService(SuperbowlRepository superbowlRepository){
		this.superbowlRepository = superbowlRepository;
	}
	
	//insert multiple records
	//insert one record
	//update one record
	//delete a single record
}
