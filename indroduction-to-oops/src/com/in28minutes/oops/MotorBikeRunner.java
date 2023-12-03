package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike(200);
		MotorBike honda =  new MotorBike(100);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		ducati.start();
		honda.stop();
	}

}
