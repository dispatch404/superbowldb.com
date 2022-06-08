package com.superbowldb.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.mediatype.problem.Problem;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.superbowldb.model.Superbowl;
import com.superbowldb.model.assembler.SuperbowlModelAssembler;
import com.superbowldb.repository.SuperbowlRepository;
import com.superbowldb.resource.ClientResource;

@Service
public class AdminService {
	private final SuperbowlRepository superbowlRepository;
	private final SuperbowlModelAssembler assembler;
	
	@Autowired
	AdminService(SuperbowlRepository superbowlRepository, SuperbowlModelAssembler assembler){
		this.superbowlRepository = superbowlRepository;
		this.assembler = assembler;
	}
	
	//insert multiple records
	public ResponseEntity<?> insertRecords (List<Superbowl> superbowls) {
		if(!superbowls.isEmpty()) {
			List<EntityModel<Superbowl>> entitySuperbowls = superbowlRepository.saveAll(superbowls).stream().map(assembler::toModel).collect(Collectors.toList());
			return ResponseEntity
					.created(linkTo(methodOn(ClientResource.class).all()
					).toUri())
					.body(entitySuperbowls);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.NOT_ACCEPTABLE)
					.header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
					.body(Problem.create()
							.withTitle("Not acceptable")
							.withDetail("No data found"));
		}
	}

	//insert one record
	public ResponseEntity<?> insertSingleRecord(Superbowl superbowl) {
		if(superbowl != null) {
			Superbowl newSuperbowl= superbowlRepository.save(superbowl);
			return ResponseEntity
					.created(linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber()))
					.toUri())
					.body(assembler.toModel(newSuperbowl));
		}else {
			return ResponseEntity
					.status(HttpStatus.NOT_ACCEPTABLE)
					.header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
					.body(Problem.create()
							.withTitle("Not acceptable")
							.withDetail("No data found"));
		}
		
	}
	
	//update one record
	public ResponseEntity<?> updateRecord(Superbowl superbowl){
		if(superbowl != null && superbowl.getSbNumber() > 0) {
			Superbowl newSuperbowl = superbowlRepository.findById(superbowl.getSbNumber())
												.map(sb ->{
													sb.setDate(superbowl.getDate());
													sb.setAttendance(superbowl.getAttendance());
													sb.setQbWinner(superbowl.getQbWinner());
													sb.setCoachWinner(superbowl.getCoachWinner());
													sb.setWinner(superbowl.getWinner());
													sb.setWinningPts(superbowl.getWinningPts());
													sb.setQbLoser(superbowl.getQbLoser());
													sb.setCoachLoser(superbowl.getCoachLoser());
													sb.setLoser(superbowl.getLoser());
													sb.setLosingPts(superbowl.getLosingPts());
													sb.setMvp(superbowl.getMvp());
													sb.setStadium(superbowl.getStadium());
													sb.setCity(superbowl.getCity());
													sb.setState(superbowl.getState());
													sb.setPointDifference(superbowl.getPointDifference());
													sb.setReferee(superbowl.getReferee());
													sb.setUmpire(superbowl.getUmpire());
													
													return superbowlRepository.save(sb);
												})
												.orElseGet(()->superbowlRepository.save(superbowl));

							
			return ResponseEntity
					.created(linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber()))
					.toUri())
					.body(assembler.toModel(newSuperbowl));
		}else {
			return ResponseEntity
					.status(HttpStatus.NOT_ACCEPTABLE)
					.header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
					.body(Problem.create()
							.withTitle("Not acceptable")
							.withDetail("No data found"));
		}
	}
	
	//delete a single record
	public ResponseEntity<?> deleteRecord(int id){
		 Optional<Superbowl> sb = superbowlRepository.findById(id);
		 if(sb.isPresent()) {
			 superbowlRepository.deleteById(id);
			 
			 return ResponseEntity.noContent().build();
		 }
		 else {
				return ResponseEntity
						.status(HttpStatus.NOT_ACCEPTABLE)
						.header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
						.body(Problem.create()
								.withTitle("Not acceptable")
								.withDetail("No record found with the superbowl number"));
		 }
		
	}
	
}
