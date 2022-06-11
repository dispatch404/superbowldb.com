package com.superbowldb.model;

public class DataViews {

	public class DateView{
		private String date;

		public DateView(String date) {
			super();
			this.date = date;
		}
		
		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}
	}
	
	public class AttendanceView{
		private int attendance;

		public AttendanceView(int attendance) {
			super();
			this.attendance = attendance;
		}

		public int getAttendance() {
			return attendance;
		}

		public void setAttendance(int attendance) {
			this.attendance = attendance;
		}
	}
	
	public class QbWinnerView{
		private String qbWinner;

		public QbWinnerView(String qbWinner) {
			super();
			this.qbWinner = qbWinner;
		}

		public String getQbWinner() {
			return qbWinner;
		}

		public void setQbWinner(String qbWinner) {
			this.qbWinner = qbWinner;
		}
	}
	
	public class CoachWinnerView{
		private String coachWinner;

		public CoachWinnerView(String coachWinner) {
			super();
			this.coachWinner = coachWinner;
		}

		public String getCoachWinner() {
			return coachWinner;
		}

		public void setCoachWinner(String coachWinner) {
			this.coachWinner = coachWinner;
		}
	}
	
	public class WinnerView{
		private String winner;

		public WinnerView(String winner) {
			super();
			this.winner = winner;
		}

		public String getWinner() {
			return winner;
		}

		public void setWinner(String winner) {
			this.winner = winner;
		}
	}
	
	public class WinningPtsView{
		private int winningPts;

		public WinningPtsView(int winningPts) {
			super();
			this.winningPts = winningPts;
		}

		public int getWinningPts() {
			return winningPts;
		}

		public void setWinningPts(int winningPts) {
			this.winningPts = winningPts;
		}
	}
	
	public class QbLoserView{
		private String qbLoser;

		public QbLoserView(String qbLoser) {
			super();
			this.qbLoser = qbLoser;
		}

		public String getQbLoser() {
			return qbLoser;
		}

		public void setQbLoser(String qbLoser) {
			this.qbLoser = qbLoser;
		}
	}
	
	public class CoachLoserView{
		private String coachLoser;

		public CoachLoserView(String coachLoser) {
			super();
			this.coachLoser = coachLoser;
		}

		public String getCoachLoser() {
			return coachLoser;
		}

		public void setCoachLoser(String coachLoser) {
			this.coachLoser = coachLoser;
		}
	}
	
	public class LoserView{
		private String loser;

		public LoserView(String loser) {
			super();
			this.loser = loser;
		}

		public String getLoser() {
			return loser;
		}

		public void setLoser(String loser) {
			this.loser = loser;
		}
	}
	
	public class LosingPtsView{
		private int losingPts;

		public LosingPtsView(int losingPts) {
			super();
			this.losingPts = losingPts;
		}

		public int getLosingPts() {
			return losingPts;
		}

		public void setLosingPts(int losingPts) {
			this.losingPts = losingPts;
		}
	}
	
	public class MvpView{
		private String mvp;

		public MvpView(String mvp) {
			super();
			this.mvp = mvp;
		}

		public String getMvp() {
			return mvp;
		}

		public void setMvp(String mvp) {
			this.mvp = mvp;
		}
	}
	
	public class StadiumView{
		private String stadium;

		public StadiumView(String stadium) {
			super();
			this.stadium = stadium;
		}

		public String getStadium() {
			return stadium;
		}

		public void setStadium(String stadium) {
			this.stadium = stadium;
		}
	}
	
	public class CityView{
		private String city;

		public CityView(String city) {
			super();
			this.city = city;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
	}
	
	public class StateView{
		private String stateView;

		public StateView(String stateView) {
			super();
			this.stateView = stateView;
		}

		public String getStateView() {
			return stateView;
		}

		public void setStateView(String stateView) {
			this.stateView = stateView;
		}
	}

	public class PointDifferenceView{
		private int pointDifference;

		public PointDifferenceView(int pointDifference) {
			super();
			this.pointDifference = pointDifference;
		}

		public int getPointDifference() {
			return pointDifference;
		}

		public void setPointDifference(int pointDifference) {
			this.pointDifference = pointDifference;
		}
	}
	
	public class RefereeView{
		private String referee;

		public RefereeView(String referee) {
			super();
			this.referee = referee;
		}

		public String getReferee() {
			return referee;
		}

		public void setReferee(String referee) {
			this.referee = referee;
		}
	}
	
	public class UmpireView{
		private String umpire;

		public UmpireView(String umpire) {
			super();
			this.umpire = umpire;
		}

		public String getUmpire() {
			return umpire;
		}

		public void setUmpire(String umpire) {
			this.umpire = umpire;
		}
	}
	
	public class ScoreView{
		private String score;

		public ScoreView(int winningPts, int losingPts) {
			this.score = "" + winningPts + " - " + losingPts; 
		}
		
		public String getScore() {
			return score;
		}

		public void setScore(String score) {
			this.score = score;
		}
	}

}
