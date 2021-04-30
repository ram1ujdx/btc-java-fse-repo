package com.btc.ipl;

import com.btc.ipl.model.Batsman;
import com.btc.ipl.model.Bowler;
import com.btc.ipl.model.Player;

public class IPLGame {

	public static void main(String[] args) {
		Player player;
		player=new Batsman("Rohit Sharma", "Mumbai Indians", 150.5f, 5000, 50);
		player.showPlayerInfo();
		player.play();
		player.showtGameInfo();
		player.isNonIndianPlayer(true);
		
		player=new Bowler("Harshal Patel", "RCB", 100, 8.5F, 25);
		player.showPlayerInfo();
		player.play();
		
	}
	
}
