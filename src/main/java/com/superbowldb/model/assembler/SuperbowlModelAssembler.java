package com.superbowldb.model.assembler;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import com.superbowldb.model.Superbowl;
import com.superbowldb.resource.ClientResource;

@Component
public class SuperbowlModelAssembler implements RepresentationModelAssembler<Superbowl, EntityModel<Superbowl>>{

	@Override
	public EntityModel<Superbowl> toModel(Superbowl superbowl) {
		
		return EntityModel.of(superbowl,
				linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withSelfRel(),
				linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
	}
	
	public EntityModel<?> toModel(Superbowl superbowl, String route){
		
		EntityModel<?> modelEntity;
		
		switch(route) {
		case "getDate":
			modelEntity = EntityModel.of(superbowl.getDate(),
					linkTo(methodOn(ClientResource.class).date(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getAttendance":
			modelEntity = EntityModel.of(superbowl.getAttendance(),
					linkTo(methodOn(ClientResource.class).attendance(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getQbWinner":
			modelEntity = EntityModel.of(superbowl.getQbWinner(),
					linkTo(methodOn(ClientResource.class).qbWinner(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getCoachWinner":
			modelEntity = EntityModel.of(superbowl.getCoachWinner(),
					linkTo(methodOn(ClientResource.class).coachWinner(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getWinner":
			modelEntity = EntityModel.of(superbowl.getWinner(),
					linkTo(methodOn(ClientResource.class).winner(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getWinningPoints":
			modelEntity = EntityModel.of(superbowl.getWinningPts(),
					linkTo(methodOn(ClientResource.class).winningPoints(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getQbLoser":
			modelEntity = EntityModel.of(superbowl.getQbLoser(),
					linkTo(methodOn(ClientResource.class).qbLoser(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getCoachLoser":
			modelEntity = EntityModel.of(superbowl.getCoachLoser(),
					linkTo(methodOn(ClientResource.class).coachLoser(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getLoser":
			modelEntity = EntityModel.of(superbowl.getLoser(),
					linkTo(methodOn(ClientResource.class).loser(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getLosingPoints":
			modelEntity = EntityModel.of(superbowl.getLosingPts(),
					linkTo(methodOn(ClientResource.class).losingPoints(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getMvp":
			modelEntity = EntityModel.of(superbowl.getMvp(),
					linkTo(methodOn(ClientResource.class).mvp(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getStadium":
			modelEntity = EntityModel.of(superbowl.getStadium(),
					linkTo(methodOn(ClientResource.class).stadium(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getCity":
			modelEntity = EntityModel.of(superbowl.getCity(),
					linkTo(methodOn(ClientResource.class).city(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getState":
			modelEntity = EntityModel.of(superbowl.getState(),
					linkTo(methodOn(ClientResource.class).state(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getScore":
			modelEntity = EntityModel.of("" + superbowl.getWinningPts() + " - " + superbowl.getLosingPts(),
					linkTo(methodOn(ClientResource.class).score(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getPointDifference":
			modelEntity = EntityModel.of(superbowl.getPointDifference(),
					linkTo(methodOn(ClientResource.class).pointDifference(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getReferee":
			modelEntity = EntityModel.of(superbowl.getReferee(),
					linkTo(methodOn(ClientResource.class).referee(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		case "getUmpire":
			modelEntity = EntityModel.of(superbowl.getUmpire(),
					linkTo(methodOn(ClientResource.class).umpire(superbowl.getSbNumber())).withSelfRel(),
					linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl"),
					linkTo(methodOn(ClientResource.class).all()).withRel("superbowls"));
			
			break;
			
		default:
			modelEntity = null;
		}
		
		return modelEntity;
	}

}
