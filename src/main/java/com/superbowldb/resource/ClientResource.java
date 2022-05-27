package com.superbowldb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superbowldb.model.Superbowl;
import com.superbowldb.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientResource {
	
	private final ClientService clientService;
	
	@Autowired
	ClientResource(ClientService clientService){
		this.clientService = clientService;
	}
	
	/*
	 ******** Routes********
	*/
	/** route for all super bowls */
	@GetMapping("/superbowls")
	List<Superbowl> all(){
		return clientService.allSuperbowls();
	}
	
	
	@GetMapping("/superbowl/{id}")
	Superbowl single(@PathVariable int id) {
		return clientService.singleSuperbowl(id);
	}
	
	
}