package com.btc.ipl.model;

public class Batsman extends Player {

	float strikeRate;
	int totalRuns;
	float avg;
	
	public Batsman(String name, String team, float strikeRate, int totalRuns, float avg) {
		super(name, team);
		this.strikeRate = strikeRate;
		this.totalRuns = totalRuns;
		this.avg = avg;
	}
	
	@Override
	public void showPlayerInfo() {
		super.showPlayerInfo();
		System.out.println("As a Batsman : [strikeRate=" + strikeRate + ", totalRuns=" + totalRuns + ", avg=" + avg + "]");
	}


	
	
	@Override
	public void play() {
		System.out.println("Batting....");
	}

	@Override
	public void isNonIndianPlayer(boolean isNonIndian) {
		{
			String playerInfo=isNonIndian?"Not Indian Player":"Indian Player";
			System.out.println(playerInfo);
		}
		
	}
}