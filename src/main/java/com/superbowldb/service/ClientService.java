package com.superbowldb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superbowldb.exception.SuperbowlNotFoundException;
import com.superbowldb.model.Superbowl;
import com.superbowldb.repository.SuperbowlRepository;

@Service
public class ClientService {
	private final SuperbowlRepository superbowlRepository;
	
	@Autowired
	ClientService(SuperbowlRepository superbowlRepository){
		this.superbowlRepository = superbowlRepository;
	}
	
	public List<Superbowl> allSuperbowls(){
		return superbowlRepository.findAll();
	}
	
	public Superbowl singleSuperbowl(int id) {
		return superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
	}
}
