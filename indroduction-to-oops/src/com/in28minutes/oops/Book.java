package com.in28minutes.oops;

public class Book {

	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public void increaseNumberOfCopies(int howMuch) {
		this.noOfCopies += howMuch;
	}
}
