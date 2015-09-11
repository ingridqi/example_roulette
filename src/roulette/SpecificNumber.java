package roulette;

import util.ConsoleReader;

public class SpecificNumber extends Bet{
	
	private static final String description = "Specific number";
	private static final int odd = 1; 

	public SpecificNumber(String description, int odds) {
		super(description, odds);
	}

	@Override
	void setChoice() {
		// TODO Auto-generated method stub
		myChoice = "" + ConsoleReader.promptInt("Enter guess");
		
	}

	@Override
	boolean betIsMade(Wheel wheel) {
		// TODO Auto-generated method stub
		int start = Integer.parseInt(getChoice());
        return (start == wheel.getNumber());
	}

}
