package com.superbowldb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.superbowldb.model.Superbowl;
import com.superbowldb.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminResource {
	private final AdminService adminService;
	
	@Autowired
	AdminResource(AdminService adminService){
		this.adminService = adminService;
	}

	/** 
	 *     		 Routes 
	 * 								**/
	@PostMapping("/newRecords")
	ResponseEntity<?> addRecords(@RequestBody List<Superbowl> superbowls) {
		return adminService.insertRecords(superbowls);
	}
	
	@PostMapping("/newRecord")
	ResponseEntity<?> addRecord(@RequestBody Superbowl superbowl) {
		return adminService.insertSingleRecord(superbowl);
	}
	
	@PutMapping("/updateRecord")
	ResponseEntity<?> updateRecord(@RequestBody Superbowl superbowl) {
		return adminService.updateRecord(superbowl);
	}
	
	@PostMapping("/deleteRecord/{id}")
	ResponseEntity<?> deleteRecord(@PathVariable int id) {
		return adminService.deleteRecord(id);
	}
	
}
