package com.java.training.casestudy1;

import java.util.Comparator;

public class PlayerCareer implements Comparator<PlayerCareer>{
//	1. matchesPlayed - int
//	2. matchesWon - int
//	3. currentRanking - int
//	4. bestRanking - int
//	5. preferredCourt - String - can have only 1 of 4 values [Grass, Synthetic, Clay, Others] per entry.
//	6. lastFought - int - playerCode of another player against whom this player played.
	private int matchesPlayed;
	private int matchesWon;
	private int currentRanking;
	private int bestRanking;
	private String preferredCourt;
	private int lastFought;
	public PlayerCareer(int matchesPlayed, int matchesWon, int currentRanking, int bestRanking, String preferredCourt,
			int lastFought) {
		super();
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.currentRanking = currentRanking;
		this.bestRanking = bestRanking;
		this.preferredCourt = preferredCourt;
		this.lastFought = lastFought;
	}
	
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	
	public int getMatchesWon() {
		return matchesWon;
	}
	
	/**
	 * @param matchesPlayed the matchesPlayed to set
	 */
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	/**
	 * @param matchesWon the matchesWon to set
	 */
	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	/**
	 * @param currentRanking the currentRanking to set
	 */
	public void setCurrentRanking(int currentRanking) {
		this.currentRanking = currentRanking;
	}

	/**
	 * @param lastFought the lastFought to set
	 */
	public void setLastFought(int lastFought) {
		this.lastFought = lastFought;
	}

	public int getCurrentRanking() {
		return currentRanking;
	}
	
	public int getBestRanking() {
		return bestRanking;
	}
	
	public String getPreferredCourt() {
		return preferredCourt;
	}
	
	public int getLastFought() {
		return lastFought;
	}

	@Override
	public int compare( PlayerCareer p, PlayerCareer q ) {
		// TODO Auto-generated method stub
		return p.currentRanking-q.currentRanking;
	}
	
	
}
