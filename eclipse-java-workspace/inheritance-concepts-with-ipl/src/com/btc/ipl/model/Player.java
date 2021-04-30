package com.btc.ipl.model;

public abstract class Player implements NonIndianPlayer {

	protected String name;
	protected String team;
	
	public abstract void play();
	
	static String gameName="IPL";
	
	public Player(String name, String team) {
		
		this.name = name;
		this.team = team;
		
	}

	public static void showtGameInfo() {
		System.out.println(gameName);
	}


	public void showPlayerInfo() {
		System.out.println("Player - Name : "+this.name+" | Team : "+this.team);
	}
	
	
}
