package roulette;

import util.ConsoleReader;

public class RedBlack extends Bet{
	
	private static final String description = "Black or Red";
	private static final int odd = 1;
	
	public RedBlack() {
		super(description, odd);
		// TODO Auto-generated constructor stub
	}


	@Override
	boolean betIsMade(Wheel wheel) {
		// TODO Auto-generated method stub
		return wheel.getColor().equals(getChoice());
	}

	@Override
	void setChoice() {
		// TODO Auto-generated method stub
		myChoice = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		
	}

}
