package com.superbowldb.model.assembler;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import com.superbowldb.model.DataViews;
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
		Link singleLink = linkTo(methodOn(ClientResource.class).single(superbowl.getSbNumber())).withRel("superbowl");
		Link allLink = linkTo(methodOn(ClientResource.class).all()).withRel("superbowls");
		
		DataViews view = new DataViews();
		
		switch(route) {
		case "getDate":
			DataViews.DateView dateView  = view.new DateView(superbowl.getDate());
			modelEntity = EntityModel.of(dateView,
					linkTo(methodOn(ClientResource.class).date(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getAttendance":
			DataViews.AttendanceView attendanceView  = view.new AttendanceView(superbowl.getAttendance());
			modelEntity = EntityModel.of(attendanceView,
					linkTo(methodOn(ClientResource.class).attendance(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getQbWinner":
			DataViews.QbWinnerView qbWinnerView  = view.new QbWinnerView(superbowl.getQbWinner());
			modelEntity = EntityModel.of(qbWinnerView,
					linkTo(methodOn(ClientResource.class).qbWinner(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getCoachWinner":
			DataViews.CoachWinnerView coachWinnerView  = view.new CoachWinnerView(superbowl.getCoachWinner());
			modelEntity = EntityModel.of(coachWinnerView,
					linkTo(methodOn(ClientResource.class).coachWinner(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getWinner":
			DataViews.WinnerView winnerView  = view.new WinnerView(superbowl.getWinner());
			modelEntity = EntityModel.of(winnerView,
					linkTo(methodOn(ClientResource.class).winner(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getWinningPoints":
			DataViews.WinningPtsView winningPointsView  = view.new WinningPtsView(superbowl.getWinningPts());
			modelEntity = EntityModel.of(superbowl.getWinningPts(),
					linkTo(methodOn(ClientResource.class).winningPoints(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getQbLoser":
			DataViews.QbLoserView qbLoserView  = view.new QbLoserView(superbowl.getQbLoser());
			modelEntity = EntityModel.of(qbLoserView,
					linkTo(methodOn(ClientResource.class).qbLoser(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getCoachLoser":
			DataViews.CoachLoserView coachLoserView  = view.new CoachLoserView(superbowl.getCoachLoser());
			modelEntity = EntityModel.of(coachLoserView,
					linkTo(methodOn(ClientResource.class).coachLoser(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getLoser":
			DataViews.LoserView loserView  = view.new LoserView(superbowl.getLoser());
			modelEntity = EntityModel.of(loserView,
					linkTo(methodOn(ClientResource.class).loser(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getLosingPoints":
			DataViews.LosingPtsView losingPtsView  = view.new LosingPtsView(superbowl.getLosingPts());
			modelEntity = EntityModel.of(losingPtsView,
					linkTo(methodOn(ClientResource.class).losingPoints(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getMvp":
			DataViews.MvpView mvpView  = view.new MvpView(superbowl.getMvp());

			modelEntity = EntityModel.of(mvpView,
					linkTo(methodOn(ClientResource.class).mvp(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getStadium":
			DataViews.StadiumView stadiumView  = view.new StadiumView(superbowl.getStadium());

			modelEntity = EntityModel.of(stadiumView,
					linkTo(methodOn(ClientResource.class).stadium(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getCity":
			DataViews.CityView cityView  = view.new CityView(superbowl.getCity());

			modelEntity = EntityModel.of(cityView,
					linkTo(methodOn(ClientResource.class).city(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getState":
			DataViews.StateView stateView  = view.new StateView(superbowl.getState());

			modelEntity = EntityModel.of(stateView,
					linkTo(methodOn(ClientResource.class).state(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getScore":
			DataViews.ScoreView scoreView  = view.new ScoreView(superbowl.getWinningPts(), superbowl.getLosingPts());

			modelEntity = EntityModel.of(scoreView,
					linkTo(methodOn(ClientResource.class).score(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getPointDifference":
			DataViews.PointDifferenceView pointDifferenceView  = view.new PointDifferenceView(superbowl.getPointDifference());

			modelEntity = EntityModel.of(pointDifferenceView,
					linkTo(methodOn(ClientResource.class).pointDifference(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getReferee":
			DataViews.RefereeView refereeView  = view.new RefereeView(superbowl.getReferee());

			modelEntity = EntityModel.of(refereeView,
					linkTo(methodOn(ClientResource.class).referee(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		case "getUmpire":
			DataViews.UmpireView umpireView  = view.new UmpireView(superbowl.getUmpire());

			modelEntity = EntityModel.of(umpireView,
					linkTo(methodOn(ClientResource.class).umpire(superbowl.getSbNumber())).withSelfRel(),
					singleLink, allLink);
			
			break;
			
		default:
			modelEntity = null;
		}
		
		return modelEntity;
	}

}
