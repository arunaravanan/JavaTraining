package com.java.training.casestudy1;

import java.util.*;

public class DriverClass {

	public static void main(String[] args) {
//(int playerCode, String playerName,int matchesPlayed, int matchesWon,int currentRanking, 
//		int bestRanking, int preferredCourt,8int lastFought) [Grass, Synthetic, Clay, Others]
		TennisPlayer[] p = new TennisPlayer[10];
		p[0] = new TennisPlayer(11, "Arun", 10, 3, 8, 2, "Grass", 110);
		p[1] = new TennisPlayer(12, "bala", 10, 2, 9, 4, "Snthetic", 13);
		p[2] = new TennisPlayer(13, "Jose", 10, 1, 10, 3, "Clay", 12);
		p[3] = new TennisPlayer(14, "Bharani", 10, 6, 5, 3, "Grass", 19);
		p[4] = new TennisPlayer(15, "Aaron", 10, 4, 7, 5, "Synthetic", 16);
		p[5] = new TennisPlayer(16, "Ajish", 10, 7, 4, 3, "Clay", 15);
		p[6] = new TennisPlayer(17, "Praneeth", 10, 5, 6, 3, "Grass", 18);
		p[7] = new TennisPlayer(18, "Shyam", 10, 8, 3, 2, "Synthetic", 17);
		p[8] = new TennisPlayer(19, "Subash", 10, 9, 2, 2, "Clay", 14);
		p[9] = new TennisPlayer(110, "Bavi", 10, 10, 1, 1, "Synthetic", 11);
		ArrayList<TennisPlayer> d1 = new ArrayList<TennisPlayer>();
		for (int j = 0; j < p.length; j++) {
			d1.add(p[j]);
		}
		for (TennisPlayer deets : d1)
			System.out.println(deets);

		
		p[0].PlayMatch(12, d1);//matchbw player 1 and 2
		System.out.println("Updating after executing playmatch between 11 and 12");

		for (TennisPlayer deets : d1)
			System.out.println(deets);
		DeletePlayer(13, d1);///Deleting the player with code 13
		for (TennisPlayer deets : d1)
			System.out.println(deets);
		ArrayList<TennisPlayer> d2=d1;
		System.out.println("The Sorted List according to the currentRanking if ranking is same then sorted using alphetic order of name");
		Collections.sort(d2);
		for (TennisPlayer deets : d2)
			System.out.println(deets);
	}

	private static void DeletePlayer(int i, ArrayList<TennisPlayer> d1) {

		TennisPlayer temp = null;
		Boolean err = true;
		for (Iterator<TennisPlayer> iterator = d1.iterator(); iterator.hasNext();) {
			TennisPlayer tennisPlayer = (TennisPlayer) iterator.next();

			if (tennisPlayer.getPlayerCode() == i) {
				temp = tennisPlayer;
				err = false;
			}

		}
		d1.remove(temp);
		if (!err)
			System.out.println("Deleted Successfully");
		try {
			if (err)
				throw new NotFoundException("Not Found");
		} catch (NotFoundException e) {
			System.out.println(e);
		}

	}

}
