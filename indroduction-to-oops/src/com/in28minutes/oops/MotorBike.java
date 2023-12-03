package com.in28minutes.oops;

public class MotorBike {
	
	private int speed;
	MotorBike(int speed){
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

    
	void start() {
    	System.out.println("start the engine");
	
   }
     void stop() {
	    System.out.println("Stop the bike");
   }
}
