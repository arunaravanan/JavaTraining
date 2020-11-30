package com.java.training.casestudy1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TennisPlayer implements Comparable<TennisPlayer>{

	//	1. playerCode of type int
//	2. playerName of type String
//	3. careerDetail - of type PlayerCareer defined below:
	private int playerCode;
	private String playerName;
	PlayerCareer PC;
	public TennisPlayer(int playerCode, String playerName,int matchesPlayed, int matchesWon, int currentRanking, int bestRanking, String preferredCourt,
			int lastFought) {
		super();
		this.playerCode = playerCode;
		this.playerName = playerName;
		this.PC = new PlayerCareer(matchesPlayed, matchesWon, currentRanking, bestRanking, preferredCourt, lastFought);
	}
	 public   void PlayMatch(int playerCode2,ArrayList<TennisPlayer> d1) {
		 Random randomno = new Random();
		 Boolean wins= randomno.nextBoolean();
		 TennisPlayer player1 = null;
		 TennisPlayer player2 = null;
		 for (Iterator<TennisPlayer> iterator = d1.iterator(); iterator.hasNext();) {
				TennisPlayer tennisPlayer = (TennisPlayer) iterator.next();

				if (tennisPlayer.getPlayerCode() == this.playerCode) {
					player1 = tennisPlayer;
				}

			}
		 for (Iterator<TennisPlayer> iterator = d1.iterator(); iterator.hasNext();) {
				TennisPlayer tennisPlayer = (TennisPlayer) iterator.next();

				if (tennisPlayer.getPlayerCode() == playerCode2) {
					player2 = tennisPlayer;
				}

			}
		 player1.PC.setMatchesPlayed(player1.PC.getMatchesPlayed()+1);
		 player2.PC.setMatchesPlayed(player2.PC.getMatchesPlayed()+1);
		 player1.PC.setLastFought(playerCode2);
		 player2.PC.setLastFought(this.playerCode);
		 
		 
		 if(wins) {
			 player1.PC.setMatchesWon(player1.PC.getMatchesWon()+1);
			 player1.PC.setCurrentRanking(player1.PC.getCurrentRanking()-1);
			 player2.PC.setCurrentRanking(player2.PC.getCurrentRanking()+1);
			 
			 
		 }
		 else {
			 player2.PC.setMatchesWon(player2.PC.getMatchesWon()+1);
			 player2.PC.setCurrentRanking(player2.PC.getCurrentRanking()-1);
			 player1.PC.setCurrentRanking(player1.PC.getCurrentRanking()+1);
			 
		 }
			 
	 }
	
	
	public int getPlayerCode() {
		return playerCode;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public PlayerCareer getPC() {
		return PC;
	}
	@Override
	public String toString() {
		return "TennisPlayer [playerCode=" + playerCode + ", playerName=" + playerName + "]"+"PlayerCareer [matchesPlayed=" + PC.getMatchesPlayed() + ", matchesWon=" + PC.getMatchesWon() + ", currentRanking="
				+ PC.getCurrentRanking() + ", bestRanking=" + PC.getBestRanking() + ", preferredCourt=" + PC.getPreferredCourt()
				+ ", lastFought=" + PC.getLastFought() + "]";
	}

	
	@Override
	public int compareTo(TennisPlayer p) {
		
		if(this.PC.getCurrentRanking()-p.PC.getCurrentRanking()==0)
			return (this.playerName.compareTo(p.playerName));
		else
//		return (this.PC.getCurrentRanking()-p.PC.getCurrentRanking());
			return this.PC.getCurrentRanking()-(p.PC.getCurrentRanking());
	}
	

}
