package roulette;

import util.ConsoleReader;

public class HighLow extends Bet {
	
	private static final String description = "High or Low";
	private static final int odd = 1; 

	public HighLow(String description, int odds) {
		super(description, odd);
		// TODO Auto-generated constructor stub
	}

	@Override
	void setChoice() {
		// TODO Auto-generated method stub
		myChoice = "" + ConsoleReader.promptOneOf("Please bet ", "high", "low");

	}

	@Override
	boolean betIsMade(Wheel wheel) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(getChoice());

		if (myChoice.equals("high")) {
			return (num >= 19 && num <= 36);
		} else {
			return ( num >= 1 && num <= 18);
		}
	}
}
