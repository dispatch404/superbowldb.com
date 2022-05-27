package com.superbowldb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Superbowl {
	
	@Id
	private int sbNumber;
	private String date;
	private int attendance;
	private String qbWinner;
	private String coachWinner;
	private String winner;
	private int winningPts;
	private String qbLoser;
	private String coachLoser;
	private String Loser;
	private int losingPts;
	private String mvp;
	private String stadium;
	private String city;
	private String state;
	private int pointDifference;
	private String referee;
	private String umpire;
	
	public Superbowl() {}

	public Superbowl(int sbNumber, String date, int attendance, String qbWinner, String coachWinner, String winner,
			int winningPts, String qbLoser, String coachLoser, String loser, int losingPts, String mvp, String stadium,
			String city, String state, int pointDifference, String referee, String umpire) {
		super();
		this.sbNumber = sbNumber;
		this.date = date;
		this.attendance = attendance;
		this.qbWinner = qbWinner;
		this.coachWinner = coachWinner;
		this.winner = winner;
		this.winningPts = winningPts;
		this.qbLoser = qbLoser;
		this.coachLoser = coachLoser;
		Loser = loser;
		this.losingPts = losingPts;
		this.mvp = mvp;
		this.stadium = stadium;
		this.city = city;
		this.state = state;
		this.pointDifference = pointDifference;
		this.referee = referee;
		this.umpire = umpire;
	}


	public int getSbNumber() {
		return sbNumber;
	}

	public void setSbNumber(int sbNumber) {
		this.sbNumber = sbNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public String getQbWinner() {
		return qbWinner;
	}

	public void setQbWinner(String qbWinner) {
		this.qbWinner = qbWinner;
	}

	public String getCoachWinner() {
		return coachWinner;
	}

	public void setCoachWinner(String coachWinner) {
		this.coachWinner = coachWinner;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public int getWinningPts() {
		return winningPts;
	}

	public void setWinningPts(int winningPts) {
		this.winningPts = winningPts;
	}

	public String getQbLoser() {
		return qbLoser;
	}

	public void setQbLoser(String qbLoser) {
		this.qbLoser = qbLoser;
	}

	public String getCoachLoser() {
		return coachLoser;
	}

	public void setCoachLoser(String coachLoser) {
		this.coachLoser = coachLoser;
	}

	public String getLoser() {
		return Loser;
	}

	public void setLoser(String loser) {
		Loser = loser;
	}

	public int getLosingPts() {
		return losingPts;
	}

	public void setLosingPts(int losingPts) {
		this.losingPts = losingPts;
	}

	public String getMvp() {
		return mvp;
	}

	public void setMvp(String mvp) {
		this.mvp = mvp;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPointDifference() {
		return pointDifference;
	}

	public void setPointDifference(int pointDifference) {
		this.pointDifference = pointDifference;
	}

	public String getReferee() {
		return referee;
	}

	public void setReferee(String referee) {
		this.referee = referee;
	}

	public String getUmpire() {
		return umpire;
	}

	public void setUmpire(String umpire) {
		this.umpire = umpire;
	}

	@Override
	public String toString() {
		return "superbowls [sbNumber=" + sbNumber + ", date=" + date + ", attendance=" + attendance + ", qbWinner="
				+ qbWinner + ", coachWinner=" + coachWinner + ", winner=" + winner + ", winningPts=" + winningPts
				+ ", qbLoser=" + qbLoser + ", coachLoser=" + coachLoser + ", Loser=" + Loser + ", losingPts="
				+ losingPts + ", mvp=" + mvp + ", stadium=" + stadium + ", city=" + city + ", state=" + state
				+ ", pointDifference=" + pointDifference + ", referee=" + referee + ", umpire=" + umpire + "]";
	}
	
	
	
}