package roulette;

import util.ConsoleReader;

public class EvenOdd extends Bet{
	
	private static final String description = "Odd or Even";
	private static final int odd = 1; 

	public EvenOdd() {
		super(description, odd);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean betIsMade(Wheel wheel) {
		// TODO Auto-generated method stub
		return (wheel.getNumber() % 2 == 0 && myChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && myChoice.equals("odd"));
	}


	@Override
	void setChoice() {
		// TODO Auto-generated method stub
		myChoice = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		
	}

}
