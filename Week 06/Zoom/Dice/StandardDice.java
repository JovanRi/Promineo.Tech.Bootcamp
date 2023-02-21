package Dice;

import java.util.Random;

/**
 * A standard 6 sided die.
 */

public class StandardDice extends Dice{
	
	private static final Random random = new Random();
	public StandardDice() {
		super(6);
	}
	
	@Override
	public int roll() {
		int value = random.nextInt(getSides()) + 1;
		this.setValue(value);
		return value;
		
	}

}
