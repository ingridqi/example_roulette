package roulette;

import util.ConsoleReader;

public class ThreeRow extends Bet{
	private static final String description = "Three in a Row";
	private static final int odd = 11; 
	

	public ThreeRow() {
		super(description, odd);
		// TODO Auto-generated constructor stub
	}



	@Override
	boolean betIsMade(Wheel wheel) {
		// TODO Auto-generated method stub
		int start = Integer.parseInt(getChoice());
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}



	@Override
	void setChoice() {
		// TODO Auto-generated method stub
		myChoice = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
	            1, Wheel.NUM_SPOTS - 3);
		
	}



}
