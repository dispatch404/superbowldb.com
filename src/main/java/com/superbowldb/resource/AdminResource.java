package com.superbowldb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.superbowldb.model.Superbowl;
import com.superbowldb.repository.SuperbowlRepository;

@RestController
public class AdminResource {
	private final SuperbowlRepository superbowlRepository;
	
	@Autowired
	AdminResource(SuperbowlRepository superbowlRepository){
		this.superbowlRepository = superbowlRepository;
	}
	
	@PostMapping("/admin/newRecords")
	String addRecords(@RequestBody List<Superbowl> superbowls) {
		if(!superbowls.isEmpty()) {
			superbowlRepository.saveAll(superbowls);
			return "records successfully added";
		}
		else {
			return "records insertion failed";
		}
	}
	
	@PostMapping("/admin/newRecord")
	String addRecord(@RequestBody Superbowl superbowl) {
		if(superbowl != null) {
			superbowlRepository.save(superbowl);
			return "record successfully added";
		}
		else {
			return "record insertion failed";
		}
	}
	
	@PutMapping("/admin/updateRecord/{id}")
	String updateRecord(@RequestBody Superbowl superbowl, @PathVariable int id) {
		return "";
	}
	
	@PostMapping("/admin/deleteRecord/{id}")
	String deleteRecord(@PathVariable int id) {
		return "";
	}	
	
}