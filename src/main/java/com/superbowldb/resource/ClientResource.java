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
	/*
	@GetMapping("/superbowl/{id}/date")
	String date(@PathVariable int id) {
		return clientService.getDate(id);
	}
	
	@GetMapping("superbowl/{id}/attendance")
	int attendance(@PathVariable int id) {
		return clientService.getAttendance(id);
	}
	
	@GetMapping("superbowl/{id}/qbWinner")
	String qbWinner(@PathVariable int id) {
		return clientService.getQbWinner(id);
	}
	
	@GetMapping("superbowl/{id}/coachWinner")
	String coachWinner(@PathVariable int id) {
		return clientService.getCoachWinner(id);
	}
	
	@GetMapping("superbowl/{id}/winner")
	String winner(@PathVariable int id) {
		return clientService.getWinner(id);
	}
	
	@GetMapping("superbowl/{id}/winningPoints")
	String winningPoints(@PathVariable int id) {
		return clientService.getWinningPoints(id);
	}
	
	@GetMapping("superbowl/{id}/qbLoser")
	String qbLoser(@PathVariable int id) {
		return clientService.getQbLoser(id);
	}
	
	@GetMapping("superbowl/{id}/coachLoser")
	String coachLoser(@PathVariable int id) {
		return clientService.getcoachLoser(id);
	}
	
	@GetMapping("superbowl/{id}/loser")
	String loser(@PathVariable int id) {
		return clientService.getLoser(id);
	}
	
	@GetMapping("superbowl/{id}/losingPoints")
	String losingPoints(@PathVariable int id) {
		return clientService.getLosingPoints(id);
	}
	
	@GetMapping("superbowl/{id}/losingPoints")
	String losingPoints(@PathVariable int id) {
		return clientService.getLosingPoints(id);
	}
	
	@GetMapping("superbowl/{id}/mvp")
	String mvp(@PathVariable int id) {
		return clientService.getMvp(id);
	}
	
	@GetMapping("superbowl/{id}/stadium")
	String stadium(@PathVariable int id) {
		return clientService.getStadium(id);
	}
	
	@GetMapping("superbowl/{id}/city")
	String city(@PathVariable int id) {
		return clientService.getCity(id);
	}
	
	@GetMapping("superbowl/{id}/state")
	String state(@PathVariable int id) {
		return clientService.getState(id);
	}
	
	@GetMapping("superbowl/{id}/pointDifference")
	String pointDifference(@PathVariable int id) {
		return clientService.getPointDifference(id);
	}
	
	@GetMapping("superbowl/{id}/score")
	String score(@PathVariable int id) {
		return clientService.getScore(id);
	}
	
	@GetMapping("superbowl/{id}/referee")
	String referee(@PathVariable int id) {
		return clientService.getReferee(id);
	}
	
	@GetMapping("superbowl/{id}/umpire")
	String umpire(@PathVariable int id) {
		return clientService.getUmpire(id);
	}*/
	
}