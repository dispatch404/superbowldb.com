package com.superbowldb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.superbowldb.exception.SuperbowlNotFoundException;
import com.superbowldb.model.Superbowl;
import com.superbowldb.model.assembler.SuperbowlModelAssembler;
import com.superbowldb.repository.SuperbowlRepository;


@Service
public class ClientService {
	private final SuperbowlRepository superbowlRepository;
	private final SuperbowlModelAssembler assembler;
	
	@Autowired
	ClientService(SuperbowlRepository superbowlRepository, SuperbowlModelAssembler assembler){
		this.superbowlRepository = superbowlRepository;
		this.assembler = assembler;
	}
	
	
	public ResponseEntity<?> singleSuperbowl(int id) {
		Superbowl sb = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
		
		return ResponseEntity.ok(assembler.toModel(sb));
	}
	
	public ResponseEntity<?> allSuperbowls(){
		List<EntityModel<Superbowl>> superbowls = superbowlRepository.findAll()
										.stream().map(assembler::toModel).collect(Collectors.toList());
		
		return ResponseEntity.ok(CollectionModel.of(superbowls,
				linkTo(methodOn(ClientService.class).allSuperbowls()).withSelfRel()));
	}
	
	public ResponseEntity<?> getDate(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getDate"));
	}
	
	public ResponseEntity<?> getAttendance(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getAttendance"));
	}
	
	public ResponseEntity<?> getQbWinner(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getQbWinner"));
	}
	
	public ResponseEntity<?> getCoachWinner(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getCoachWinner"));
	}
	
	public ResponseEntity<?> getWinner(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getWinner"));
	}
	
	public ResponseEntity<?> getWinningPoints(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getWinningPoints"));
	}
	
	public ResponseEntity<?> getQbLoser(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getQbLoser"));
	}
	
	public ResponseEntity<?> getCoachLoser(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getCoachLoser"));
	}
	
	public ResponseEntity<?> getLoser(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getLoser"));
	}
	
	public ResponseEntity<?> getLosingPoints(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getLosingPoints"));
	}
	
	public ResponseEntity<?> getMvp(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getMvp"));
	}
	
	public ResponseEntity<?> getStadium(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getStadium"));
	}
	
	public ResponseEntity<?> getCity(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getCity"));
	}
	
	public ResponseEntity<?> getState(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getState"));
	}
	
	
	public ResponseEntity<?> getPointDifference(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getPointDifference"));
	}
	
	public ResponseEntity<?> getScore(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getScore"));
	}
	
	public ResponseEntity<?> getReferee(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getReferee"));
	}
	
	public ResponseEntity<?> getUmpire(int id){
		Superbowl superBowl = superbowlRepository.findById(id)
				.orElseThrow(() -> new SuperbowlNotFoundException(id));
				
		return ResponseEntity.ok(assembler.toModel(superBowl, "getUmpire"));
	}
}
