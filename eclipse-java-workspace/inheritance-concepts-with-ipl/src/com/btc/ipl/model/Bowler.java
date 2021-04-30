package com.btc.ipl.model;

public class Bowler extends Player {

	int wickets;
	float economy;
	float bowllingAvg;
	
	
	
	public Bowler(String name, String team, int wickets, float economy, float bowllingAvg) {
		super(name, team);
		this.wickets = wickets;
		this.economy = economy;
		this.bowllingAvg = bowllingAvg;
	}

	@Override
	public void showPlayerInfo() {
		super.showPlayerInfo();
		System.out.println("As a Bowler [wickets=" + wickets + ", economy=" + economy + ", bowllingAvg=" + bowllingAvg + "]");
	
	}

	@Override
	public void play() {
		System.out.println("Bowling....");
	}

	@Override
	public void isNonIndianPlayer(boolean isNonIndian) {
		
			String playerInfo=isNonIndian?"Not Indian Player":"Indian Player";
			System.out.println(playerInfo);
		}
	
	
}