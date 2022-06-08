package com.superbowldb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public ResponseEntity<?> all(){
		return clientService.allSuperbowls();
	}
	
	@GetMapping("/superbowl/{id}")
	public ResponseEntity<?> single(@PathVariable int id) {
		return clientService.singleSuperbowl(id);
	}
	
	@GetMapping("/superbowl/{id}/date")
	public ResponseEntity<?> date(@PathVariable int id) {
		return clientService.getDate(id);
	}
	
	@GetMapping("superbowl/attendance/{id}")
	public ResponseEntity<?> attendance(@PathVariable int id) {
		return clientService.getAttendance(id);
	}
	
	@GetMapping("superbowl/qbWinner/{id}")
	public ResponseEntity<?> qbWinner(@PathVariable int id) {
		return clientService.getQbWinner(id);
	}
	
	@GetMapping("superbowl/coachWinner/{id}")
	public ResponseEntity<?> coachWinner(@PathVariable int id) {
		return clientService.getCoachWinner(id);
	}
	
	@GetMapping("superbowl/winner/{id}")
	public ResponseEntity<?> winner(@PathVariable int id) {
		return clientService.getWinner(id);
	}
	
	@GetMapping("superbowl/winningPoints/{id}")
	public ResponseEntity<?> winningPoints(@PathVariable int id) {
		return clientService.getWinningPoints(id);
	}
	
	@GetMapping("superbowl/qbLoser/{id}")
	public ResponseEntity<?> qbLoser(@PathVariable int id) {
		return clientService.getQbLoser(id);
	}
	
	@GetMapping("superbowl/coachLoser/{id}")
	public ResponseEntity<?> coachLoser(@PathVariable int id) {
		return clientService.getCoachLoser(id);
	}
	
	@GetMapping("superbowl/loser/{id}")
	public ResponseEntity<?> loser(@PathVariable int id) {
		return clientService.getLoser(id);
	}
	
	@GetMapping("superbowl/losingPoints/{id}")
	public ResponseEntity<?> losingPoints(@PathVariable int id) {
		return clientService.getLosingPoints(id);
	}
	
	@GetMapping("superbowl/mvp/{id}")
	public ResponseEntity<?> mvp(@PathVariable int id) {
		return clientService.getMvp(id);
	}
	
	@GetMapping("superbowl/stadium/{id}")
	public ResponseEntity<?> stadium(@PathVariable int id) {
		return clientService.getStadium(id);
	}
	
	@GetMapping("superbowl/city/{id}")
	public ResponseEntity<?> city(@PathVariable int id) {
		return clientService.getCity(id);
	}
	
	@GetMapping("superbowl/state/{id}")
	public ResponseEntity<?> state(@PathVariable int id) {
		return clientService.getState(id);
	}
	
	@GetMapping("superbowl/pointDifference/{id}")
	public ResponseEntity<?> pointDifference(@PathVariable int id) {
		return clientService.getPointDifference(id);
	}
	
	@GetMapping("superbowl/score/{id}")
	public ResponseEntity<?> score(@PathVariable int id) {
		return clientService.getScore(id);
	}
	
	@GetMapping("superbowl/referee/{id}")
	public ResponseEntity<?> referee(@PathVariable int id) {
		return clientService.getReferee(id);
	}
	
	@GetMapping("superbowl/umpire/{id}")
	public ResponseEntity<?> umpire(@PathVariable int id) {
		return clientService.getUmpire(id);
	}
	
}