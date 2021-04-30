package com.btc.ex;

public class Clock {

	private int hour;
	private int minutes;
	private int seconds;
	public Clock() {
		this.hour=12;
		this.minutes=0;
		this.seconds=0;
	}

	public Clock(long seconds) {
		this.hour=(int)(seconds/3600);
		this.minutes=(int)(seconds%3600)/60;
		this.seconds=(int)(seconds%3600)%60;
		
	}
	
	public Clock(int hour, int minutes, int seconds) {
		super();
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	@Override
	public String toString() {
		return "Clock - "+hour+" : "+minutes+" : "+seconds;
	}
	
	
	
	
}
